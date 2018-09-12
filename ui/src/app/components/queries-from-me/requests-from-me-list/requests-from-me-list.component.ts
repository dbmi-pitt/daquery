import { Component, OnInit, EventEmitter, Output, Input, SimpleChange } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { ResponseService } from '../../../services/response.service';
import { Observable } from 'rxjs/Observable';
import { environment } from '../../../../environments/environment';
import { MapValuesPipe } from '../../../pipes/iteratable.pipe';
import { Router } from '@angular/router';

@Component({
  selector: 'app-requests-from-me-list',
  templateUrl: './requests-from-me-list.component.html',
  styleUrls: ['./requests-from-me-list.component.css']
})
export class RequestsFromMeListComponent implements OnInit {

  requests: any[];
  inquiries: any[];
  requestGroups: Map<String, any[]> = new Map<String, any[]>();

  constructor(private requestService: RequestService,
              private responseService: ResponseService,
              private router : Router) { 
  }

  notifyMe() {
    this.getRequestsFromMe();
  }

  ngOnInit() {
    this.getRequestsFromMe();
  }

  getRequestsFromMe() {
    this.requestService.getRequestsFromMe()
                       .subscribe((requests) => {
                         let self = this;
                         this.requests = requests;
                         this.requestGroups = new Map<String, any[]>();
                         this.requests.forEach((request) => {
                           if(self.requestGroups.has(request.requestGroup)){
                             self.requestGroups.get(request.requestGroup).push(request);
                           } else {
                             self.requestGroups.set(request.requestGroup, []);
                             self.requestGroups.get(request.requestGroup).push(request);
                           }
                         });

                         this.requests.forEach((request) => {
                          let response = request.responses[0];
                          if(response && !['ERROR', 'COMPLETED', 'STALLED', 'DENIED'].includes(response.status)){
                             let subscription = Observable.interval(1000 * environment.responseCheckIntervalInSecond).subscribe(x => {
                               this.responseService.getResponse(response.responseId)
                                                   .subscribe(res => {
                                                     response.status = res.status;
                                                     response.errorMessage = res.errorMessage;
                                                     response.value = res.value;
                                                     response.statusMessage = res.statusMessage;
                                                     response.files = res.files;
                                                     if(['ERROR', 'COMPLETED', 'STALLED', 'DENIED'].includes(response.status)){
                                                       subscription.unsubscribe();
                                                     }
                                                   },
                                                  error => {
                                                    response.hasError = true;
                                                    subscription.unsubscribe();
                                                  },
                                                  () => {
                                                    if(!this.router.url.includes("queries-from-me"))
                                                      subscription.unsubscribe();
                                                  });
                             })
                          }
                        });
                        });
  }

  getSavedInquiries(){
    this.requestService.getSavedInquiries()
                       .subscribe(inquiries => this.inquiries = inquiries);
  }

  createRequestStatusSummary(query: any): string{
    let ret = "";
    let sum = {};
    query.responses.map(response => sum[response.status] ? sum[response.status] += 1 : sum[response.status] = 1);

    Object.keys(sum).forEach((key, index) => {
      ret += key + ": " + sum[key] + (index === Object.keys(sum).length - 1 ? "" : " | ");
    });

    return ret;
  }

  requestData(request: any) {
    if(confirm("Do you want to request this data?")){
      let dataRequest = {
        requestSite: {
          siteId: request.requestSite.siteId,
          name: request.requestSite.name
        },
        network: {
          networkId: request.network.networkId
        },
        requestGroup: request.requestGroup + ":DataRequest",
        inquiry: {
          version: 1,
          dataType: 'SQL_DOWNLOAD',
          inquiryId: request.responses[0].downloadDirective ? request.responses[0].downloadDirective.inquiryId : '',
          queryType: 'DATA',
          inquiryName: request.inquiry.inquiryName + "(Case Export)",
          inquiryDescription: request.inquiry.inquiryDescription,
          code: request.responses[0].downloadDirective ? request.responses[0].downloadDirective.code : ''
        }
      };
      this.requestService.requestData(dataRequest)
                        .subscribe(() => {
                            this.getRequestsFromMe();
                        });
    }
  }

  getRequestResult(response: any){
    if(!response) return '';
    if(response.status === 'ERROR'){
      return response.errorMessage;
    } else {
      if (response.value) {
        return response.value;
      } else{
        return response.statusMessage;
      }
    }
  }

  getFilePaths(response: any){
    if(response.files){
      return response.files.filepaths.join('\n');
    }
  }
}
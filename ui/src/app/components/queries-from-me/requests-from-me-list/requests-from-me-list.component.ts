import { Component, OnInit, EventEmitter, Output, Input, SimpleChange } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { ResponseService } from '../../../services/response.service';
import { Observable } from 'rxjs/Observable';
import { forEach } from '@angular/router/src/utils/collection';
import { environment } from '../../../../environments/environment';
import { MapValuesPipe } from '../../../pipes/iteratable.pipe';
import { Router } from '@angular/router';

@Component({
  selector: 'app-requests-from-me-list',
  templateUrl: './requests-from-me-list.component.html',
  styleUrls: ['./requests-from-me-list.component.css']
})
export class RequestsFromMeListComponent implements OnInit {

  @Output()
  editInquiry = new EventEmitter<any>();

  requests: any[];
  inquiries: any[];
  requestGroups: Map<String, any[]> = new Map<String, any[]>();

  constructor(private requestService: RequestService,
              private responseService: ResponseService,
              private router : Router) { 
  }

  notifyMe() {
    this.getRequestsFromMe();
    this.getSavedInquiries();
  }

  ngOnInit() {
    this.getRequestsFromMe();
    this.getSavedInquiries();
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
                          if(response && !['ERROR', 'COMPLETED', 'STALLED'].includes(response.status)){
                             let subscription = Observable.interval(1000 * environment.responseCheckIntervalInSecond).subscribe(x => {
                               this.responseService.getResponse(response.responseId)
                                                   .subscribe(res => {
                                                     response.status = res.status;
                                                     response.value = res.value;
                                                     if(['ERROR', 'COMPLETED', 'STALLED'].includes(response.status)){
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

  onEditClick(inquiry: any){
    this.editInquiry.emit(inquiry);
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
}
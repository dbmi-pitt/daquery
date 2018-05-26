import { Component, OnInit, EventEmitter, Input, Output } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { Observable } from 'rxjs/Observable';
import { UserService } from 'app/services/user.service';
import { environment } from '../../../../environments/environment';
import { ResponseService } from '../../../services/response.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-recent-query',
  templateUrl: './recent-query.component.html',
  styleUrls: ['./recent-query.component.css']
})
export class RecentQueryComponent implements OnInit {

  requests: any[];
  @Output() requestSent: EventEmitter<any[]> = new EventEmitter<any[]>();

  constructor(private requestService: RequestService,
              private userService: UserService,
              private responseService: ResponseService,
              private router : Router) { }

  ngOnInit() {
  }

  notifyMe(requests: any[]) {
    this.requests = requests;
    requests.forEach((request) => {
      this.requestService.sendRequest(request, false)
                         .subscribe(response => {
                          request['response'] = response;
                          if(response && !['ERROR', 'COMPLETED', 'STALLED'].includes(response.status)){
                            let subscription = Observable.interval(1000 * environment.responseCheckIntervalInSecond).subscribe(x => {
                              this.responseService.getResponse(response.responseId)
                                                  .subscribe(res => {
                                                    response.status = res.status;
                                                    response.errorMessage = res.errorMessage;
                                                    response.value = res.value;
                                                    response.downloadAvailable = res.downloadAvailable;
                                                    response.downloadDirective = res.downloadDirective;
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
                         }, error => {
                           request['error'] = error;
                           return Observable.throw(error);
                         });
    });
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
          inquiryId: request.response.downloadDirective ? request.response.downloadDirective.inquiryId : '',
          aggregate: false,
          inquiryName: request.inquiry.inquiryName + "(Data)",
          inquiryDescription: request.inquiry.inquiryDescription,
          code: request.response.downloadDirective ? request.response.downloadDirective.code : ''
        }
      };
      this.requestService.requestData(dataRequest)
                        .subscribe(() => {
                            this.requestSent.emit();
                            this.requests = null;
                        });
    }
  }
}

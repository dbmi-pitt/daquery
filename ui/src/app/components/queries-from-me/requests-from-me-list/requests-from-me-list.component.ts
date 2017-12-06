import { Component, OnInit,  EventEmitter, Output } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { Observable } from 'rxjs/Observable';
import { forEach } from '@angular/router/src/utils/collection';
import { environment } from '../../../../environments/environment';
import { MapValuesPipe } from '../../../pipes/Iteratable.pipe';

@Component({
  selector: 'app-requests-from-me-list',
  templateUrl: './requests-from-me-list.component.html',
  styleUrls: ['./requests-from-me-list.component.css']
})
export class RequestsFromMeListComponent implements OnInit {

  @Output()
  editInquiry = new EventEmitter<any>();

  requests: any[];
  inquires: any[];
  requestGroups: Map<String, any[]>;
  constructor(private requestService: RequestService) { 
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
                             if(!['ERROR', 'COMPLETED'].includes(request.responses[0].status)){
                                let subscription = Observable.interval(1000 * environment.responseCheckIntervalInSecond).subscribe(x => {
                                  console.log("calling " + request.response.id );
                                  // if reutrn status in ['ERROR', 'COMPLETED'], stop interval
                                  subscription.unsubscribe();
                                  console.log("unsubscribed");
                                })
                             }
                           } else {
                             self.requestGroups.set(request.requestGroup, []);
                             self.requestGroups.get(request.requestGroup).push(request);
                             if(!['ERROR', 'COMPLETED'].includes(request.responses[0].status)){
                              let subscription = Observable.interval(1000 * environment.responseCheckIntervalInSecond).subscribe(x => {
                                console.log("calling " + request.response.id );
                                // if reutrn status in ['ERROR', 'COMPLETED'], stop interval
                                subscription.unsubscribe();
                                console.log("unsubscribed");
                              })
                           }
                           }
                         });
                        });
    //this.requestGroups = new Map([["1111", [0, 1]], ["2222", [1,2]]]);
    // this.requestGroups.set("11111", []);
    // this.requestGroups.get("11111").push([1,2,3]);
  }

  getSavedInquiries(){
    this.requestService.getSavedInquires()
                       .subscribe(inquires => this.inquires = inquires);
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
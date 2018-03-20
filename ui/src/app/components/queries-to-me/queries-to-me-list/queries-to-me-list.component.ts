import { Component, OnInit } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { QueryToMe } from '../../../models/query-to-me.model';

import { Observable } from 'rxjs/Observable';

declare var $:any;

@Component({
  selector: 'app-queries-to-me-list',
  templateUrl: './queries-to-me-list.component.html',
  styleUrls: ['./queries-to-me-list.component.css']
})
export class QueriesToMeListComponent implements OnInit {

  requests: any[];
  selectedRequest: any;
  constructor(private requestService: RequestService) {

  }

  ngOnInit() {
    this.getRequestsToMe();
  }

  getRequestsToMe() {
    this.requestService.getRequestsToMe()
                       .subscribe(requests => {
                         this.requests = requests;
                       });
  }

  onRequestSelect(request: any){
    this.selectedRequest = request;
    $('#tb').DataTable();
  }

  getRequestStatusLabelClass(request: any){
    switch(request.responses[0].status.toUpperCase()) {
      case "COMPLETED":
        return "bg-green";
      case "ERROR":
        return "bg-red";
      case "PENDING":
        return "bg-yellow";
      case "DENIED":
        return "bg-gray";
      default:
        return "bg-gray";
    }
  }

  approveRequest(){
    if(confirm("Are you sure to approve this request?")){
    this.requestService.approveDataRequest(this.selectedRequest.requestId)
                       .subscribe(res => {
                          this.selectedRequest.responses[0] = res;
                       });
    }
  }

  denyRequest(){
    if(confirm("Are you sure to deny this request?")){
      this.requestService.denyDataRequest(this.selectedRequest.requestId)
                        .subscribe(res => {
                          this.selectedRequest.responses[0] = res;
                        });
    }
  }
}

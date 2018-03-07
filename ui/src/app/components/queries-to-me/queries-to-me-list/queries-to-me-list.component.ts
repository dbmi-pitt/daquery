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

  requests: QueryToMe[];
  selectedRequest: QueryToMe;
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
      default:
        return "bg-grey";
    }
  }
}

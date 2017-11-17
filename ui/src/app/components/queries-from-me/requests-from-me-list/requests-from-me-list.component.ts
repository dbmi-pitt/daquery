import { Component, OnInit,  EventEmitter, Output } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { Observable } from 'rxjs/Observable';

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
  constructor(private requestService: RequestService) { 
  }

  ngOnInit() {
    this.getRequestsFromMe();
    this.getSavedInquiries();
  }

  getRequestsFromMe() {
    this.requestService.getRequestsFromMe()
                       .subscribe(requests => this.requests = requests);
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

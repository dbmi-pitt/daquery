import { Component, OnInit, EventEmitter, Output, Input, SimpleChange } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { ResponseService } from '../../../services/response.service';
import { Observable } from 'rxjs/Observable';
import { environment } from '../../../../environments/environment';
import { MapValuesPipe } from '../../../pipes/iteratable.pipe';
import { Router } from '@angular/router';

@Component({
  selector: 'app-saved-queries',
  templateUrl: './saved-queries.component.html',
  styleUrls: ['./saved-queries.component.css']
})
export class SavedQueriesComponent implements OnInit {

  @Output()
  editInquiry = new EventEmitter<any>();
  inquiries: any[];

  constructor(private requestService: RequestService,
              private responseService: ResponseService,
              private router : Router) { }

  ngOnInit() {
    this.getSavedInquiries();
  }

  getSavedInquiries(){
    this.requestService.getSavedInquiries()
                       .subscribe(inquiries => this.inquiries = inquiries);
  }

  onEditClick(inquiry: any){
    this.editInquiry.emit(inquiry);
  }

  onDeleteClick(inquiry: any){
    if(confirm("Are you sure to delete this inquiry?")){
      this.requestService.deleteInquiry(inquiry.inquiryId)
                         .subscribe(res => {
                            if(res === 200){
                              this.inquiries = this.inquiries.filter(i => i.inquiryId != inquiry.inquiryId);
                            }
                         })
    }
  }

  notifyMe() {
    this.getSavedInquiries();
  }
}

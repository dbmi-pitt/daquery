import { Component, OnInit } from '@angular/core';
import { DaqueryService } from '../../services/daquery.service';

@Component({
  selector: 'app-queries-from-me',
  templateUrl: './queries-from-me.component.html',
  styleUrls: ['./queries-from-me.component.css']
})
export class QueriesFromMeComponent implements OnInit {
  showNewQuery = false;
  editingInquiry: any;
  requestSent: boolean;

  constructor(private daqueryService: DaqueryService) { }

  ngOnInit() {
  }

  editInquiry(inquiry: any){
    this.editingInquiry = inquiry;
    this.showNewQuery = true;
  }

  getError() {
    console.log("getting error");
    this.daqueryService.getError()
                       .subscribe(() => {
                          console.log("should not get to here");
                       });
  }

  onRequestSent(value: boolean) {
    this.requestSent = value;
    if(this.requestSent){
      this.showNewQuery = false;
    }
  }
}

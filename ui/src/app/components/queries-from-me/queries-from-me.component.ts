import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-queries-from-me',
  templateUrl: './queries-from-me.component.html',
  styleUrls: ['./queries-from-me.component.css']
})
export class QueriesFromMeComponent implements OnInit {
  showNewQuery = false;
  editingInquiry: any;
  constructor() { }

  ngOnInit() {
  }

  editInquiry(inquiry: any){
    this.editingInquiry = inquiry;
    this.showNewQuery = true;
  }
}

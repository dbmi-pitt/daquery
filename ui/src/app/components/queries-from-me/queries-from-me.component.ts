import { Component, OnInit, ViewChild } from '@angular/core';
import { DaqueryService } from '../../services/daquery.service';
import { RequestsFromMeListComponent } from './requests-from-me-list/requests-from-me-list.component';
import { RecentQueryComponent } from 'app/components/queries-from-me/recent-query/recent-query.component';
import { SavedQueriesComponent } from './saved-queries/saved-queries.component'

@Component({
  selector: 'app-queries-from-me',
  templateUrl: './queries-from-me.component.html',
  styleUrls: ['./queries-from-me.component.css']
})
export class QueriesFromMeComponent implements OnInit {
  showNewQuery = false;
  editingInquiry: any;

  @ViewChild(RequestsFromMeListComponent) public requestsFromMeList: RequestsFromMeListComponent;
  @ViewChild(RecentQueryComponent) public recentQuery: RecentQueryComponent;
  @ViewChild(SavedQueriesComponent) public saveQueries: SavedQueriesComponent;

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
    this.showNewQuery = false;
    this.requestsFromMeList.notifyMe();
    this.saveQueries.notifyMe();
  }

  onRequests(value: any[]) {
    this.showNewQuery = false;
    this.recentQuery.notifyMe(value);
  }
}

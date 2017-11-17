import { Component, OnInit } from '@angular/core';
import { RequestService } from '../../../services/request.service';
import { QueryToMe } from '../../../models/query-to-me.model';

import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-queries-to-me-list',
  templateUrl: './queries-to-me-list.component.html',
  styleUrls: ['./queries-to-me-list.component.css']
})
export class QueriesToMeListComponent implements OnInit {

  requests: QueryToMe[];
  constructor(private requestService: RequestService) {

  }

  ngOnInit() {
    this.getRequestsToMe();
  }

  getRequestsToMe() {
    this.requestService.getRequestsToMe()
                       .subscribe(requests => this.requests = requests);
  }
}

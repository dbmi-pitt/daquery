import { Component, OnInit } from '@angular/core';
import { QueryService } from '../../../services/query.service';
import { QueryToMe } from '../../../models/query-to-me.model';

import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-queries-to-me-list',
  templateUrl: './queries-to-me-list.component.html',
  styleUrls: ['./queries-to-me-list.component.css']
})
export class QueriesToMeListComponent implements OnInit {

  queries: QueryToMe[];
  constructor(private queryService: QueryService) {

  }

  ngOnInit() {
    this.getQueriesToMe();
  }

  getQueriesToMe() {
    this.queryService.getQueriesToMe()
                     .subscribe(queries => this.queries = queries);
  }
}

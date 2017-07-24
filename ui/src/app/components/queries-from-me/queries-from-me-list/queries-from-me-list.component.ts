import { Component, OnInit } from '@angular/core';
import { QueryService } from '../../../services/query.service';
import { QueryFromMe } from '../../../models/query-from-me.model';

import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-queries-from-me-list',
  templateUrl: './queries-from-me-list.component.html',
  styleUrls: ['./queries-from-me-list.component.css']
})
export class QueriesFromMeListComponent implements OnInit {

  queries: QueryFromMe[];
  constructor(private queryService: QueryService) { 
  }

  ngOnInit() {
    this.getQueriesFromMe();
  }

  getQueriesFromMe() {
    this.queryService.getQueriesFromMe()
                     .subscribe(queries => this.queries = queries);
  }

  createQueryStatusSummary(query: any): string{
    let ret = "";
    let sum = {};
    query.responses.map(response => sum[response.status] ? sum[response.status] += 1 : sum[response.status] = 1);

    Object.keys(sum).forEach((key, index) => {
      ret += key + ": " + sum[key] + (index === Object.keys(sum).length - 1 ? "" : " | ");
    });

    return ret;
  }

}

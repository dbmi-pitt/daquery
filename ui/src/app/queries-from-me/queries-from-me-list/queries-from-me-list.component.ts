import { Component, OnInit } from '@angular/core';
import { QueryService } from '../../shared/query.service';

@Component({
  selector: 'app-queries-from-me-list',
  templateUrl: './queries-from-me-list.component.html',
  styleUrls: ['./queries-from-me-list.component.css']
})
export class QueriesFromMeListComponent implements OnInit {

  queries: any[] = [];
  constructor(private queryService: QueryService) { 
    this.queries = this.queryService.getQueriesFromMe();
  }

  ngOnInit() {
  }

  createQueryStatusSummary(query: any): string{
    let ret = "";
    let sum = {};
    query.responses.map(response => sum[response.status] ? sum[response.status] += 1 : sum[response.status] = 1);

    Object.keys(sum).forEach((key, index) => {
      console.log(key);
      console.log(sum[key]);
      ret += key + ": " + sum[key] + (index === Object.keys(sum).length - 1 ? "" : " | ");
    });

    return ret;
  }

}

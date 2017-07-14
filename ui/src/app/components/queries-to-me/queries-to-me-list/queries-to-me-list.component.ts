import { Component, OnInit } from '@angular/core';
import { QueryService } from '../../../services/query.service';

@Component({
  selector: 'app-queries-to-me-list',
  templateUrl: './queries-to-me-list.component.html',
  styleUrls: ['./queries-to-me-list.component.css']
})
export class QueriesToMeListComponent implements OnInit {

  queries: any[] = [];
  constructor(private queryService: QueryService) {
  	this.queries = this.queryService.getQueriesToMe();
  }

  ngOnInit() {
  }

}

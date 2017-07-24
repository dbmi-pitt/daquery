import { Component, OnInit } from '@angular/core';
import { QueryService } from '../../../services/query.service';
import { QueryToMe } from '../../../models/query-to-me.model';
import { ActivatedRoute, Params } from '@angular/router';

import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-review-query',
  templateUrl: './review-query.component.html',
  styleUrls: ['./review-query.component.css']
})
export class ReviewQueryComponent implements OnInit {

  query: QueryToMe = new QueryToMe();
  constructor(private queryService: QueryService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    // subscribe to router event
    this.activatedRoute.params.subscribe((params: Params) => {
      let id = params['id'];
      this.getQueryToMe(id);
    });
  }

  getQueryToMe(id: number) {
    this.queryService.getQueryToMe(id)
                     .subscribe(query => this.query = query);
  }
}

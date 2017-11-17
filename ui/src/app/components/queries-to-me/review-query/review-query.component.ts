import { Component, OnInit } from '@angular/core';
import { RequestService } from '../../../services/request.service';
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
  constructor(private requestService: RequestService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    // subscribe to router event
    this.activatedRoute.params.subscribe((params: Params) => {
      let id = params['id'];
      this.getQueryToMe(id);
    });
  }

  getQueryToMe(id: number) {
    this.requestService.getQueryToMe(id)
                     .subscribe(query => this.query = query);
  }
}

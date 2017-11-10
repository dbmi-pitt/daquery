import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { QueryFromMe } from '../models/query-from-me.model';
import { QueryToMe } from '../models/query-to-me.model';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class QueryService {

  constructor(private http: HttpClient) { }

  queriesToMe = [];
  queriesFromMe = [];
  getQueriesToMe(): Observable<QueryToMe[]> {
    //return this.queriesToMe = QUERIES_TO_ME.slice(0);
    return this.http.get('/daquery/ws/queries-to-me')
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getQueryToMe(id: number){
    //return QUERIES_TO_ME.slice(0).find(query => query.id === id);
    return this.http.get(`/daquery/ws/query-to-me/${id}`)
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getQueriesFromMe(): Observable<QueryFromMe[]> {
    return this.http.get('/daquery/ws/queries-from-me')
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  private jwt() {
    // create authorization header with jwt token
    // let currentUser = JSON.parse(localStorage.getItem('currentUser'));
    // if (currentUser && currentUser.token) {
    //   let headers = new Headers({ 'Authorization': 'Bearer ' + currentUser.token });
    //   return new RequestOptions({ headers: headers });
    // }
  }
}


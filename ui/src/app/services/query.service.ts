import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { QueryFromMe } from '../models/query-from-me.model';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class QueryService {

  constructor(private http: Http) { }

  queriesToMe = [];
  queriesFromMe = [];
  getQueriesToMe() {
    return this.queriesToMe = QUERIES_TO_ME.slice(0);
  }

  getQueryToMe(id: number){
    return QUERIES_TO_ME.slice(0).find(query => query.id === id);
  }

  getQueriesFromMe(): Observable<QueryFromMe[]> {
    // return this.queriesFromMe = QUERIES_FROM_ME.slice(0);
    return this.http.get('/daquery/ws/queries-from-me', this.jwt())
                    .map((response: Response) => <QueryFromMe[]>response.json())
                    .catch(error => {
                      console.log("here");
                      console.error(error);
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  private jwt() {
    // create authorization header with jwt token
    let currentUser = JSON.parse(localStorage.getItem('currentUser'));
    if (currentUser && currentUser.token) {
      let headers = new Headers({ 'Authorization': 'Bearer ' + currentUser.token });
      return new RequestOptions({ headers: headers });
    }
  }
}

const QUERIES_TO_ME = [
  {"id" : 1, "studyName": "Diabetes", "name": "Query 1", "type": "Data", "site": "PITT", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending"},
  {"id" : 2, "studyName": "Diabetes", "name": "Query 2", "type": "Data", "site": "JSH", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "done"},
  {"id" : 3, "studyName": "Diabetes", "name": "Query 3", "type": "Aggregate", "site": "Utah", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "processing"},
  {"id" : 4, "studyName": "Diabetes", "name": "Query 4", "type": "Data", "site": "PITT", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending"},
  {"id" : 5, "studyName": "Diabetes", "name": "Query 5", "type": "Aggregate", "site": "Temple", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "done"},
  {"id" : 6, "studyName": "Diabetes", "name": "Query 6", "type": "Data", "site": "PSU", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "done"},
  {"id" : 7, "studyName": "Diabetes", "name": "Query 7", "type": "Aggregate", "site": "Geisinger", "username": "desheng", "datetime": "2017-07-01T18:25:42.123Z", "status": "pending"}
]

// const QUERIES_FROM_ME = [
//   {"id" : 1, "name": "Query 1", "type": "Data", "datetime": "2017-07-01T18:25:42.123Z",
//    "responses": [{
//      "id": 1,
//      "site": "PITT",
//      "status": "pending",
//      "result": NaN
//    },
//    {
//      "id": 2,
//      "site": "JHU",
//      "status": "pending",
//      "result": NaN
//    },
//    {
//      "id": 3,
//      "site": "Utah",
//      "status": "done",
//      "result": "Download Data"
//    },
//    {
//      "id": 4,
//      "site": "PSU",
//      "status": "processing",
//      "result": NaN
//    },
//    ]
//   },
//   {"id" : 2, "name": "Query 2", "type": "Aggregate", "datetime": "2017-07-01T18:25:42.123Z",
//    "responses": [{
//      "id": 1,
//      "site": "PITT",
//      "status": "pending",
//      "result": NaN
//    },
//    {
//      "id": 2,
//      "site": "JHU",
//      "status": "done",
//      "result": 44
//    },
//    {
//      "id": 3,
//      "site": "Utah",
//      "status": "done",
//      "result": 122
//    },
//    {
//      "id": 4,
//      "site": "PSU",
//      "status": "processing",
//      "result": NaN
//    },
//    ]
//   },
// ]

import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Error } from '../_globals/error';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class RequestService {

  constructor(private http: HttpClient,
              private error: Error) { }

  queriesToMe = [];
  queriesFromMe = [];
  getRequestsToMe(): Observable<any[]> {
    return this.http.get('/daquery/ws/requests?direction=IN-OUT')
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getQueryToMe(id: number){
    //return QUERIES_TO_ME.slice(0).find(query => query.id === id);
    return this.http.get(`/daquery/ws/query-to-me/${id}`)
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getRequestsFromMe(): Observable<any[]> {
    return this.http.get('/daquery/ws/requests?direction=OUT|IN-OUT')
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getSavedInquiries(): Observable<any[]> {
    return this.http.get('/daquery/ws/inquiries')
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });

    // const inquires = [
    //   {'id': 3,
    //    'inquiry_id': '33333333-61ad-44eb-8eef-886adcced18e',
    //    'version': 1,
    //    'inquiry_type': 'SQL',
    //    'AUTHOR_ID': '33333333-61ad-44eb-aaaa-886adcced18e',
    //    'network': {
    //      'id': 1,
    //      'name': 'devALL'
    //    }
    //   },
    //   {'id': 4,
    //   'inquiry_id': '44444444-61ad-44eb-8eef-886adcced18e',
    //   'version': 1,
    //   'inquiry_type': 'SQL',
    //   'AUTHOR_ID': '44444444-61ad-44eb-aaaa-886adcced18e',
    //   'network': {
    //     'id': 1,
    //     'name': 'devALL'
    //   }
    //  }
    // ];

    // return Observable.of(inquires);
  }

  saveInquires(inquiry: any) {
    return this.http.post('/daquery/ws/inquiries', inquiry)
                    .catch(error => {
                        this.error.message = error.message;
                        return Observable.throw(error || 'Server error');
                    });
  }

  sendRequest(inquiry: any) {
    return this.http.post('/daquery/ws/request', inquiry)
                    .catch(error => {
                        this.error.message = error.message;
                        return Observable.throw(error || 'Server error');
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


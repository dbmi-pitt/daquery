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
    return this.http.get('/daquery/ws/requests?direction=IN!IN-OUT')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getQueryToMe(id: number){
    //return QUERIES_TO_ME.slice(0).find(query => query.id === id);
    return this.http.get(`/daquery/ws/query-to-me/${id}`)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getRequestsFromMe(): Observable<any[]> {
    return this.http.get('/daquery/ws/requests?direction=OUT!IN-OUT')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getSavedInquiries(): Observable<any[]> {
    return this.http.get('/daquery/ws/inquiries')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  saveInquires(inquiry: any) {
    return this.http.post('/daquery/ws/inquiries', inquiry)
                    .catch(error => {
                        this.error.error = error;
                        return Observable.throw(error || 'Server error');
                    });
  }

  updateInquiry(id: string, inquiry: any){
    return this.http.put(`/daquery/ws/inquiries/${id}`, inquiry)
                    .catch(error => {
                        this.error.error = error;
                        return Observable.throw(error || 'Server error');
                    });
  }

  sendRequest(inquiry: any, showError: boolean) {
    return this.http.post('/daquery/ws/request', inquiry)
                    .catch(error => {
                        if(showError) this.error.error = error;
                        return Observable.throw(error || 'Server error');
                    });
  }

  requestData(request: any){
    return this.http.post('daquery/ws/request', request)
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    })
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


import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Error } from '../_globals/error';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class ResponseService {

  constructor(private http: HttpClient,
              private error: Error) { }

  getResponse(responseId: String) {
    return this.http.get('/daquery/ws/response/' + responseId)
                    .catch(error => {
                      //this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

}

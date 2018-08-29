import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from 'rxjs/Observable';
import { AuthenticationService } from './authentication.service';
import { Error } from '../_globals/error';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class DaqueryService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService,
              private error: Error) { }

  getAlias(): Observable<any> {
    return this.http.get('/daquery/ws/sites/getKeystoreAliases',)
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    })
  }

  getError(): Observable<any> {
    return this.http.get('/daquery/ws/error')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getAppConfig() {
    return this.http.get('/daquery/ws/properties')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }

  updateAppConfig(properties: any) {
    return this.http.put('/daquery/ws/properties', properties)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }

  getVersion() {
    return this.http.get('/daquery/ws/display-version', {responseType: 'text'})
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  checkServer() {
    return this.http.get('/daquery/ws/display-version', {responseType: 'text'})
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  systemUpdate(){
    return this.http.get('/daquery/ws/system-update')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }
}

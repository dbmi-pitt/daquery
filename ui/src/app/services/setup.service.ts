import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response, URLSearchParams } from '@angular/http';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from 'rxjs/Observable';
import { AuthenticationService } from './authentication.service';

@Injectable()
export class SetupService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService) { }

  getSetup(): Observable<string> {
    return this.http.get('/daquery/ws/is-site-setup', {responseType: 'text'})
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  setupSite(setupForm: any) {
    const params = new HttpParams().set('site-name', setupForm.sitename)
                                   .set('site-key', setupForm.sitekey)
                                   .set('admin-email', setupForm.adminemail)
                                   .set('admin-pwd', setupForm.adminpwd)
                                   .set('admin-real-name', setupForm.adminrealname);
    return this.http.get('/daquery/ws/setupSite', {params: params})
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  getKeyStore(): Observable<boolean> {
    return this.http.get('/daquery/ws/keystore')
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  setKeyType(keytype: string) {
    return this.http.post('/daquery/ws/keytype', keytype, this.authenticationService.jwt())
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }
}

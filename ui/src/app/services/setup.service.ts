import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { AuthenticationService } from './authentication.service';

@Injectable()
export class SetupService {

  constructor(private http: Http,
              private authenticationService: AuthenticationService) { }

  getSetup(): Observable<boolean> {
    return this.http.get('/daquery/ws/setup')
                    .map((response: Response) => response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    })
  }

  getKeyStore(): Observable<boolean> {
    return this.http.get('/daquery/ws/keystore')
                    .map((response: Response) => response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    })
  }

  setKeyType(keytype: string) {
    return this.http.post('/daquery/ws/keytype', keytype, this.authenticationService.jwt())
                    .map((response: Response) => response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    })
  }
}

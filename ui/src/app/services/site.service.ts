import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { Site } from '../models/site.model';
import { AuthenticationService } from './authentication.service';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class SiteService {

  constructor(private http: Http,
              private authenticationService: AuthenticationService) { }

  sites = [];
  getSites(): Observable<Site[]> {
    //return this.sites = SITES.slice(0);
    return this.http.get('/daquery/ws/sites', this.authenticationService.jwt())
                    .map((response: Response) => <Site>response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }
}
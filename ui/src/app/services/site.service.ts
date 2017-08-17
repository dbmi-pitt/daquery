import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { Site } from '../models/site.model';
import { Network } from '../models/network.model';
import { AuthenticationService } from './authentication.service';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class SiteService {

  constructor(private http: Http,
              private authenticationService: AuthenticationService) { }

  sites = [];
  getSite(id: number): Observable<Site> {
    return this.http.get(`/daquery/ws/site/${id}`, this.authenticationService.jwt())
                    .map((response: Response) => <Network>response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    })
  }

  getSites(network: Network): Observable<Site[]> {
    let urlSearchParams: URLSearchParams = new URLSearchParams();
    urlSearchParams.set('network', network.name);

    let requestOptions = this.authenticationService.jwt();
    requestOptions.search = urlSearchParams;

    return this.http.get('/daquery/ws/sites', requestOptions)
                    .map((response: Response) => <Site[]>response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getInSites(network: Network): Observable<Site[]> {
    let urlSearchParams: URLSearchParams = new URLSearchParams();
    urlSearchParams.set('network', network.name);
    urlSearchParams.set('type', 'in');

    let requestOptions = this.authenticationService.jwt();
    requestOptions.search = urlSearchParams;

    return this.http.get('/daquery/ws/sites', requestOptions)
                    .map((response: Response) => <Site[]>response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getOutSites(network: Network): Observable<Site[]> {
    let urlSearchParams: URLSearchParams = new URLSearchParams();
    urlSearchParams.set('network', network.name);
    urlSearchParams.set('type', 'out');

    let requestOptions = this.authenticationService.jwt();
    requestOptions.search = urlSearchParams;

    return this.http.get('/daquery/ws/sites', requestOptions)
                    .map((response: Response) => <Site[]>response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getWaitingSites(network: Network): Observable<Site[]> {
    let urlSearchParams: URLSearchParams = new URLSearchParams();
    urlSearchParams.set('network', network.name);
    urlSearchParams.set('type', 'waiting');

    let requestOptions = this.authenticationService.jwt();
    requestOptions.search = urlSearchParams;

    return this.http.get('/daquery/ws/sites', requestOptions)
                    .map((response: Response) => <Site[]>response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }
}
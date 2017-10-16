import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response, URLSearchParams } from '@angular/http';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from 'rxjs/Observable';
import { Site } from '../models/site.model';
import { Network } from '../models/network.model';
import { AuthenticationService } from './authentication.service';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class SiteService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService) { }

  sites = [];
  getSite(id: number): Observable<Site> {
    return this.http.get(`/daquery/ws/site/${id}`, this.authenticationService.jwt())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    })
  }

  getSites(network: Network): Observable<Site[]> {
    const params = new HttpParams().set("network_id", network.id.toString())

    return this.http.get('/daquery/ws/sites', {params: params})
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  getAvailableSites(network: Network): Observable<Site[]> {
    const params = new HttpParams().set("network_id", network.id.toString())

    return this.http.get('/daquery/ws/sites/available', {params: params})
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  getInSites(network: Network): Observable<Site[]> {
    const params = new HttpParams().set("network_id", network.id.toString())
                                   .set("type", "in");

    return this.http.get('/daquery/ws/sites', {params: params})
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  getOutSites(network: Network): Observable<Site[]> {
    const params = new HttpParams().set("network_id", network.id.toString())
                                   .set("type", "out");

    return this.http.get('/daquery/ws/sites', {params: params})
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  getWaitingSites(network: Network): Observable<Site[]> {
    const params = new HttpParams().set("network_id", network.id.toString())
                                   .set("type", "waiting");

    return this.http.get('/daquery/ws/sites', {params: params})
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  createSite(siteForm: any): Observable<Site>{
    return this.http.post('/daquery/ws/sites', siteForm)
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }
}
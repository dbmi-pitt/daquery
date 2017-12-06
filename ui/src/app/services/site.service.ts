import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from 'rxjs/Observable';
import { Network } from '../models/network.model';
import { AuthenticationService } from './authentication.service';
import { Error } from '../_globals/error';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class SiteService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService,
              private error: Error) { }

  sites = [];
  getSite(id: number): Observable<any> {
    return this.http.get(`/daquery/ws/sites/${id}`, this.authenticationService.jwt())
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    })
  }

  getSites(network: Network): Observable<any[]> {
    const params = new HttpParams().set("network_id", network.id.toString())
                                   .set("type", "outgoing");

    return this.http.get('/daquery/ws/sites', {params: params})
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getAvailableSites(network: Network): Observable<any> {
    const params = new HttpParams().set("network_id", network.id.toString())

    return this.http.get('/daquery/ws/sites/available', {params: params})
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getIncomingSites(network: Network): Observable<any[]> {
    const params = new HttpParams().set("network_id", network.id.toString())
                                   .set("type", "incoming");

    return this.http.get('/daquery/ws/sites', {params: params})
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getOutgoingSites(network: Network): Observable<any[]> {
    const params = new HttpParams().set("network_id", network.id.toString())
                                   .set("type", "outgoing");

    return this.http.get('/daquery/ws/sites', {params: params})
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getPendingSites(network: Network): Observable<any[]> {
    const params = new HttpParams().set("network_id", network.id.toString())
                                   .set("type", "pending");

    return this.http.get('/daquery/ws/sites', {params: params})
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  requestConnectSite(siteForm: any): Observable<any> {
    return this.http.post('/daquery/ws/sites?type=outgoing', siteForm)
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  approveConnect(connectRequest: any): Observable<any> {
    const payload = {
                      'network_id': connectRequest.network_id,
                      'from_site_id': connectRequest.from_site_id
                    };

    return this.http.put('/daquery/ws/sites/approve-connectrequest', payload)
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });

  }

  denyConnect(connectRequest: any): Observable<any> {
    const payload = {
      'network_id': connectRequest.network_id,
      'from_site_id': connectRequest.from_site_id
    };

    return this.http.put('/daquery/ws/sites/deny-connectrequest', payload)
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }
}
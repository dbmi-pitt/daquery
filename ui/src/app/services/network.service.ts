import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { Network } from '../models/network.model';
import { AuthenticationService } from './authentication.service';
@Injectable()
export class NetworkService {

  constructor(private http: Http,
              private authenticationService: AuthenticationService) { }

  networks = [];
  getNetworks(): Observable<Network[]> {
    //return this.sites = SITES.slice(0);
    return this.http.get('/daquery/ws/networks', this.authenticationService.jwt())
                    .map((response: Response) => <Network[]>response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getNetwork(id: number): Observable<Network> {
    return this.http.get(`/daquery/ws/network/${id}`, this.authenticationService.jwt())
                    .map((response: Response) => <Network>response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    })
  }
}

import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from 'rxjs/Observable';
import { Network } from '../models/network.model';
import { AuthenticationService } from './authentication.service';
@Injectable()
export class NetworkService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService) { }

  networks = [];
  getNetworks(): Observable<Network[]> {
    return this.http.get('/daquery/ws/networks')
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  getNetwork(id: number): Observable<Network> {
    return this.http.get(`/daquery/ws/networks/${id}`)
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }
  
  createNetwork(networkForm: any): Observable<Network> {
    return this.http.post('/daquery/ws/networks', networkForm)
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    });
  }

  getAvailableNetworks(): Observable<any[]>{
    return this.http.get('daquery/ws/available-networks-to-query')
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    })
  }

  joinNetwork(network: any): Observable<any[]>{
    return this.http.put('daquery/ws/networks/join', network)
                    .catch(error => {
                      return Observable.throw(error || 'Server error');
                    })
  }
}

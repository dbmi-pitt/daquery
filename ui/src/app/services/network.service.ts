import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from 'rxjs/Observable';
import { AuthenticationService } from './authentication.service';
import { Error } from '../_globals/error';

@Injectable()
export class NetworkService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService,
              private error: Error) { }

  networks = [];
  getNetworks(): Observable<any[]> {
    return this.http.get('/daquery/ws/networks')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getNetwork(id: number): Observable<any> {
    return this.http.get(`/daquery/ws/networks/${id}`)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getDatamodel(network_id: number): Observable<any> {
    return this.http.get(`/daquery/ws/networks/${network_id}/datamodel`)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getSqlDatasource(network_id: number): Observable<any> {
    return this.http.get(`/daquery/ws/networks/${network_id}/sqldatasource`)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }
  
  createNetwork(networkForm: any): Observable<any> {
    return this.http.post('/daquery/ws/networks', networkForm)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getAvailableNetworks(): Observable<any[]>{
    return this.http.get('/daquery/ws/available-networks-to-query')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }

  joinNetwork(network: any): Observable<any[]>{
    return this.http.put('/daquery/ws/networks/join', network)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }

  updateNetworkSQLDataSource(network_id: string, sqldatasource: any): Observable<any>{
    return this.http.put(`/daquery/ws/networks/${network_id}/sqldatasource`, sqldatasource)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }

  updateNetworkDeIDProps(network_id: string, network: any): Observable<any>{
    return this.http.put(`/daquery/ws/networks/${network_id}/deid`, network)
                    .catch(error => {
                      if(error.error.hasOwnProperty("displayMessage")){
                        this.error.error = error;
                      }
                      return Observable.throw(error || 'Server error');
                    })
  }

  testDataSource(sqldatasource: any) {
    return this.http.post('/daquery/ws/networks/test-data-source', sqldatasource)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }
}

import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response, URLSearchParams } from '@angular/http';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from 'rxjs/Observable';
import { AuthenticationService } from './authentication.service';
import { User } from '../models/user.model';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class UserService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService) { }

  users = [];
  getUsers(): Observable<User[]> {
    return this.http.get('/daquery/ws/users', this.authenticationService.jwt())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getRoles(user_id: number): Observable<string[]> {
    const params = new HttpParams().set('user_id', user_id.toString());
    return this.http.get('/daquery/ws/roles', {params: params})
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  remote_users = [];
  getUsersBySite(site_id: number): Observable<any[]>{
    let urlSearchParams: URLSearchParams = new URLSearchParams();
    urlSearchParams.set('site_id', site_id.toString());

    let requestOptions = this.authenticationService.jwt();
    requestOptions.search = urlSearchParams;
    return this.http.get('/daquery/ws/remote-site-users', requestOptions)
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getLocalRoles(): Observable<string[]> {
    return this.http.get('/daquery/ws/local-roles', this.authenticationService.jwt())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  createUser(user: any): Observable<User>{
    return this.http.post('/daquery/ws/users', JSON.stringify(user), this.authenticationService.jwt())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  toggleUserRole(user: any) {
    let userObj = JSON.parse(user);
    return this.http.patch(`/daquery/ws/users/${userObj.id}`, user, this.authenticationService.jwt())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  toggleUserRight(user: any) {
    let userObj = JSON.parse(user);
    return this.http.patch(`/daquery/ws/users/${userObj.id}`, user, this.authenticationService.jwt())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  changePassword(user: any): Observable<boolean> {
    return this.http.put(`/daquery/ws/users/${user.id}`, user, this.authenticationService.jwt())
                    .map(response => {
                        return true;
                    })
                    .catch(error => {
                      if(error.status === 401)
                        return Observable.of(false);
                      else
                        return Observable.throw(error.json().error || 'Server error');
                    })
  }
}
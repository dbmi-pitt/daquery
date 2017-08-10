import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { AuthenticationService } from './authentication.service';
import { User } from '../models/user.model';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class UserService {

  constructor(private http: Http,
              private authenticationService: AuthenticationService) { }

  users = [];
  getUsers(): Observable<User[]> {
    return this.http.get('/daquery/ws/users', this.authenticationService.jwt())
                    .map((response: Response) => <User[]>response.json())
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
                    .map((response: Response) => response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  getLocalRoles(): Observable<string[]> {
    return this.http.get('/daquery/ws/local-roles', this.authenticationService.jwt())
                    .map((response: Response) => response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  createUser(user: any): Observable<User>{
    return this.http.post('/daquery/ws/users', JSON.stringify(user), this.authenticationService.jwt())
                    .map((response: Response) => response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  toggleUserRole(user: any) {
    let userObj = JSON.parse(user);
    return this.http.patch(`/daquery/ws/users/${userObj.id}`, user, this.authenticationService.jwt())
                    .map((response: Response) => response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  toggleUserRight(user: any) {
    let userObj = JSON.parse(user);
    return this.http.patch(`/daquery/ws/users/${userObj.id}`, user, this.authenticationService.jwt())
                    .map((response: Response) => response.json())
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }
}
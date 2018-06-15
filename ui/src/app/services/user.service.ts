import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from 'rxjs/Observable';
import { AuthenticationService } from './authentication.service';
import { User } from '../models/user.model';
import { Error } from '../_globals/error';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class UserService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService,
              private error: Error) { }

  users = [];
  getUsers(): Observable<User[]> {
    return this.http.get('/daquery/ws/users')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getAdminUsers(): Observable<User[]> {
    return this.http.get('/daquery/ws/users?type=admin')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getUser(user_id: string): Observable<any> {
    return this.http.get(`/daquery/ws/users/${user_id}`)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getRoles(user_id: number): Observable<string[]> {
    const params = new HttpParams().set('user_id', user_id.toString());
    return this.http.get('/daquery/ws/local-roles', {params: params})
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  remote_users = [];
  getUsersBySite(site_id: string): Observable<any[]>{
    const params = new HttpParams().set('site-id', site_id);
    return this.http.get('/daquery/ws/users/remote', {params: params})
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getLocalRoles(): Observable<string[]> {
    return this.http.get('/daquery/ws/local-roles')
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  createUser(user: any): Observable<User>{
    delete user.password_confirmation;
    user['realName'] = user.realname;
    delete user.realname;
    user['utype'] = 'FULL';
    return this.http.post('/daquery/ws/users', user)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    });
  }

  toggleUserRole(user: any) {
    return this.http.put(`/daquery/ws/users/update-role/${user.id}`, user)
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  toggleRemoteUserRole(userid: string, siteid: string, networkid: string, role: string, checked: boolean) {
    const params = new HttpParams().set("user-id", userid)
                                   .set("site-id", siteid)
                                   .set("network-id", networkid)
                                   .set("role", role);

    if(checked){
      return this.http.post('/daquery/ws/users/remote-role', params)
                      .catch(error => {
                        this.error.error = error;
                        return Observable.throw(error || 'Server error');
                      });
    } else {
      return this.http.request('delete', '/daquery/ws/users/remote-role', { body : params})
                      .catch(error => {
                        this.error.error = error;
                        return Observable.throw(error || 'Server error');
                      });
    }
  }

  toggleUserRight(user: any) {
    let userObj = JSON.parse(user);
    return this.http.patch(`/daquery/ws/users/${userObj.id}`, user, this.authenticationService.jwt())
                    .catch(error => {
                      this.error.error = error;
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  changePassword(user: any): Observable<boolean> {
    return this.http.put(`/daquery/ws/users/${user.id}`, user)
                    .catch(error => {
                      if(error.status != 401)
                        this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }

  forceChangePassword(user: any): Observable<boolean> {
    return this.http.put(`/daquery/ws/users/${user.id}/force-change-password`, user)
                    .catch(error => {
                      if(error.status != 401)
                        this.error.error = error;
                      return Observable.throw(error || 'Server error');
                    })
  }

  updateUser(user: any): Observable<boolean> {
    return this.http.put(`/daquery/ws/users/${user.id}`, user)
                    .catch(error => {
                      if(error.status != 401){
                        this.error.error = error;
                      }
                      return Observable.throw(error || 'Server error');
                    })
  }

  getCurrentUser() {
    return JSON.parse(localStorage.getItem('currentUser'));
  }

  setCurrentUser(user: any) {
    localStorage.setItem('currentUser', JSON.stringify(user));
  }

  addContact(user: any) {
    return this.http.put(`/daquery/ws/users/${user.id}`, user)
                    .catch(error => {
                      if(error.status != 401){
                        this.error.error = error;
                      }
                      return Observable.throw(error || 'Server error');
                    })
  }

  removeContact(user: any) {
    return this.http.put(`/daquery/ws/users/${user.id}`, user)
                    .catch(error => {
                      if(error.status != 401){
                        this.error.error = error;
                      }
                      return Observable.throw(error || 'Server error');
                    })
  }
}
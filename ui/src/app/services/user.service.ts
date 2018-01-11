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
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  getRoles(user_id: number): Observable<string[]> {
    const params = new HttpParams().set('user_id', user_id.toString());
    return this.http.get('/daquery/ws/roles', {params: params})
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  remote_users = [];
  getUsersBySite(site_id: string): Observable<any[]>{
    // const params = new HttpParams().set('site_id', site_id);
    // return this.http.get('/daquery/ws/remote-site-users', {params: params})
    //                 .catch(error => {
    //                   this.error.message = error.message;
    //                   return Observable.throw(error || 'Server error');
    //                 });

    return Observable.of([
      {
        email: "111@pitt.edu",
        id: "27e9e519-1111-4c9f-af4e-2e34e750c8cd",
        realName: "AAA",
        roles: [{
          id: 4,
          name: "aggregate_querier"
        }],
        utype: "FULL"
      },
      {
        email: "222@pitt.edu",
        id: "27e9e519-2222-4c9f-af4e-2e34e750c8cd",
        realName: "BBB",
        roles: [],
        utype: "FULL"
      }
    ]);
  }

  getLocalRoles(): Observable<string[]> {
    return this.http.get('/daquery/ws/local-roles')
                    .catch(error => {
                      this.error.message = error.message;
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
                      this.error.message = error.message;
                      return Observable.throw(error || 'Server error');
                    });
  }

  toggleUserRole(user: any) {
    return this.http.put(`/daquery/ws/users/update-role/${user.id}`, user)
                    .catch(error => {
                      this.error.message = error.message;
                      return Observable.throw(error.json().error || 'Server error');
                    });
  }

  toggleUserRight(user: any) {
    let userObj = JSON.parse(user);
    return this.http.patch(`/daquery/ws/users/${userObj.id}`, user, this.authenticationService.jwt())
                    .catch(error => {
                      this.error.message = error.message;
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
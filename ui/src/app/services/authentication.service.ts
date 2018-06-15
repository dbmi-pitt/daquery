import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Error } from '../_globals/error';
import 'rxjs/add/operator/map'

@Injectable()
export class AuthenticationService {
  public token: string;

  constructor(private http: HttpClient,
              private router: Router,
              private error: Error) {
    // set token if saved in local storage
    // var currentUser = JSON.parse(localStorage.getItem('currentUser'));
    // this.token = currentUser && currentUser.token;
  }

  login(email: string, password: string): Observable<string> {
    const params = new HttpParams().set('email', email).set('password', password);
    
    return this.http.get('/daquery/ws/users/login', {params: params})
                    .map(response => {
                      // login successful if there's a jwt token in the response
                      let token = response['token'];
                      if (token) {
                        // set token property
                        this.token = token;

                        // store username and jwt token in local storage to keep user logged in between page refreshes
                        localStorage.setItem('currentUser', JSON.stringify(response['user']));
                        localStorage.setItem('jwt', JSON.stringify(token));

                        // return true to indicate successful login
                        return 'success';
                      } else {
                        // return false to indicate failed login
                        return 'fail';
                      }
                    }).catch(error => {
                      if(error.status === 401){
                        if(error.error.subcode === "401.2"){
                          localStorage.setItem('currentUserId', error.error.UserId);
                          let token = error.error['token'];
                          if (token) {
                            // set token property
                            this.token = token;
                            localStorage.setItem('jwt', JSON.stringify(token));
                          }
                          return Observable.of('password_expired');
                        }
                        return Observable.of('fail');
                      }
                      else
                        return Observable.of('error');
                    });
  }

  logout(): void {
    // clear token remove user from local storage to log user out
    this.token = null;
    localStorage.removeItem('currentUser');
    this.error = null;
    this.router.navigate(['./login']);
  }

  renewjwt(networkId: string): void {
    const params = new HttpParams().set('networkId', networkId);
    this.http.get('/daquery/ws/renew-jwt', {params: params}).subscribe(() => {
      console.log('jwt renewed.')
    });
  }

  jwt() {
    // create authorization header with jwt token
    return JSON.parse(localStorage.getItem('jwt'));
  }
}
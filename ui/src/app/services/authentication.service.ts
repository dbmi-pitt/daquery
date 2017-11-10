import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map'

@Injectable()
export class AuthenticationService {
  public token: string;

  constructor(private http: HttpClient,
              private router: Router) {
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
                      if(error.status === 401)
                        return Observable.of('fail');
                      else
                        return Observable.of('error');
                    });
  }

  logout(): void {
    // clear token remove user from local storage to log user out
    this.token = null;
    localStorage.removeItem('currentUser');
     this.router.navigate(['./login']);
  }

  jwt() {
    // create authorization header with jwt token
    return JSON.parse(localStorage.getItem('jwt'));
  }
}
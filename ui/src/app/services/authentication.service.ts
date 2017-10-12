import { Injectable } from '@angular/core';
import { Http, Headers, Response, RequestOptions, URLSearchParams } from '@angular/http';
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
    var currentUser = JSON.parse(localStorage.getItem('currentUser'));
    this.token = currentUser && currentUser.token;
  }

  login(email: string, password: string): Observable<boolean> {
    // let encodedCreds = "Basic" + btoa(email + ":" + password);
    // let headers = new Headers();
    // headers.append('Authorization', encodedCreds);
    // headers.append('Content-Type', 'text/plain');
    // headers.append('Accept', 'application/json');
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
                        return true;
                      } else {
                        // return false to indicate failed login
                        return false;
                      }
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
    // let jwt = JSON.parse(localStorage.getItem('jwt'));
    // if (jwt) {
    //   let headers = new Headers({ 'Authorization': 'Bearer ' + jwt });
    //   return new RequestOptions({ headers: headers });
    // }
    return JSON.parse(localStorage.getItem('jwt'));
  }
}
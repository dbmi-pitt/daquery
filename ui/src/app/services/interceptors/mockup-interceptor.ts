import { Injectable } from '@angular/core';
import { tick } from '@angular/core/testing';
import { HttpRequest, HttpResponseBase, HttpResponse, HttpErrorResponse, HttpHandler, HttpEvent, HttpInterceptor } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class MockHttpInterceptor implements HttpInterceptor {

  constructor() { }

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    return mockupBackend(request) || 
        next.handle(request); // fallback in case url isn't caught
  }
}

function mockupBackend(request: HttpRequest<any>): Observable<HttpEvent<any>>{
  const url: string = request.url;
  const method: string = request.method;

  // authenticate user
  if (url.includes('/daquery/ws/users/login') && method === 'GET') {
    
    return new Observable(resp => {
      resp.next(new HttpResponse({
        status: 401,
        body: {
          user: {
            id: '1',
            email: 'admi@pitt.edu'
          },
          token: "jwt-fake-token"
        }
       }));
      resp.complete();
    });
  } else {
    return new Observable(resp => {
      resp.next(new HttpResponse({
          status: 404,
          body: {
          }
      }));
      resp.complete();
    });
  }
}

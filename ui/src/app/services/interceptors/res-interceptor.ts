import { Injectable } from '@angular/core';
import { HttpRequest, HttpResponse, HttpErrorResponse, HttpHandler, HttpEvent } from '@angular/common/http';
import { HttpInterceptor } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthenticationService } from '../authentication.service';
import { Session } from '../../_globals/session';

  
@Injectable()
export class ResInterceptor implements HttpInterceptor {

constructor(private router: Router,
            private session: Session) {}

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    
    return next.handle(req).do((event: HttpEvent<any>) => {
      if (event instanceof HttpResponse){
        if(event.status === 401){
          throw new HttpErrorResponse({status: event.status});
        }

        try{
          if('token' in event.body){
            localStorage.setItem('jwt', JSON.stringify(event.body.token));
          }
        } catch (e) {
          console.log("event body is not a standard object.");
        }
        return event;
      }
    }).catch(error => {
      // if (error instanceof HttpErrorResponse){
      //   if(error.status === 401) {
      //     this.router.navigate(['/login']);
      //   }
      // }
      if(error.status === 0){
        error = {
          error:{
            displayMessage: "Connection Lost", //
            longMessage: error.statusText //
          }
        }
      }
      return Observable.throw(error || 'Server error');
    });
  }
}
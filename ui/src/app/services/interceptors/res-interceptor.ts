import { Injectable } from '@angular/core';
import { HttpRequest, HttpResponse, HttpErrorResponse, HttpHandler, HttpEvent } from '@angular/common/http';
import { HttpInterceptor } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthenticationService } from '../authentication.service';
  
@Injectable()
export class ResInterceptor implements HttpInterceptor {

constructor(private router: Router) {}

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    
    return next.handle(req).map((event: HttpEvent<any>) => {
      if (event instanceof HttpResponse){
        if(event.status === 401){
          throw new HttpErrorResponse({status: event.status});
        }
        return event;
      }
    }).catch(error => {
      if (error instanceof HttpErrorResponse){
        if(error.status === 401) {
          this.router.navigate(['/login']);
        }
      }
      return Observable.throw(error || 'Server error');
    });
  }
}
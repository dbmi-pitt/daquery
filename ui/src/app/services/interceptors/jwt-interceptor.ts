import { Injectable, Injector } from '@angular/core';
import { HttpRequest, HttpHandler, HttpEvent } from '@angular/common/http';
import { HttpInterceptor } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AuthenticationService } from '../authentication.service';
  
@Injectable()
export class JWTInterceptor implements HttpInterceptor {

  constructor(private inj: Injector) {}

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const authenticationService = this.inj.get(AuthenticationService);
    const JWT = `Bearer ${authenticationService.jwt()}`;
    req = req.clone({
        setHeaders: {
            Authorization: JWT
        }
    });
    return next.handle(req);
  }
}
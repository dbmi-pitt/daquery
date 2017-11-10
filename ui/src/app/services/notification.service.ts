import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { AuthenticationService } from './authentication.service';
import { Notification } from '../models/notification.model';

// Import RxJs required methods
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class NotificationService {

  constructor(private http: HttpClient,
              private authenticationService: AuthenticationService) { }

  getNotification(): Observable<Notification[]>{
    return this.http.get('/daquery/ws/notifications')
                    .catch(error => {
                      return Observable.throw(error.json().error || 'Server error');
                    })
  }
}

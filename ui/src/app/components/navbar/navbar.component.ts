import { Component, OnInit } from '@angular/core';
import { NotificationService } from '../../services/notification.service';
import { AuthenticationService } from '../../services/authentication.service';
import { Notification } from '../../models/notification.model';
import { AuthGuard } from '../../_guards/auth.guard';
import { Observable } from 'rxjs/Rx';


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  notifications: Notification[] = [];
  constructor(private authenticationService: AuthenticationService,
              private notificationService: NotificationService,
              private authGuard: AuthGuard) { }

  ngOnInit() {
    this.getNotifications();
  }

  getNotifications(){
    Observable.interval(5000)
              .switchMap(() => {
                            return this.notificationService.getNotification() })
              .subscribe(notifications => {
                this.notifications = notifications;
              });
  }
}

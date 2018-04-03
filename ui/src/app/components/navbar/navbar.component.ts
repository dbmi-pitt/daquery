import { Component, OnInit } from '@angular/core';
import { NotificationService } from '../../services/notification.service';
import { AuthenticationService } from '../../services/authentication.service';
import { Notification } from '../../models/notification.model';
import { AuthGuard } from '../../_guards/auth.guard';
import { Observable } from 'rxjs/Rx';
import { Location } from '@angular/common';
import { RoleGuard } from '../../_guards/role.guard';


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  notifications: Notification[] = [];
  showAppConfig = false;
  constructor(private authenticationService: AuthenticationService,
              private notificationService: NotificationService,
              private authGuard: AuthGuard,
              private roleGuard: RoleGuard) { }

  ngOnInit() {
    if(this.canActive(["admin"])) {
      this.showAppConfig = true;
    }
    this.getNotifications();
  }

  canActive(allowedRoles: string[]): boolean {
    return this.roleGuard.allowed(allowedRoles);
  }

  getNotifications(){
    // temperary turn down notificaition
    // Observable.interval(5000)
    //           .switchMap(() => {
    //                         return this.notificationService.getNotification() })
    //           .subscribe(notifications => {
    //             this.notifications = notifications;
    //           });
  }

  logout(){
    this.authenticationService.logout();
  }
}

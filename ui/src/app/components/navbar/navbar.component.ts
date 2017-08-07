import { Component, OnInit } from '@angular/core';
import { NotificationService } from '../../services/notification.service';
import { AuthenticationService } from '../../services/authentication.service';
import { Notification } from '../../models/notification.model';


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  notifications: Notification[];
  constructor(private authenticationService: AuthenticationService,
              private notificationService: NotificationService) { }

  ngOnInit() { 
    this.getNotifications();
  }

  getNotifications(){
    this.notificationService.getNotification()
                            .subscribe(notifications => this.notifications = notifications);
  }
}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {Idle, DEFAULT_INTERRUPTSOURCES} from '@ng-idle/core';
import {Keepalive} from '@ng-idle/keepalive';
import { AuthenticationService } from '../../services/authentication.service';

declare var $:any;

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  idleState = 'Not started.';
  timedOut = false;
  lastPing?: Date = null;

  constructor(private router: Router,
              private idle: Idle, 
              private keepalive: Keepalive,
              private authenticationService: AuthenticationService) { 
    // sets an idle timeout of 5 minutes(300 seconds)
    idle.setIdle(300);
    // sets a timeout period of . after 1 minute(60 seconds) of inactivity, the user will be considered timed out.
    idle.setTimeout(60);
    // sets the default interrupts, in this case, things like clicks, scrolls, touches to the document
    idle.setInterrupts(DEFAULT_INTERRUPTSOURCES);

    idle.onIdleEnd.subscribe(() => this.idleState = 'No longer idle.');
    idle.onTimeout.subscribe(() => {
      this.idleState = 'Timed out!';
      this.timedOut = true;
      $('#myModal').modal('hide');
      this.authenticationService.logout();
    });
    idle.onIdleStart.subscribe(() => this.idleState = 'You\'ve gone idle!');
    idle.onTimeoutWarning.subscribe((countdown) => {
      this.idleState = 'You will time out in ' + countdown + ' seconds!';
      $('#myModal').modal('show');
    });

    // sets the ping interval to 15 seconds
    keepalive.interval(15);

    keepalive.onPing.subscribe(() => this.lastPing = new Date());

    this.reset();   
  }

  ngOnInit() {
    // if password expired
    // if(true){
    //   this.router.navigate(['/change-password']);
    // }
  }

  reset() {
    this.idle.watch();
    this.idleState = 'Started.';
    this.timedOut = false;
    $('#myModal').modal('hide');
  }
}

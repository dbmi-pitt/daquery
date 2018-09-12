import { Component, OnInit } from '@angular/core';
import { Router, NavigationStart } from '@angular/router';
import { Idle, DEFAULT_INTERRUPTSOURCES } from '@ng-idle/core';
import { Keepalive } from '@ng-idle/keepalive';
import { AuthenticationService } from '../../services/authentication.service';
import { DaqueryService } from '../../services/daquery.service';
import { Error } from '../../_globals/error';
import { Session } from '../../_globals/session';

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
  
  showStackTrace = false;
  version: String;

  constructor(private router: Router,
              private idle: Idle, 
              private keepalive: Keepalive,
              private authenticationService: AuthenticationService,
              private daqueryService: DaqueryService,
              public error: Error,
              public session: Session) { 
    // sets an idle timeout of 5 minutes(300 seconds)
    idle.setIdle(900);
    // sets a timeout period of . after 1 minute(60 seconds) of inactivity, the user will be considered timed out.
    idle.setTimeout(60);
    // sets the default interrupts, in this case, things like clicks, scrolls, touches to the document
    idle.setInterrupts(DEFAULT_INTERRUPTSOURCES);

    idle.onInterrupt.subscribe(() => {
      // console.log("interrupt");
      // console.log((this.session.server_expiration_time.getTime() - new Date().getTime()) / 1000 / 60);
      // in second 15 min window
      try {
        if ((this.session.serverExpirationTime.getTime() - new Date().getTime()) / 1000 / 60 < 15) {
          this.authenticationService.renewjwt('');
        }
      } catch(e) {
        this.authenticationService.logout();
      }
    });
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
    // keepalive.interval(20);

    // keepalive.onPing.subscribe(() => {
    //   this.authenticationService.renewjwt();
    //   this.lastPing = new Date();
    // });

    this.reset();   

    router.events.subscribe((event) => {
      // see also 
      if(event instanceof NavigationStart){
        this.error.error = null;
      }
  });
  }

  ngOnInit() {
    // if password expired
    // if(true){
    //   this.router.navigate(['/change-password']);
    // }
    this.getVersion();
  }

  reset() {
    this.idle.watch();
    this.idleState = 'Started.';
    this.timedOut = false;
    $('#myModal').modal('hide');
  }

  onAlertDismiss(){
    this.error.error = null;
    //console.log("alert dismiss");
  }

  showErrorInfo(){
    $('#myErrorModal').modal('show');
  }

  getVersion(){
    this.daqueryService.getVersion()
                       .subscribe(ver => {
                         this.version = ver;
                       });
  }
}

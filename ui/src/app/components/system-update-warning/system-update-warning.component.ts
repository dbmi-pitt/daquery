import { Component, OnInit } from '@angular/core';
import { DaqueryService } from '../../services/daquery.service';
import { AuthenticationService } from '../../services/authentication.service';
import { Observable } from 'rxjs/Observable';
import { environment } from '../../../environments/environment';

@Component({
  selector: 'app-system-update-warning',
  templateUrl: './system-update-warning.component.html',
  styleUrls: ['./system-update-warning.component.css']
})
export class SystemUpdateWarningComponent implements OnInit {

  currentUser = JSON.parse(localStorage.getItem('currentUser'));
  currentUserRoles: string[] = this.currentUser.roles.map(r => r.name.toLowerCase());

  forceUpdate: boolean = false;
  started: boolean = false;
  updating: boolean = false;
  updated_success: boolean = false;
  constructor(private authenticationService: AuthenticationService,
              private daqueryService: DaqueryService) { }

  ngOnInit() {
  	this.isUpdateAvailable();
  }

  isUpdateAvailable() {
    this.daqueryService.isUpdateAvailable()
                       .subscribe(res => {
                         this.forceUpdate = res.force_update === "true";
                       });
  }

  systemUpdate(){
    if(confirm("Are you sure to update daquery?")){
      this.updating = true;
      this.started = true;
      let currentBuild = -1;
      this.daqueryService.getVersion()
                        .subscribe(res => {
                          currentBuild = parseInt(res.match(/build \d{4}/)[0].substr(6));
                          this.daqueryService.systemUpdate()
                                             .subscribe(res => {
                                               console.log("get version.");
                                               let subscription = Observable.interval(200 * environment.responseCheckIntervalInSecond).subscribe(x => {
                                                 // // get version every 2 sec 
                                                 this.daqueryService.checkServer()
                                                                    .subscribe(res => {
                                                                      this.updating = false;
                                                                      let updatedBuild = parseInt(res.match(/build \d{4}/)[0].substr(6));
                                                                      this.updated_success = updatedBuild >= currentBuild;
                                                                      subscription.unsubscribe();
                                                                    }, error => {
                                                                      console.log("error");
                                                                      console.log(error);
                                                                      //subscription.unsubscribe();
                                                                    }, () => {
                                                                      console.log("finally");
                                                                      //subscription.unsubscribe();
                                                                    });
                                                })
                                             }, err => {
                                               console.log("error.")
                                               this.updating = false;
                                             });
                        })
    }
  }

  onLogout(){
    this.authenticationService.logout();
  }

  OK(){
    this.authenticationService.logout();
  }
}

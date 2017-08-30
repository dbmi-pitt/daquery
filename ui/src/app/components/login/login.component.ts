import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SetupService } from '../../services/setup.service';
import { AuthenticationService } from '../../services/authentication.service';

@Component({
    moduleId: module.id,
    templateUrl: 'login.component.html'
})

export class LoginComponent implements OnInit {
  model: any = {};
  loading = false;
  error = '';

  constructor(
    private router: Router,
    private setupService: SetupService,
    private authenticationService: AuthenticationService) { }

  ngOnInit() {
    // get setup flag. if not setup, redirect to setup page
    this.setupService.getSetup()
                     .subscribe(setup => {
                        if(!setup){
                          this.router.navigate(['./setup/step1']);
                        }
                      });
    // reset login status
    //this.authenticationService.logout();
  }

  login() {
    this.loading = true;
    this.authenticationService.login(this.model.username, this.model.password)
                              .subscribe(result => {
                                if (result === true) {
                                  this.router.navigate(['/queries-from-me']);
                                } else {
                                  this.error = 'Username or password is incorrect';
                                  this.loading = false;
                                }
                              });
  }
}

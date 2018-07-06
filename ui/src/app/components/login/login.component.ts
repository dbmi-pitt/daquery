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
                     .subscribe(isSetup => {
                        if(isSetup === 'N'){
                          this.router.navigate(['./setup']);
                        }
                      });
    // reset login status
    //this.authenticationService.logout();
  }

  login() {
    this.loading = true;
    this.authenticationService.login(this.model.email, this.model.password)
                              .subscribe(result => {
                                if (result === 'success') {
                                  this.router.navigate(['/queries-to-me']);
                                } else if (result === 'fail'){
                                  this.error = 'Email or password is incorrect';
                                  this.loading = false;
                                } else if (result === 'password_expired'){
                                  this.router.navigate(['/force-change-password']);
                                } else if (result === 'account_disabled'){
                                  this.error = 'Your account has been locked.';
                                  this.loading = false;
                                } else if (result === 'error'){
                                  this.error = 'Daquery Server is down.';
                                  this.loading = false;
                                }
                              });
  }
}

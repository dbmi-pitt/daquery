import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { NgIdleKeepaliveModule } from '@ng-idle/keepalive';
import { MomentModule } from 'angular2-moment';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { JWTInterceptor } from './services/interceptors/jwt-interceptor'
import { ResInterceptor } from './services/interceptors/res-interceptor'
import { MockHttpInterceptor } from './services/interceptors/mockup-interceptor';

import { AuthGuard } from './_guards/auth.guard';
import { RoleGuard } from './_guards/role.guard';
import { AuthenticationService } from './services/authentication.service';
import { QueryService } from './services/query.service';
import { SiteService } from './services/site.service';
import { UserService } from './services/user.service';
import { NetworkService } from './services/network.service';
import { NotificationService } from './services/notification.service';
import { SetupService } from './services/setup.service';

// custom validator
import { EqualValidator } from './validators/equal-validator.directive';

// used to create fake backend
import { fakeBackendProvider } from './_helpers/fake-backend';
import { MockBackend, MockConnection } from '@angular/http/testing';
import { BaseRequestOptions } from '@angular/http';

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { WidgetComponent } from './components/widget/widget.component';
import { QueriesToMeComponent } from './components/queries-to-me/queries-to-me.component';
import { QueriesToMeListComponent } from './components/queries-to-me/queries-to-me-list/queries-to-me-list.component';
import { routing }        from './app.routing';
import { QueriesFromMeComponent } from './components/queries-from-me/queries-from-me.component';
import { SitesComponent } from './components/sites/sites.component';
import { UsersComponent } from './components/users/users.component';
import { QueriesFromMeListComponent } from './components/queries-from-me/queries-from-me-list/queries-from-me-list.component';
import { SiteComponent } from './components/sites/site/site.component';
import { LocalUserComponent } from './components/users/local-user/local-user.component';
import { AddUserComponent } from './components/users/add-user/add-user.component';
import { AddSiteComponent } from './components/sites/add-site/add-site.component';
import { NewQueryComponent } from './components/queries-from-me/new-query/new-query.component';
import { ReviewQueryComponent } from './components/queries-to-me/review-query/review-query.component';
import { SampleDataComponent } from './components/queries-to-me/review-query/sample-data/sample-data.component';
import { ManageUsersComponent } from './components/sites/site/manage-users/manage-users.component';
import { RemoteUserComponent } from './components/sites/site/manage-users/remote-user/remote-user.component';
import { LoginComponent } from './components/login/login.component';
import { NetworksComponent } from './components/networks/networks.component';
import { NetworkComponent } from './components/networks/network/network.component';
import { AddNetworkComponent } from './components/networks/add-network/add-network.component';
import { CreateNetworkComponent } from './components/networks/create-network/create-network.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { Error404Component } from './components/error-404/error-404.component';
import { Error401Component } from './components/error-401/error-401.component';
import { Error403Component } from './components/error-403/error-403.component';
import { SetupComponent } from './components/setup/setup.component';
import { Step1Component } from './components/setup/step1/step1.component';
import { Step2Component } from './components/setup/step2/step2.component';
import { Step3Component } from './components/setup/step3/step3.component';
import { ChangePasswordComponent } from './components/change-password/change-password.component';

import { environment } from '../environments/environment';

let mockupInterceptor = [{
  provide: HTTP_INTERCEPTORS,
  useClass: MockHttpInterceptor,
  multi: true,
}];

if(environment.production){
  mockupInterceptor = [];
}

@NgModule({
  declarations: [
    EqualValidator,
    AppComponent,
    NavbarComponent,
    SidebarComponent,
    WidgetComponent,
    QueriesToMeComponent,
    QueriesToMeListComponent,
    QueriesFromMeComponent,
    SitesComponent,
    UsersComponent,
    QueriesFromMeListComponent,
    SiteComponent,
    LocalUserComponent,
    AddUserComponent,
    AddSiteComponent,
    NewQueryComponent,
    ReviewQueryComponent,
    SampleDataComponent,
    ManageUsersComponent,
    RemoteUserComponent,
    LoginComponent,
    NetworksComponent,
    NetworkComponent,
    AddNetworkComponent,
    CreateNetworkComponent,
    DashboardComponent,
    Error404Component,
    Error401Component,
    Error403Component,
    SetupComponent,
    Step1Component,
    Step2Component,
    Step3Component,
    ChangePasswordComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    routing,
    MomentModule,
    NgIdleKeepaliveModule.forRoot()
  ],
  providers: [AuthGuard, 
              RoleGuard,
              AuthenticationService,
              QueryService,
              SiteService,
              UserService,
              NetworkService,
              NotificationService,
              SetupService,
              {
                provide: HTTP_INTERCEPTORS,
                useClass: JWTInterceptor,
                multi: true,
              },
              {
                provide: HTTP_INTERCEPTORS,
                useClass: ResInterceptor,
                multi: true,
              },
              ...mockupInterceptor,
              // providers used to create fake backend
              fakeBackendProvider,
              MockBackend,
              BaseRequestOptions
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }

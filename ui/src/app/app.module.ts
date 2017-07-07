import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { TabsModule } from 'ngx-bootstrap/tabs';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { WidgetComponent } from './widget/widget.component';
import { QueriesToMeComponent } from './queries-to-me/queries-to-me.component';
import { QueriesToMeListComponent } from './queries-to-me/queries-to-me-list/queries-to-me-list.component';
import { appRoutes } from '../routes';
import { QueriesFromMeComponent } from './queries-from-me/queries-from-me.component';
import { SitesComponent } from './sites/sites.component';
import { UsersComponent } from './users/users.component';
import { QueriesFromMeListComponent } from './queries-from-me/queries-from-me-list/queries-from-me-list.component';
import { SiteComponent } from './sites/site/site.component';
import { LocalUserComponent } from './users/local-user/local-user.component';
import { AddUserComponent } from './users/add-user/add-user.component';
import { AddSiteComponent } from './sites/add-site/add-site.component';
import { NewQueryComponent } from './queries-from-me/new-query/new-query.component';
import { ReviewQueryComponent } from './queries-to-me/review-query/review-query.component';
import { SampleDataComponent } from './queries-to-me/review-query/sample-data/sample-data.component';
import { ManageUsersComponent } from './sites/site/manage-users/manage-users.component';
import { RemoteUserComponent } from './sites/site/manage-users/remote-user/remote-user.component';

import { QueryService } from './shared/query.service';
import { SiteService } from './shared/site.service';
import { UserService } from './shared/user.service';

@NgModule({
  declarations: [
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
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    TabsModule.forRoot(),
  ],
  providers: [QueryService, SiteService, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }

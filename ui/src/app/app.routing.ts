import { Routes, RouterModule } from "@angular/router";
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { QueriesToMeComponent } from "./components/queries-to-me/queries-to-me.component";
import { QueriesFromMeComponent } from "./components/queries-from-me/queries-from-me.component";
import { SitesComponent } from "./components/sites/sites.component";
import { UsersComponent } from "./components/users/users.component";
import { ReviewQueryComponent } from "./components/queries-to-me/review-query/review-query.component";
import { LoginComponent } from "./components/login/login.component";
import { SetupComponent } from "./components/setup/setup.component";
import { Step1Component } from "./components/setup/step1/step1.component";
import { Step2Component } from "./components/setup/step2/step2.component";
import { Step3Component } from "./components/setup/step3/step3.component";
import { NetworksComponent } from "./components/networks/networks.component";
import { NetworkComponent } from "./components/networks/network/network.component";
import { SiteComponent } from "./components/sites/site/site.component";
import { AddSiteComponent } from "./components/sites/add-site/add-site.component";
import { Error404Component } from "./components/error-404/error-404.component";
import { Error401Component } from "./components/error-401/error-401.component";
import { Error403Component } from "./components/error-403/error-403.component";
import { AuthGuard } from './_guards/auth.guard';
import { RoleGuard } from './_guards/role.guard';

const appRoutes:Routes = [
  { path: 'setup/step1', component: Step1Component },
  { path: 'setup/step2', component: Step2Component },
  { path: 'setup/step3', component: Step3Component },
  { path: "login", component: LoginComponent },
  { path: '', component: LoginComponent, 
    children: [
      { path: "queries-to-me", component: QueriesToMeComponent, canActivate: [AuthGuard] },
      { path: "queries-from-me", component: QueriesFromMeComponent, canActivate: [AuthGuard] },
      { path: "review-query/:id", component: ReviewQueryComponent, canActivate: [AuthGuard] },
      { path: "networks", component: NetworksComponent, canActivate: [AuthGuard, RoleGuard], data: { roles: ['admin'] } },
      { path: "network/:id", component: NetworkComponent, canActivate: [AuthGuard] },
      { path: "add-site", component: AddSiteComponent, canActivate: [AuthGuard] },
      { path: "site/:id", component: SiteComponent, canActivate: [AuthGuard] },
      { path: "users", component: UsersComponent, canActivate: [AuthGuard, RoleGuard], data: { roles: ['admin'] } },
    ]
  },
  { path: "404", component: Error404Component },
  { path: "401", component: Error401Component },
  { path: "403", component: Error403Component },
  { path: "**", redirectTo: "404" },
]

export const routing = RouterModule.forRoot(appRoutes);

import { Routes, RouterModule } from "@angular/router";
import { QueriesToMeComponent } from "./components/queries-to-me/queries-to-me.component";
import { QueriesFromMeComponent } from "./components/queries-from-me/queries-from-me.component";
import { SitesComponent } from "./components/sites/sites.component";
import { UsersComponent } from "./components/users/users.component";
import { ReviewQueryComponent } from "./components/queries-to-me/review-query/review-query.component";
import { LoginComponent } from "./components/login/login.component";
import { NetworksComponent } from "./components/networks/networks.component";
import { NetworkComponent } from "./components/networks/network/network.component";
import { SiteComponent } from "./components/sites/site/site.component";
import { AddSiteComponent } from "./components/sites/add-site/add-site.component";
import { AuthGuard } from './_guards/auth.guard';

const appRoutes:Routes = [
    { path: "queries-to-me", component: QueriesToMeComponent },
    { path: "queries-from-me", component: QueriesFromMeComponent, canActivate: [AuthGuard] },
    { path: "review-query/:id", component: ReviewQueryComponent },
    { path: "networks", component: NetworksComponent },
    { path: "network/:id", component: NetworkComponent },
    { path: "add-site", component: AddSiteComponent },
    { path: "site/:id", component: SiteComponent },
    { path: "users", component: UsersComponent },
    { path: "login", component: LoginComponent },
    { path: "", redirectTo: "/login", pathMatch: 'full' },
]

export const routing = RouterModule.forRoot(appRoutes);

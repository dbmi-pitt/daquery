import { Routes } from "@angular/router"
import { QueriesToMeComponent } from "./app/queries-to-me/queries-to-me.component"
import { QueriesFromMeComponent } from "./app/queries-from-me/queries-from-me.component"
import { SitesComponent } from "./app/sites/sites.component"
import { UsersComponent } from "./app/users/users.component"
import { ReviewQueryComponent } from "./app/queries-to-me/review-query/review-query.component"

export const appRoutes:Routes = [
    { path: "queries-to-me", component: QueriesToMeComponent },
    { path: "queries-from-me", component: QueriesFromMeComponent },
    { path: "review-query/:id", component: ReviewQueryComponent },
    { path: "sites", component: SitesComponent },
    { path: "users", component: UsersComponent },
    { path: "", redirectTo: "/queries-to-me", pathMatch: 'full' },
]

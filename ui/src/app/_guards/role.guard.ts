import { Injectable } from '@angular/core';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { UserService } from '../services/user.service';

@Injectable()
export class RoleGuard implements CanActivate {
  currentUserRoles: string[];
  constructor(private router: Router,
              private userService: UserService) { }

  async canActivate(route: ActivatedRouteSnapshot,
              state: RouterStateSnapshot) {
    let allowedRoles = route.data["roles"] as Array<string>;
    await this.getCurrentUserRoles();
    if(this.userRolePermitted(allowedRoles, this.currentUserRoles)){
      return true;
    } else {
      this.router.navigate(['/401']);
      return false;
    }
  }

  async allowed(allowedRoles: string[]) {
    await this.getCurrentUserRoles();
    return this.userRolePermitted(allowedRoles, this.currentUserRoles);
  }

  getCurrentUserRoles(): Promise<any>{
    return new Promise((resolve, reject) => {
      this.userService.getRoles(JSON.parse(localStorage.getItem('currentUser')).user_id)
                      .subscribe(roles => {
                        this.currentUserRoles = roles;
                        resolve();
                      });
    });
  }

  userRolePermitted(allowedRoles: Array<string>, currentUserRoles: Array<string>): boolean{
    if(allowedRoles == null) {
      return true;
    } else {
      let ret = false;
      currentUserRoles.forEach(r => {
        if(allowedRoles.indexOf(r) != -1)
          ret = true;
      });
      return ret;
    }
  }
}
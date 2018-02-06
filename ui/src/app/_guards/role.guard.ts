import { Injectable } from '@angular/core';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { UserService } from '../services/user.service';

@Injectable()
export class RoleGuard implements CanActivate {
  currentUserRoles: string[] = JSON.parse(localStorage.getItem('currentUser')).roles.map(r => r.name.toLowerCase());
  constructor(private router: Router,
              private userService: UserService) {
    this.getCurrentUserRoles();
  }

  async canActivate(route: ActivatedRouteSnapshot,
              state: RouterStateSnapshot) {
    let allowedRoles = route.data["roles"] as Array<string>;
    if(this.userRolePermitted(allowedRoles, this.currentUserRoles)){
      return true;
    } else {
      this.router.navigate(['/403']);
      return false;
    }
  }

  allowed(allowedRoles: string[]) {
    this.getCurrentUserRoles();
    return this.userRolePermitted(allowedRoles, this.currentUserRoles);
  }

  getCurrentUserRoles(){
    this.currentUserRoles = JSON.parse(localStorage.getItem('currentUser')).roles.map(r => r.name.toLowerCase());
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
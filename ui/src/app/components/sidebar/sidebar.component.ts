import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { RoleGuard } from '../../_guards/role.guard';

@Component({
  selector: 'app-sidebar',
  providers: [Location],
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {
  location: Location;

  showNetworkConfiguration = false;
  showUserManagement = false;

  constructor(location: Location,
              private roleGuard: RoleGuard) {
    this.location = location;
  }

  ngOnInit() {
    if(this.canActive(["admin"])) {
      this.showUserManagement = true;
      this.showNetworkConfiguration = true;
    }
  }

  isActive(path){
      return this.location.path().indexOf(path) > -1;
  }

  canActive(allowedRoles: string[]): boolean {
    return this.roleGuard.allowed(allowedRoles);
  }
  
}

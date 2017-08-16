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

  constructor(location: Location,
              private roleGuard: RoleGuard) {
    this.location = location;
  }

  ngOnInit() {
  }

  isActive(path){
      return this.location.path().indexOf(path) > -1;
  }

  async canActive(allowedRoles: string[]) {
    await this.roleGuard.allowed(allowedRoles).then((r) => {
      return r;
    });
  }
  
}

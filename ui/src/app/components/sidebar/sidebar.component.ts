import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { RoleGuard } from '../../_guards/role.guard';
import { NetworkService } from '../../services/network.service';

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

  networks: any[];
  constructor(location: Location,
              private roleGuard: RoleGuard,
              private networkService: NetworkService) {
    this.location = location;
  }

  ngOnInit() {
    if(this.canActive(["admin"])) {
      this.showUserManagement = true;
      this.showNetworkConfiguration = true;
    }
    this.getNetworks();
  }

  isActive(path){
      return this.location.path().indexOf(path) > -1;
  }

  canActive(allowedRoles: string[]): boolean {
    return this.roleGuard.allowed(allowedRoles);
  }
  
  getNetworks() {
    this.networkService.getNetworks()
                       .subscribe(networks => {
                          this.networks = networks;
                          // networks.forEach(n => {
                          //   n.siteConnections.forEach(sc => {
                          //     if(sc.direction.toUpperCase() === 'INCOMING' && sc.status.toUpperCase() === 'CONNECTED'){
                          //       this.getRemoteUser(sc);
                          //     }
                          //   })
                          // })
                        });
  }
}

import { Component, OnInit } from '@angular/core';
import { NetworkService } from '../../services/network.service';
import { UserService } from '../../services/user.service';
import { Direction } from '../../pipes/direction.pipe';
import { forEach } from '@angular/router/src/utils/collection';

@Component({
  selector: 'app-remote-users',
  templateUrl: './remote-users.component.html',
  styleUrls: ['./remote-users.component.css']
})
export class RemoteUsersComponent implements OnInit {
  networks: any[];
  constructor(private networkService: NetworkService,
              private direction: Direction,
              private userService: UserService,) { }

  ngOnInit() {
    this.getNetworks();
  }

  getNetworks() {
    this.networkService.getNetworks()
                       .subscribe(networks => {
                          this.networks = networks;
                          networks.forEach(n => {
                            n.siteConnections.forEach(sc => {
                              if(sc.direction.toUpperCase() === 'INCOMING' && sc.status.toUpperCase() === 'CONNECTED'){
                                this.getRemoteUser(sc);
                              }
                            })
                          })
                        });
  }

  getRemoteUser(sc: any){
    this.userService.getUsersBySite(sc.site.siteId)
                    .subscribe(res => {
                      sc.site['remote_users'] = res[0].sites[0].remoteUsers;
                    });
  }

  onAggregateToggle(event, role){
    let data = event.target.dataset;
    this.userService.toggleRemoteUserRole(data.userid, data.siteid, data.networkid, "aggregate_querier", event.target.checked)
                    .subscribe(res => {
                      //this.showSpin = false;
                    });
  }

  onDataToggle(event, role){
    let data = event.target.dataset;
    this.userService.toggleRemoteUserRole(data.userid, data.siteid, data.networkid, "data_querier", event.target.checked)
                    .subscribe(res => {
                      //this.showSpin = false;
                    });
  }

}

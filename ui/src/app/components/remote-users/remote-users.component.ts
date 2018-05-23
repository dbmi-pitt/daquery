import { Component, OnInit } from '@angular/core';
import { NetworkService } from '../../services/network.service';
import { UserService } from '../../services/user.service';
import { Direction } from '../../pipes/direction.pipe';
import { forEach } from '@angular/router/src/utils/collection';
import { Router, ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-remote-users',
  templateUrl: './remote-users.component.html',
  styleUrls: ['./remote-users.component.css']
})
export class RemoteUsersComponent implements OnInit {
  network: any;
  constructor(private networkService: NetworkService,
              private direction: Direction,
              private userService: UserService,
              private activatedRoute: ActivatedRoute,
            ) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe((params: Params) => {
      let networkId = this.activatedRoute.snapshot.queryParams["network"];
      this.getNetwork(networkId);
    });
  }

  getNetwork(networkId: string){
    this.networkService.getNetwork(networkId)
                       .subscribe(n => {
                         this.network = n;
                         this.network.siteConnections.forEach(sc => {
                           if(sc.direction.toUpperCase() === 'INCOMING' && sc.status.toUpperCase() === 'CONNECTED') {
                             this.getRemoteUser(sc);
                           }
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

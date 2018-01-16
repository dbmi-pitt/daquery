import { Component, OnInit, Input } from '@angular/core';
import { SiteService } from '../../../services/site.service';
import { UserService } from '../../../services/user.service';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-site',
  templateUrl: './site.component.html',
  styleUrls: ['./site.component.css']
})
export class SiteComponent implements OnInit {

  site: any;
  remote_users: any[];
  showSpin = false;
  network_id: string;

  constructor(private siteService: SiteService,
              private userService: UserService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    // subscribe to router event
    this.activatedRoute.params.subscribe((params: Params) => {
      let id = params['id'];
      this.getSite(id);
      this.getRemoteUser(id);
    });
    this.activatedRoute.queryParams.subscribe((params: Params) => {
      this.network_id = params['networkId'];
    })
  }

  getSite(id: string){
    this.siteService.getSite(id)
                    .subscribe(site => {
                      this.site = site;
                    });
  }

  getRemoteUser(site_id: string){
    this.userService.getUsersBySite(site_id)
                    .subscribe(res => {
                      let network = res.find(n => n.networkId === this.network_id);
                      this.remote_users = network.sites[0].remoteUsers;
                    });
  }

  toggleRight(event: any, right: string){
    this.showSpin = true;
    let user = `{"id": ${event.target.dataset.userid}, 
                 "rights": {
                   "${right}": ${event.target.checked}
                 }
                }`;
    this.userService.toggleUserRight(user)
                    .subscribe(res => {
                      this.showSpin = false;
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

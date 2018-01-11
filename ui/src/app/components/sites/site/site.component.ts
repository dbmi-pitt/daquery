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
  }

  getSite(id: string){
    this.siteService.getSite(id)
                    .subscribe(site => {
                      this.site = site;
                    });
  }

  getRemoteUser(site_id: string){
    this.userService.getUsersBySite(site_id)
                    .subscribe(users => this.remote_users = users);
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
    let user = JSON.parse(`{"id": ${event.target.dataset.userid}, 
                 "roles": {
                   "${role}": ${event.target.checked}
                 }
                }`);
    this.userService.toggleUserRole(user)
                    .subscribe(res => {
                      //this.showSpin = false;
                    });
  }

  onDataToggle(event, role){
    let user = JSON.parse(`{"id": ${event.target.dataset.userid}, 
                 "roles": {
                   "${role}": ${event.target.checked}
                 }
                }`);
    this.userService.toggleUserRole(user)
                    .subscribe(res => {
                      //this.showSpin = false;
                    });
  }
}

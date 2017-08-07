import { Component, OnInit, Input } from '@angular/core';
import { Site } from '../../../models/site.model';
import { SiteService } from '../../../services/site.service';
import { UserService } from '../../../services/user.service';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-site',
  templateUrl: './site.component.html',
  styleUrls: ['./site.component.css']
})
export class SiteComponent implements OnInit {

  site: Site;
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

  getSite(id: number){
    this.siteService.getSite(id)
                    .subscribe(site => {
                      this.site = site;
                    });
  }

  getRemoteUser(site_id: number){
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
}

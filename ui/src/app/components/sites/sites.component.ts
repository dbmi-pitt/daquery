import { Component, OnInit, Input } from '@angular/core';
import { SiteService } from '../../services/site.service';
import { Site } from '../../models/site.model';
import { Network } from '../../models/network.model';

import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-sites',
  templateUrl: './sites.component.html',
  styleUrls: ['./sites.component.css']
})
export class SitesComponent implements OnInit {
  showAddSite = false;

  @Input()
  network: Network;
  
  sites: Site[];
  constructor(private siteService: SiteService) { 
  }

  ngOnInit() {
    this.getSites();
  }

  getSites() {
    this.siteService.getSites(this.network)
                    .subscribe(sites => this.sites = sites);
  }

}

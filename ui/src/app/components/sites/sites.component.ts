import { Component, OnInit } from '@angular/core';
import { SiteService } from '../../services/site.service';

@Component({
  selector: 'app-sites',
  templateUrl: './sites.component.html',
  styleUrls: ['./sites.component.css']
})
export class SitesComponent implements OnInit {
  showAddSite = false;

  sites: any[] = [];
  constructor(private siteService: SiteService) { 
    this.sites = this.siteService.getSites();
  }

  ngOnInit() {
  }

}

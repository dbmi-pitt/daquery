import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { NetworkService } from '../../../services/network.service';
import { SiteService } from '../../../services/site.service';
import { Network } from '../../../models/network.model';
import { Site } from '../../../models/site.model';

@Component({
  selector: 'app-add-site',
  templateUrl: './add-site.component.html',
  styleUrls: ['./add-site.component.css']
})
export class AddSiteComponent implements OnInit {

  network: Network;
  sites: Site[];
  constructor(private networkService: NetworkService,
              private siteService: SiteService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    // subscribe to router event
    this.activatedRoute.queryParams.subscribe(async (params: Params) => {
      let id = params['network'];
      await this.getNetwork(id);
      this.getSites(this.network);
    });
  }

  getNetwork(id: number): Promise<any>{
    return new Promise((resolve, reject) => {
      this.networkService.getNetwork(id)
                         .subscribe(network => {
                           this.network = network;
                           resolve();
                        });
    });
  }

  getSites(network: Network){
    this.siteService.getSites(network)
                    .subscribe(sites => {
                      this.sites = sites;
                    });
  }

}

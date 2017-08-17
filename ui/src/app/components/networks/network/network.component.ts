import { Component, OnInit, Input } from '@angular/core';
import { Network } from '../../../models/network.model';
import { NetworkService } from '../../../services/network.service';
import { SiteService } from '../../../services/site.service';
import { ActivatedRoute, Params } from '@angular/router';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-network',
  templateUrl: './network.component.html',
  styleUrls: ['./network.component.css']
})
export class NetworkComponent implements OnInit {

  network: Network = new Network();
  inSites = [];
  outSites = [];
  waitingSites = [];
  constructor(private siteService: SiteService,
              private networkService: NetworkService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    // subscribe to router event
    this.activatedRoute.params.subscribe(async (params: Params) => {
      let id = params['id'];
      await this.getNetwork(id);
      this.getInSites();
      this.getOutSites();
      this.getWaitingSites();
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

  getInSites(){
    this.siteService.getInSites(this.network)
                    .subscribe(sites => {
                          this.inSites = sites;
                       });
  }

  getOutSites(){
    this.siteService.getOutSites(this.network)
                    .subscribe(sites => {
                          this.outSites = sites;
                       });
  }

  getWaitingSites(){
    this.siteService.getWaitingSites(this.network)
                    .subscribe(sites => {
                      this.waitingSites = sites;
                    });
  }

}

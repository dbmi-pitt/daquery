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

  network_id: number;
  network: any = null;
  inSites = null;
  outSites = null;
  pendingSites = [];
  error: string;
  approving: boolean = false;
  denying: boolean = false;
  constructor(private siteService: SiteService,
              private networkService: NetworkService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    // subscribe to router event
    this.activatedRoute.params.subscribe(async (params: Params) => {
      this.network_id = params['id'];
      await this.getNetwork(this.network_id);
      this.getIncomingSites();
      this.getOutgoingSites();
      this.getPendingSites();
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

  getIncomingSites(){
    this.siteService.getIncomingSites(this.network)
                    .subscribe(sites => {
                          this.inSites = sites;
                       });
  }

  getOutgoingSites(){
    this.siteService.getOutgoingSites(this.network)
                    .subscribe(sites => {
                          this.outSites = sites;
                       });
  }

  getPendingSites(){
    this.siteService.getPendingSites(this.network)
                    .subscribe(sites => {
                      this.pendingSites = sites;
                    });
  }

  denyConnect(pendingSite: any){
    const connectRequest = {
      network_id: this.network.networkId,
      from_site_id: pendingSite.siteId
    };
    this.siteService.denyConnect(connectRequest)
                    .subscribe(data => {
                      // get the pending, outgoing, incoming sites again
                      this.getPendingSites();
                      this.getOutgoingSites();
                      this.getIncomingSites();
                    },
                    error => {
                      this.error = error;
                    });
  }

  approveConnect(pendingSite: any){
    this.approving = true;
    const connectRequest = {
      network_id: this.network.networkId,
      from_site_id: pendingSite.siteId
    };
    this.siteService.approveConnect(connectRequest)
                    .subscribe(data => {
                      // get the pending, outgoing, incoming sites again
                      this.getPendingSites();
                      this.getOutgoingSites();
                      this.getIncomingSites();

                      this.approving = false;
                    },
                    error => {
                      this.error = error;
                    });
  }

}

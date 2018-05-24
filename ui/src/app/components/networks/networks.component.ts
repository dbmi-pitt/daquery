import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { NetworkService } from '../../services/network.service';
import { MapValuesPipe } from '../../pipes/iteratable.pipe';
import { EventBrokerService } from '../../services/eventbroker.service';

@Component({
  selector: 'app-networks',
  templateUrl: './networks.component.html',
  styleUrls: ['./networks.component.css']
})
export class NetworksComponent implements OnInit {
  showJoinNetwork = false;
  showCreateNetwork = false;

  networks: any[];
  constructor(private networkService: NetworkService,
              private eventBroker: EventBrokerService) {
  }

  ngOnInit() {
    this.getNetworks();
  }

  getNetworks() {
    this.networkService.getNetworks()
                       .subscribe(networks => {
                         this.networks = networks;
                        //  this.networks.forEach((n) => {
                        //    n.sites = {};
                        //    n.incomingQuerySites.forEach((s) => {
                        //      n.sites[s.siteId] = {};
                        //      n.sites[s.siteId]['name'] = s.name;
                        //      n.sites[s.siteId]['direction'] = 'In';
                        //   })
                        //    n.outgoingQuerySites.forEach((s) => {
                        //      if(s.siteId in n.sites){
                        //       if(s.status === 'PENDING')
                        //         n.sites[s.siteId]['direction'] += '/Pending';
                        //       else
                        //         n.sites[s.siteId]['direction'] += '/Out';
                        //      } else {
                        //       n.sites[s.siteId] = {};
                        //       n.sites[s.siteId]['name'] = s.name;
                        //       if(s.status === 'PENDING')
                        //         n.sites[s.siteId]['direction'] = 'Pending';
                        //       else
                        //         n.sites[s.siteId]['direction'] = 'Out';
                        //      }
                        //    });
                        //    n.sites = Object.values(n.sites);
                        //  })
                        });
  }

  toggleJoinNetwork(){
    this.showJoinNetwork=!this.showJoinNetwork;
    this.showCreateNetwork=false;
  }

  toggleCreateNetwork(){
    this.showCreateNetwork=!this.showCreateNetwork;
    this.showJoinNetwork=false;
  }

  addNewNetwork(network: any){
    this.showCreateNetwork = false;
    this.showJoinNetwork = false;
    this.networks.push(network);
    this.eventBroker.emit<boolean>("add-network", true);
  }

}

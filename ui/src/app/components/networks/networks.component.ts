import { Component, OnInit } from '@angular/core';
import { NetworkService } from '../../services/network.service';
import { Network } from '../../models/network.model';


@Component({
  selector: 'app-networks',
  templateUrl: './networks.component.html',
  styleUrls: ['./networks.component.css']
})
export class NetworksComponent implements OnInit {
  showJoinNetwork = false;
  showCreateNetwork = false;

  networks: Network[];
    constructor(private networkService: NetworkService) { 
  }

  ngOnInit() {
    this.getNetworks();
  }

  getNetworks() {
    this.networkService.getNetworks()
                       .subscribe(networks => this.networks = networks);
  }

  toggleJoinNetwork(){
    this.showJoinNetwork=!this.showJoinNetwork;
    this.showCreateNetwork=false;
  }

  toggleCreateNetwork(){
    this.showCreateNetwork=!this.showCreateNetwork;
    this.showJoinNetwork=false;
  }

  addNewNetwork(network: Network){
    this.showCreateNetwork = false;
    this.showJoinNetwork = false;
    this.networks.push(network);
  }

}

import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { Network } from '../../../../models/network.model';
import { NetworkService } from '../../../../services/network.service';
import { SiteService } from '../../../../services/site.service';
import { ActivatedRoute, Params } from '@angular/router';
import { Observable } from 'rxjs/Observable';
import { UserService } from '../../../../services/user.service';
import { User } from '../../../../models/user.model';

@Component({
  selector: 'app-network-contacts',
  templateUrl: './network-contacts.component.html',
  styleUrls: ['./network-contacts.component.css']
})
export class NetworkContactsComponent implements OnInit {

  network_id: number;
  network: any = null;
  users: User[];
  constructor(private siteService: SiteService,
              private networkService: NetworkService,
              private userService: UserService,
              private activatedRoute: ActivatedRoute,
              private fb: FormBuilder) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe(async (params: Params) => {
      this.network_id = params['id'];
      this.getNetwork(this.network_id);
      this.getUsers();
    });
  }

  getNetwork(id: number){
    this.networkService.getNetwork(id)
                       .subscribe(network => {
                          this.network = network;
                        });
  }

  getUsers() {
    this.userService.getUsers()
                    .subscribe(users => {
                      this.users = users
                    });
  }

}

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
      this.getUsers();
    });
  }

  getNetwork(id: number){
    this.networkService.getNetwork(id)
                       .subscribe(network => {
                          this.network = network;
                          for(let contact of this.network.contacts){
                            this.users.find(u => u.id === contact.id)['checked'] = true;
                          }
                        });
  }

  getUsers() {
    this.userService.getUsers()
                    .subscribe(users => {
                      this.users = users;
                      this.getNetwork(this.network_id);
                    });
  }

  onChange(e){
    let user_id = e.target.getAttribute('data-userid');
    if(e.target.checked){
      this.networkService.addContact(this.network.id, this.users.find(u => u.id === user_id))
                         .subscribe(res => {
                            console.log(res);
                         });
    } else {
      this.networkService.removeContact(this.network.id, this.users.find(u => u.id === user_id))
                         .subscribe(res => {
                            console.log(res);
                         });
    }
  }

}

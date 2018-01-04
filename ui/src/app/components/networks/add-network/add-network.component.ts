import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { NetworkService } from '../../../services/network.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-network',
  templateUrl: './add-network.component.html',
  styleUrls: ['./add-network.component.css']
})
export class AddNetworkComponent implements OnInit {
  loadingAvailableNetworks = false;
  availableNetworks: any[];
  submitted = false;
  joinNetworkForm: FormGroup;

  @Output()
  newNetwork = new EventEmitter<any>();

  constructor(private fb: FormBuilder,
              private networkServier: NetworkService,
              private router: Router) { }

  ngOnInit() {
    this.createForm();
    this.getAvailableNetworks();
  }

  createForm() {
    this.joinNetworkForm = this.fb.group({
      network: ['', Validators.required],
      url: ['', Validators.required],
      username: ['', Validators.required],
      password: ['', Validators.required],
      driver:  ['', Validators.required]
    })
  }

  get network() { return this.joinNetworkForm.get('network'); }
  get url() { return this.joinNetworkForm.get('url'); }
  get username() { return this.joinNetworkForm.get('username'); }
  get password() { return this.joinNetworkForm.get('password'); }
  get driver() { return this.joinNetworkForm.get('driver'); }

  getAvailableNetworks(){
    this.loadingAvailableNetworks = true;
    this.networkServier.getAvailableNetworks()
                       .subscribe(data => {
                          this.loadingAvailableNetworks = false;
                          this.availableNetworks = data;
                          this.createForm();
                       });
  }

  onSubmit() {
    this.submitted = true;
    if(this.joinNetworkForm.valid){
      const selectedNetwork = this.availableNetworks.find(e => e.networkId === this.joinNetworkForm.value.network);
      this.networkServier.joinNetwork({"form": this.joinNetworkForm.value, "network": selectedNetwork})
                        .subscribe(data => {
                          this.newNetwork.emit(data);
                        });
    }
  }

}

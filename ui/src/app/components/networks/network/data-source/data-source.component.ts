import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { Network } from '../../../../models/network.model';
import { NetworkService } from '../../../../services/network.service';
import { SiteService } from '../../../../services/site.service';
import { ActivatedRoute, Params } from '@angular/router';
import { Observable } from 'rxjs/Observable';


@Component({
  selector: 'app-data-source',
  templateUrl: './data-source.component.html',
  styleUrls: ['./data-source.component.css']
})
export class DataSourceComponent implements OnInit {

  submitted = false;
  network_id: number;
  network: any = null;
  datasourceForm: FormGroup;
  constructor(private siteService: SiteService,
              private networkService: NetworkService,
              private activatedRoute: ActivatedRoute,
              private fb: FormBuilder) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe(async (params: Params) => {
      this.network_id = params['id'];
      this.getNetwork(this.network_id);
    });
    this.createForm();
  }

  createForm() {
    this.datasourceForm = this.fb.group({
      url: ['', Validators.required],
      username: ['', Validators.required],
      password: ['', Validators.required],
      driver: ['', Validators.required]
    })
  }

  get url() { return this.datasourceForm.get('url'); }
  get username() { return this.datasourceForm.get('username'); }
  get password() { return this.datasourceForm.get('password'); }
  get driver() { return this.datasourceForm.get('driver'); }

  getNetwork(id: number): Promise<any>{
    return new Promise((resolve, reject) => {
      this.networkService.getNetwork(id)
                         .subscribe(network => {
                          this.network = network;
                          resolve();
                       });
    });
  }

  onSubmit(){

  }
}

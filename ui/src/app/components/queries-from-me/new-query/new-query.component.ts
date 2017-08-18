import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { NewQuery } from '../../../models/new-query.model';
import { NetworkService } from '../../../services/network.service';
import { SiteService } from '../../../services/site.service';
import { Network } from '../../../models/network.model';
import { Site } from '../../../models/site.model';

@Component({
  selector: 'app-new-query',
  templateUrl: './new-query.component.html',
  styleUrls: ['./new-query.component.css'],
})
export class NewQueryComponent implements OnInit {

  queryForm: FormGroup;
  networks: Network[];
  constructor(private fb: FormBuilder,
              private networkService: NetworkService,
              private siteService: SiteService) { }

  createForm() {
    this.queryForm = this.fb.group({
      network: new FormControl('', Validators.required),
      sitesToQuery: this.fb.array([]),
      dataType: new FormControl('aggregate'),
      queryName: 'aaa',
      studyName: '',
      queryDescription: '',
      oracleQuery: '',
      sqlQuery: ''
    });
  }

  ngOnInit() {
    this.networkService.getNetworks()
                       .subscribe(networks => this.networks = networks);
    this.createForm();
  }

  onSubmit() {
    
  }

  networkOnChange(value){
    let network = this.networks.find(n => n.name === value);
    if(network === undefined) {
      this.queryForm.setControl('sitesToQuery', this.fb.array([]));
    } else {
      this.siteService.getSites(network)
                      .subscribe(sites => {
                        const siteFGs = sites.map(site => this.fb.group({"name": site.name, "check": false}));
                        const siteFormArray = this.fb.array(siteFGs);
                        this.queryForm.setControl('sitesToQuery', siteFormArray);
                      });
    }
  }

}

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
  datamodel: any = null;
  sqldatasource: any = null;
  datasourceForm: FormGroup;
  error: any;
  loading = false;
  success = false;
  testResult: any;

  constructor(private siteService: SiteService,
              private networkService: NetworkService,
              private activatedRoute: ActivatedRoute,
              private fb: FormBuilder) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe(async (params: Params) => {
      this.network_id = params['id'];
      this.getNetwork(this.network_id);
      this.createForm();
      this.getDatamodel(this.network_id);
    });
  }

  createForm() {
    this.datasourceForm = this.fb.group({
      url: ['', Validators.required],
      username: ['', Validators.required],
      password: ['', Validators.required],
      driver: ['', Validators.required],
      dtype: ['SQL']
    })
  }

  get url() { return this.datasourceForm.get('url'); }
  get username() { return this.datasourceForm.get('username'); }
  get password() { return this.datasourceForm.get('password'); }
  get driver() { return this.datasourceForm.get('driver'); }

  getNetwork(id: number){
      this.networkService.getNetwork(id)
                         .subscribe(network => {
                            this.network = network;
                          });
  }

  getDatamodel(network_id: number) {
    this.networkService.getDatamodel(network_id)
                       .subscribe(datamodel => {
                          this.datamodel = datamodel;
                          this.datasourceForm.get('url').setValue(this.datamodel.dataSources[0].url);
                          this.datasourceForm.get('username').setValue(this.datamodel.dataSources[0].username);
                          this.datasourceForm.get('password').setValue(this.datamodel.dataSources[0].password);
                          this.datasourceForm.get('driver').setValue(this.datamodel.dataSources[0].driverClass);
                       });
  }

  getSqlDatasource(network_id: number): Promise<any> {
    return new Promise((resolve, reject) => {
      this.networkService.getSqlDatasource(network_id)
                        .subscribe(sqldatasource => {
                            this.sqldatasource = sqldatasource;
                            resolve();
                        });
    });
  }

  onSubmit(){
    this.loading = true;
    this.networkService.updateNetworkSQLDataSource(this.network.networkId, this.datasourceForm.value)
                       .subscribe(res => {
                          this.error = '';
                          this.loading = false;
                          this.success = true;
                          this.datasourceForm.reset();
                          setTimeout(() => {
                            this.success = false;
                          }, 3000);
                       }, error => {
                        if(error.status === 401){
                          this.error = 'Your password is incorrect';
                          this.loading = false;
                        }
                      });
  }

  testDataSource(e) {
    e.preventDefault();
    this.networkService.testDataSource(this.datasourceForm.value)
                       .subscribe( res => {
                          this.testResult = res;
                       });
  }
}

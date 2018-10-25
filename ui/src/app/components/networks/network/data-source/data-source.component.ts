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
  dataModels: any[];
  selectedDataModel: any;
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
      dataModel: ['', Validators.required],
      connectionUrl: ['', Validators.required],
      username: ['', Validators.required],
      password: ['', Validators.required],
      driverClass: ['', Validators.required],
      dtype: ['SQL']
    })
  }

  get dataModel() { return this.datasourceForm.get('dataModel'); }
  get connectionUrl() { return this.datasourceForm.get('connectionUrl'); }
  get username() { return this.datasourceForm.get('username'); }
  get password() { return this.datasourceForm.get('password'); }
  get driverClass() { return this.datasourceForm.get('driverClass'); }

  getNetwork(id: number){
      this.networkService.getNetwork(id)
                         .subscribe(network => {
                            this.network = network;
                          });
  }

  getDatamodel(network_id: number) {
    this.networkService.getDatamodels(network_id)
                       .subscribe(datamodels => {
                          this.dataModels = datamodels;
                          this.selectedDataModel = datamodels[0];
                          this.datasourceForm.get('dataModel').setValue(this.selectedDataModel.dataModelId);
                          try{
                            this.datasourceForm.get('connectionUrl').setValue(this.selectedDataModel.dataSources[0].connectionUrl);
                            this.datasourceForm.get('username').setValue(this.selectedDataModel.dataSources[0].username);
                            this.datasourceForm.get('password').setValue(this.selectedDataModel.dataSources[0].password);
                            this.datasourceForm.get('driverClass').setValue(this.selectedDataModel.dataSources[0].driverClass);
                          } catch (err) {
                            this.datasourceForm.get('connectionUrl').setValue("");
                            this.datasourceForm.get('username').setValue("");
                            this.datasourceForm.get('password').setValue("");
                            this.datasourceForm.get('driverClass').setValue("");
                          }
                       });
  }

  onDataModelChange(){
    this.selectedDataModel = this.dataModels.find(x => x.dataModelId == this.datasourceForm.get('dataModel').value);
    this.datasourceForm.get('dataModel').setValue(this.selectedDataModel.dataModelId);
    try{
      this.datasourceForm.get('connectionUrl').setValue(this.selectedDataModel.dataSources[0].connectionUrl);
      this.datasourceForm.get('username').setValue(this.selectedDataModel.dataSources[0].username);
      this.datasourceForm.get('password').setValue(this.selectedDataModel.dataSources[0].password);
      this.datasourceForm.get('driverClass').setValue(this.selectedDataModel.dataSources[0].driverClass);
    } catch (err) {
      this.datasourceForm.get('connectionUrl').setValue("");
      this.datasourceForm.get('username').setValue("");
      this.datasourceForm.get('password').setValue("");
      this.datasourceForm.get('driverClass').setValue("");
    }
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
                          //this.datasourceForm.reset();
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

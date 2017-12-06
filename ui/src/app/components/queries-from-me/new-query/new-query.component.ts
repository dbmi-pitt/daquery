import { Component, OnInit, Input } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { NewQuery } from '../../../models/new-query.model';
import { NetworkService } from '../../../services/network.service';
import { SiteService } from '../../../services/site.service';
import { RequestService } from '../../../services/request.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-new-query',
  templateUrl: './new-query.component.html',
  styleUrls: ['./new-query.component.css'],
})
export class NewQueryComponent implements OnInit {

  @Input() editingInquiry: any;
  queryForm: FormGroup;
  networks: any[];

  showNetworkSitePanel = false;

  constructor(private fb: FormBuilder,
              private networkService: NetworkService,
              private siteService: SiteService,
              private requestService: RequestService,
              private router: Router) { }

  createForm(inquiry) {
    if(inquiry){
      this.queryForm = this.fb.group({
        network: new FormControl('', Validators.required),
        sitesToQuery: this.fb.array([]),
        dataType: new FormControl('aggregate'),
        queryName: 'continue edit inquiry',
        studyName: '',
        queryDescription: '',
        oracleQuery: '',
        sqlQuery: ''
      });
    } else {
      this.queryForm = this.fb.group({
        network: new FormControl('', Validators.required),
        sitesToQuery: this.fb.array([]),
        dataType: new FormControl('aggregate'),
        queryName: '',
        studyName: '',
        queryDescription: '',
        oracleQuery: '',
        sqlQuery: ''
      });
    }
  }

  ngOnInit() {
    this.networkService.getNetworks()
                       .subscribe(networks => this.networks = networks);
    this.createForm(this.editingInquiry);
  }

  onSave() {
    this.requestService.saveInquires(this.queryForm.value)
                       .subscribe(data => {
                          console.log(data);
                       });
  }

  onRequest() {
    this.showNetworkSitePanel = !this.showNetworkSitePanel;
  }

  onSend(){
    const requestGroupUUID = this.generateUUID();
    this.queryForm.value.sitesToQuery.forEach((site) => {
      const request = {
        requestSite: {
          siteId: site.siteId,
        },
        network: {
          networkId: this.queryForm.value.network
        },
        requestGroup: requestGroupUUID,
        inquiry: {
          version: 1,
          dataType: 'SQL_QUERY',
          aggregate: true,
          code: this.queryForm.value.sqlQuery
        }
      };

      console.log(request);
      this.requestService.sendRequest(request)
                         .subscribe(data => {
                           location.reload();
                         });
    })
  }

  networkOnChange(value){
    let network = this.networks.find(n => n.networkId === value);
    if(network === undefined) {
      this.queryForm.setControl('sitesToQuery', this.fb.array([]));
    } else {
      this.siteService.getSites(network)
                      .subscribe(sites => {
                        const siteFGs = sites.map(site => this.fb.group({"name": site.name, "siteId": site.siteId, "check": false}));
                        const siteFormArray = this.fb.array(siteFGs);
                        this.queryForm.setControl('sitesToQuery', siteFormArray);
                      });
    }
  }

  generateUUID () { // Public Domain/MIT
    var d = new Date().getTime();
    if (typeof performance !== 'undefined' && typeof performance.now === 'function'){
        d += performance.now(); //use high-precision timer if available
    }
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
        var r = (d + Math.random() * 16) % 16 | 0;
        d = Math.floor(d / 16);
        return (c === 'x' ? r : (r & 0x3 | 0x8)).toString(16);
    });
}
}

import { Component, OnInit, EventEmitter, Input, Output } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { NetworkService } from '../../../services/network.service';
import { SiteService } from '../../../services/site.service';
import { AuthenticationService } from '../../../services/authentication.service';
import { RequestService } from '../../../services/request.service';
import { Router } from '@angular/router';
import { UserService } from 'app/services/user.service';

declare var $:any;

@Component({
  selector: 'app-new-query',
  templateUrl: './new-query.component.html',
  styleUrls: ['./new-query.component.css'],
})
export class NewQueryComponent implements OnInit {

  @Input() editingInquiry: any;
  inquiryForm: FormGroup;
  networks: any[];

  showNetworkSitePanel = false;
  onSending = false;
  editing: boolean = false;
  error: any;

  sqlDialect = {
    ansi: true,
    oracle: false,
    sqlServer: false
  }
  lastAddedTab = "ansi";

  @Output() requestSent: EventEmitter<any> = new EventEmitter<any>();
  @Output() requests: EventEmitter<any[]> = new EventEmitter<any[]>();

  constructor(private fb: FormBuilder,
              private networkService: NetworkService,
              private siteService: SiteService,
              private requestService: RequestService,
              private userServier: UserService,
              private authenticationService: AuthenticationService,
              private router: Router) { }

  createForm(inquiry) {
    if(inquiry){
      let ansi_code = inquiry.code.find(x => x.dialect === 'ANSI').code;
      let oracle_code = inquiry.code.find(x => x.dialect === 'ORACLE').code;
      let sql_server_code = inquiry.code.find(x => x.dialect === 'SQL_SERVER').code;
      this.sqlDialect = {
        ansi: !(ansi_code === ""),
        oracle: !(oracle_code === ""),
        sqlServer: !(sql_server_code === "")
      };
      if(this.sqlDialect.ansi) this.lastAddedTab = "ansi";
      if(this.sqlDialect.oracle) this.lastAddedTab = "oracle";
      if(this.sqlDialect.sqlServer) this.lastAddedTab = "sql_server";

      this.inquiryForm = this.fb.group({
        network: '',
        sitesToQuery: this.fb.array([]),
        queryType: [inquiry.queryType.toUpperCase()],
        dataType:['SQL_QUERY'],
        inquiryName: [inquiry.inquiryName, Validators.required],
        studyName: '',
        inquiryDescription: [inquiry.inquiryDescription, Validators.maxLength(500)],
        query: this.fb.group({
          ansi: [ansi_code, ansi_code === "" ? null : Validators.required],
          oracle: [oracle_code, oracle_code === "" ? null : Validators.required],
          sqlServer: [sql_server_code, sql_server_code === "" ? null : Validators.required]
        })
      });
    } else {
      this.inquiryForm = this.fb.group({
        network: '',
        sitesToQuery: this.fb.array([]),
        queryType: ['AGGREGATE'],
        dataType: ['SQL_QUERY'],
        inquiryName: ['', Validators.required],
        studyName: '',
        inquiryDescription: ['', Validators.maxLength(500)],
        query: this.fb.group({
          ansi: ['', Validators.required],
          oracle: [''],
          sqlServer: ['']
        })
      });
    }
  }

  get inquiryName() { return this.inquiryForm.get('inquiryName'); }
  get inquiryDescription() { return this.inquiryForm.get('inquiryDescription'); }
  get sqlQuery() { return this.inquiryForm.get('sqlQuery'); }
  get network() { return this.inquiryForm.get('network'); }
  get sitesToQuery() { return this.inquiryForm.get('sitesToQuery'); }
  get queryType() { return this.inquiryForm.get('queryType'); }
  get dataType() { return this.inquiryForm.get('dataType'); }
  get query() { return this.inquiryForm.get('query'); }
  get ansi() { return this.inquiryForm.get('query').get('ansi'); }
  get oracle() { return this.inquiryForm.get('query').get('oracle'); }
  get sqlServer() { return this.inquiryForm.get('query').get('sqlServer'); }

  ngOnInit() {
    this.createForm(this.editingInquiry);
  }

  onSave() {
    if(this.editingInquiry) {
      this.requestService.updateInquiry(this.editingInquiry.inquiryId, this.inquiryForm.value)
                         .subscribe(data => {
                           this.requestSent.emit(true);
                         });
    } else {
      this.requestService.saveInquires(this.inquiryForm.value)
                        .subscribe(data => {
                          this.requestSent.emit(true);
                        });
    }
  }

  onRequest() {
    if(this.inquiryForm.valid){
      if(this.editingInquiry) {
        this.requestService.updateInquiry(this.editingInquiry.inquiryId, this.inquiryForm.value)
                          .subscribe();
      } else {
        this.requestService.saveInquires(this.inquiryForm.value)
                          .subscribe();
      }
    }
    //this.showNetworkSitePanel = !this.showNetworkSitePanel;
    if(this.inquiryForm.valid){
      $('#myRequestModal').modal('show');
      this.networkService.getNetworks()
                       .subscribe(networks => {
                         this.networks = networks;
                         if(this.networks && this.networks.length === 1){
                            let network = this.networks[0];
                            this.authenticationService.renewjwt(network.networkId);
                            this.siteService.getSites(network)
                                            .subscribe(sites => {
                                              const siteFGs = sites.sort(function(a,b) { return (a.name > b.name) ? 1 : ((b.name > a.name) ? -1 : 0); })
                                                                   .map(site => this.fb.group({"name": site.name, "siteId": site.siteId, "check": false}));
                                              const siteFormArray = this.fb.array(siteFGs);
                                              this.inquiryForm.setControl('sitesToQuery', siteFormArray);
                                            }, error => {
                                              //$('#myRequestModal').modal('hide');
                                              this.error = error;
                                            });
                          } else {
                            this.inquiryForm.get('inquiryName').markAsTouched();
                          }
                        }, error => {
                          this.error = error;
                        });
    } else {
      this.inquiryForm.get('inquiryName').markAsTouched();
    }
  }

  onCancel() {
    this.requestSent.emit(true);
  }

  reset() {
    $('#myRequestModal').modal('hide');
  }

  readyToSend() {
    return !this.onSending && this.inquiryForm.get('network').valid && (<FormArray>this.inquiryForm.get('sitesToQuery')).controls.some(x => (<FormGroup>x).controls.check.value == true);
  }

  onSend() {
    this.onSending = true;
    const requestGroupUUID = this.generateUUID();
    let responses = [];
      
    let requests = this.inquiryForm.value.sitesToQuery.map((site) => {      
      if(site.check){
        let inqName = this.inquiryForm.value.inquiryName;
        if(this.inquiryForm.value.queryType === 'TABLE') inqName += "(Table)";
        let dType = this.inquiryForm.value.queryType === 'AGGREGATE' ? 'SQL_QUERY' : 'SQL_DOWNLOAD';

        return {
          requestSite: {
            siteId: site.siteId,
            name: site.name
          }, 
          network: {
            networkId: this.inquiryForm.value.network || this.networks[0].networkId
          },
          requestGroup: requestGroupUUID,
          inquiry: {
            version: 1,
            dataType: dType,
            queryType: this.inquiryForm.value.queryType,
            code: [
                {
                  code: this.inquiryForm.get('query').get('ansi').value,
                  dialect: 'ANSI'
                },
                {
                  code: this.inquiryForm.get('query').get('oracle').value,
                  dialect: 'ORACLE'
                },
                {
                  code: this.inquiryForm.get('query').get('sqlServer').value,
                  dialect: 'SQL_SERVER'
                }
              ],
            inquiryName: inqName,
            inquiryDescription: this.inquiryForm.value.inquiryDescription
          }
        };

        // return this.requestService.sendRequest(request)
        //                           .map(data => {
        //                             responses.push(data);
        //                           })
        //                           .catch(error => {
        //                             responses.push(error);
        //                             return Observable.throw(error);
        //                           })
      }
    });

    // Observable.forkJoin(aa).subscribe(() => {
    //   // $('#myRequestModal').modal('hide');
    //   // this.requestSent.emit(true);
    // },
    // error => {
    //   // $('#myRequestModal').modal('hide');
    //   // this.requestSent.emit(true);
    // });

    $('#myRequestModal').modal('hide');
    this.requestSent.emit(true);
    this.requests.emit(requests.filter(r => { return r != undefined }));
  }

  networkOnChange(value){
    let network = this.networks.find(n => n.networkId === value);
    this.authenticationService.renewjwt(network.networkId);
    if(network === undefined) {
      this.inquiryForm.setControl('sitesToQuery', this.fb.array([]));
    } else {
      this.siteService.getSites(network)
                      .subscribe(sites => {
                        const siteFGs = sites.map(site => this.fb.group({"name": site.name, "siteId": site.siteId, "check": false}));
                        const siteFormArray = this.fb.array(siteFGs);
                        this.inquiryForm.setControl('sitesToQuery', siteFormArray);
                      }, error => {
                        $('#myRequestModal').modal('hide');
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

  plusANSIClick(){
    this.sqlDialect.ansi = true;
    this.inquiryForm.get('query').get('ansi').setValidators([Validators.required]);
    this.inquiryForm.get('query').get('ansi').updateValueAndValidity();
    this.lastAddedTab = "ansi";
  }

  plusORACLEClick(){
    this.sqlDialect.oracle = true;
    this.inquiryForm.get('query').get('oracle').setValidators([Validators.required]);
    this.inquiryForm.get('query').get('oracle').updateValueAndValidity();
    this.lastAddedTab = "oracle";
  }

  plusSQLSERVERClick(){
    this.sqlDialect.sqlServer = true;
    this.inquiryForm.get('query').get('sqlServer').setValidators([Validators.required]);
    this.inquiryForm.get('query').get('sqlServer').updateValueAndValidity();
    this.lastAddedTab = "sql_server";
  }

  onANSITabClose(){
    this.sqlDialect.ansi = false;
    this.inquiryForm.get('query').get('ansi').setValue("");
    this.inquiryForm.get('query').get('ansi').clearValidators();
    this.inquiryForm.get('query').get('ansi').updateValueAndValidity();
    if(this.sqlDialect.oracle){
      this.lastAddedTab = "oracle";
    } else if(this.sqlDialect.sqlServer){
      this.lastAddedTab = "sql_server";
    }
  }

  onORACLETabClose(){
    this.sqlDialect.oracle = false;
    this.inquiryForm.get('query').get('oracle').setValue("");
    this.inquiryForm.get('query').get('oracle').clearValidators();
    this.inquiryForm.get('query').get('oracle').updateValueAndValidity();
    if(this.sqlDialect.oracle){
      this.lastAddedTab = "oracle";
    } else if(this.sqlDialect.ansi){
      this.lastAddedTab = "ansi";
    }
  }

  onSQLSERVERTabClose(){
    this.sqlDialect.sqlServer = false;
    this.inquiryForm.get('query').get('sqlServer').setValue("");
    this.inquiryForm.get('query').get('sqlServer').clearValidators();
    this.inquiryForm.get('query').get('sqlServer').updateValueAndValidity();
    if(this.sqlDialect.oracle){
      this.lastAddedTab = "oracle";
    } else if(this.sqlDialect.ansi){
      this.lastAddedTab = "ansi";
    }
  }
}

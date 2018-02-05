import { Component, OnInit, EventEmitter, Input, Output } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { NewQuery } from '../../../models/new-query.model';
import { NetworkService } from '../../../services/network.service';
import { SiteService } from '../../../services/site.service';
import { AuthenticationService } from '../../../services/authentication.service';
import { RequestService } from '../../../services/request.service';
import { Router } from '@angular/router';
import { BoundCallbackObservable } from 'rxjs/observable/BoundCallbackObservable';

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

  @Output() requestSent: EventEmitter<boolean> = new EventEmitter<boolean>();

  constructor(private fb: FormBuilder,
              private networkService: NetworkService,
              private siteService: SiteService,
              private requestService: RequestService,
              private authenticationService: AuthenticationService,
              private router: Router) { }

  createForm(inquiry) {
    if(inquiry){
      this.inquiryForm = this.fb.group({
        network: '',
        sitesToQuery: this.fb.array([]),
        dataType:['aggregate'],
        inquiryName: [inquiry.inquiryName, Validators.required],
        studyName: '',
        inquiryDescription: inquiry.inquiryDescription,
        oracleQuery: '',
        sqlQuery: [inquiry.code, Validators.required]
      });
    } else {
      this.inquiryForm = this.fb.group({
        network: '',
        sitesToQuery: this.fb.array([]),
        dataType: ['aggregate'],
        inquiryName: ['', Validators.required],
        studyName: '',
        inquiryDescription: '',
        oracleQuery: '',
        sqlQuery: ['', Validators.required]
      });
    }
  }

  get inquiryName() { return this.inquiryForm.get('inquiryName'); }
  get inquiryDescription() { return this.inquiryForm.get('inquiryDescription'); }
  get sqlQuery() { return this.inquiryForm.get('sqlQuery'); }
  get network() { return this.inquiryForm.get('network'); }
  get sitesToQuery() { return this.inquiryForm.get('sitesToQuery'); }
  get dataType() { return this.inquiryForm.get('dataType'); }

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
    if(this.editingInquiry) {
      this.requestService.updateInquiry(this.editingInquiry.inquiryId, this.inquiryForm.value)
                         .subscribe();
    } else {
      this.requestService.saveInquires(this.inquiryForm.value)
                        .subscribe();
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
                                              const siteFGs = sites.map(site => this.fb.group({"name": site.name, "siteId": site.siteId, "check": false}));
                                              const siteFormArray = this.fb.array(siteFGs);
                                              this.inquiryForm.setControl('sitesToQuery', siteFormArray);
                                            }, error => {
                                              $('#myRequestModal').modal('hide');
                                            });
                          } else {
                            this.inquiryForm.get('inquiryName').markAsTouched();
                            this.inquiryForm.get('sqlQuery').markAsTouched();
                          }
                        });
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

  onSend(){
    this.onSending = true;
    const requestGroupUUID = this.generateUUID();
    this.inquiryForm.value.sitesToQuery.forEach((site) => {
      if(site.check){
        const request = {
          requestSite: {
            siteId: site.siteId,
          },
          network: {
            networkId: this.inquiryForm.value.network || this.networks[0].networkId
          },
          requestGroup: requestGroupUUID,
          inquiry: {
            version: 1,
            dataType: 'SQL_QUERY',
            aggregate: true,
            code: this.inquiryForm.value.sqlQuery,
            inquiryName: this.inquiryForm.value.inquiryName,
            inquiryDescription: this.inquiryForm.value.inquiryDescription
          }
        };

        this.requestService.sendRequest(request)
                          .subscribe(data => {
                            //location.reload();
                            $('#myRequestModal').modal('hide');
                            this.requestSent.emit(true);
                          },
                          error => {
                            $('#myRequestModal').modal('hide');
                            this.requestSent.emit(true);
                          });
      }
    })
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
}

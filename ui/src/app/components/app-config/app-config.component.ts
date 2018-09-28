import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { DaqueryService } from '../../services/daquery.service';
import { AuthenticationService } from '../../services/authentication.service';
import { Observable } from 'rxjs/Observable';
import { environment } from '../../../environments/environment';

@Component({
  selector: 'app-app-config',
  templateUrl: './app-config.component.html',
  styleUrls: ['./app-config.component.css']
})
export class AppConfigComponent implements OnInit {
  model: any = {};
  loading = false;
  error = '';
  success = false;
  updating: boolean = false;
  updated: boolean = false;
  updated_success: boolean = false;
  update_message: String;
  updateAvailable: any;
  updated_success: boolean = false;
  update_message: String;

  appConfigForm: FormGroup;
  constructor(private fb: FormBuilder,
              private daqueryService: DaqueryService,
              private authenticationService: AuthenticationService) { 
    this.createForm();
    this.getConfig();
  }

  createForm() {
    this.appConfigForm = this.fb.group({
      taskQueueMaxLength: ['', [Validators.required, Validators.min(1)]],
      exportTaskQueueMaxLength: ['', [Validators.required, Validators.min(1)]],
      deliverData:  ['', [Validators.required]],
      // threeDigitZip: ['', [Validators.required]],
      // dateShift: ['', [Validators.required]],
      fileOutputDir: ['', [Validators.required]],
      localDeliveryDir: ['', [Validators.required]],
      trackingOutputDir: ['', [Validators.required]],
      tempFileExportDir: ['', [Validators.required]],
      casePerFile: ['', Validators.required]
    })
  }

  get taskQueueMaxLength() { return this.appConfigForm.get('taskQueueMaxLength'); }
  get exportTaskQueueMaxLength() { return this.appConfigForm.get('exportTaskQueueMaxLength'); }
  get deliverData() { return this.appConfigForm.get('deliverData'); }
  // get threeDigitZip() { return this.appConfigForm.get('threeDigitZip'); }
  // get dateShift() { return this.appConfigForm.get('dateShift'); }
  get fileOutputDir() { return this.appConfigForm.get('fileOutputDir'); }
  get localDeliveryDir() { return this.appConfigForm.get('localDeliveryDir'); }
  get trackingOutputDir() { return this.appConfigForm.get('trackingOutputDir'); }
  get tempFileExportDir() { return this.appConfigForm.get('tempFileExportDir'); }
  get casePerFile() { return this.appConfigForm.get('casePerFile'); }

  ngOnInit() {
    this.isUpdateAvailable();
  }

  getConfig(){
    this.daqueryService.getAppConfig()
                       .subscribe(res => {
                        this.appConfigForm.get('taskQueueMaxLength').setValue(parseInt(res.taskQueueMaxLength));
                        this.appConfigForm.get('exportTaskQueueMaxLength').setValue(parseInt(res.exportTaskQueueMaxLength));
                        this.appConfigForm.get('deliverData').setValue(res.deliverData);
                        // this.appConfigForm.get('threeDigitZip').setValue(res.threeDigitZip);
                        // this.appConfigForm.get('dateShift').setValue(res.dateShift);
                        this.appConfigForm.get('fileOutputDir').setValue(res.fileOutputDir);
                        this.appConfigForm.get('localDeliveryDir').setValue(res.localDeliveryDir);
                        this.appConfigForm.get('trackingOutputDir').setValue(res.trackingOutputDir);
                        this.appConfigForm.get('tempFileExportDir').setValue(res.tempFileExportDir);
                        this.appConfigForm.get('casePerFile').setValue(res.casePerFile);
                       })
  }

  updateConfig() {
    this.loading = true;
    this.daqueryService.updateAppConfig(this.appConfigForm.value)
                       .subscribe(res => {
                          this.loading = false;
                          this.success = true;
                          setTimeout(() => {
                            this.success = false;
                          }, 3000);
                       }, err => {
                          this.loading = false;
                       });
  }

  systemUpdate(){
    if(confirm("Are you sure to update daquery?")){
      this.updating = true;
      let currentBuild = -1;
      this.daqueryService.getVersion()
                        .subscribe(res => {
                          currentBuild = parseInt(res.match(/build \d{4}/)[0].substr(6));
                          this.daqueryService.systemUpdate()
                                             .subscribe(res => {
                                               console.log("get version.");
                                               let subscription = Observable.interval(1000 * environment.responseCheckIntervalInSecond).subscribe(x => {
                                                 // // get version every 5 sec 
                                                 this.daqueryService.checkUpdate()
                                                                    .subscribe(res => {
                                                                      this.updating = false;
                                                                      this.updated = true;
                                                                      let update_res = JSON.parse(res);
                                                                      this.updated_success = update_res.status === 'updated';
                                                                      this.update_message = update_res.message;
                                                                      // let updatedBuild = parseInt(res.match(/build \d{4}/)[0].substr(6));
                                                                      // this.updated = updatedBuild >= currentBuild;
                                                                      subscription.unsubscribe();
                                                                    }, error => {
                                                                      console.log("error");
                                                                      console.log(error);
                                                                    }, () => {
                                                                      console.log("finally");
                                                                    });
                                                })
                                             }, err => {
                                               console.log("error.")
                                               this.updating = false;
                                             });
      });
    }
  }

  OK(){
    this.authenticationService.logout();
  }

  isUpdateAvailable() {
    this.daqueryService.isUpdateAvailable()
                       .subscribe(res => {
                         if(res == null || res.updateAvailable === false){
                         } else {
                           this.updateAvailable = true;
                         }
                       });
  }
}

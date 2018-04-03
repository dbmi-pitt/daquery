import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { DaqueryService } from '../../services/daquery.service';

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

  appConfigForm: FormGroup;
  constructor(private fb: FormBuilder,
              private daqueryService: DaqueryService) { 
    this.createForm();
    this.getConfig();
  }

  createForm() {
    this.appConfigForm = this.fb.group({
      taskQueueMaxLength: ['', [Validators.required, Validators.min(1)]],
      exportTaskQueueMaxLength: ['', [Validators.required, Validators.min(1)]],
      deliverData:  ['', [Validators.required]],
      threeDigitZip: ['', [Validators.required]],
      dateShift: ['', [Validators.required]],
      fileOutputDir: ['', [Validators.required]],
      localDeliveryDir: ['', [Validators.required]]
    })
  }

  get taskQueueMaxLength() { return this.appConfigForm.get('taskQueueMaxLength'); }
  get exportTaskQueueMaxLength() { return this.appConfigForm.get('exportTaskQueueMaxLength'); }
  get deliverData() { return this.appConfigForm.get('deliverData'); }
  get threeDigitZip() { return this.appConfigForm.get('threeDigitZip'); }
  get dateShift() { return this.appConfigForm.get('dateShift'); }
  get fileOutputDir() { return this.appConfigForm.get('fileOutputDir'); }
  get localDeliveryDir() { return this.appConfigForm.get('localDeliveryDir'); }

  ngOnInit() {
  }

  getConfig(){
    this.daqueryService.getAppConfig()
                       .subscribe(res => {
                        this.appConfigForm.get('taskQueueMaxLength').setValue(parseInt(res.taskQueueMaxLength));
                        this.appConfigForm.get('exportTaskQueueMaxLength').setValue(parseInt(res.exportTaskQueueMaxLength));
                        this.appConfigForm.get('deliverData').setValue(res.deliverData);
                        this.appConfigForm.get('threeDigitZip').setValue(res.threeDigitZip);
                        this.appConfigForm.get('dateShift').setValue(res.dateShift);
                        this.appConfigForm.get('fileOutputDir').setValue(res.fileOutputDir);
                        this.appConfigForm.get('localDeliveryDir').setValue(res.localDeliveryDir);
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
}

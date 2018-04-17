import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { Network } from '../../../../models/network.model';
import { NetworkService } from '../../../../services/network.service';
import { SiteService } from '../../../../services/site.service';
import { ActivatedRoute, Params } from '@angular/router';
import { Observable } from 'rxjs/Observable';
import { validateConfig } from '@angular/router/src/config';

@Component({
  selector: 'app-deid-props',
  templateUrl: './deid-props.component.html',
  styleUrls: ['./deid-props.component.css']
})
export class DeidPropsComponent implements OnInit {

  submitted = false;
  network_id: number;
  network: any = null;
  datamodel: any = null;
  sqldatasource: any = null;
  deidForm: FormGroup;
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

      const obfuscateChange$ = this.deidForm.get('obfuscate').valueChanges;
      obfuscateChange$.subscribe(val => {
        if(val){
          this.deidForm.get('obfuscateType').setValidators([Validators.required]);
          this.deidForm.get('obfuscateType').updateValueAndValidity();
          this.deidForm.get('threshold').setValidators([Validators.required, Validators.min(0)]);
          this.deidForm.get('threshold').updateValueAndValidity();
        } else {
          this.deidForm.get('obfuscateType').clearValidators();
          this.deidForm.get('obfuscateType').updateValueAndValidity();
          this.deidForm.get('range').clearValidators();
          this.deidForm.get('range').updateValueAndValidity();
          this.deidForm.get('percentage').clearValidators();
          this.deidForm.get('percentage').updateValueAndValidity();
          this.deidForm.get('threshold').clearValidators();
          this.deidForm.get('threshold').updateValueAndValidity();
        }
      });
      const obfuscateTypeChange$ = this.deidForm.get('obfuscateType').valueChanges;
      obfuscateTypeChange$.subscribe(val => {
        if(val == 'range'){
          this.deidForm.get('range').setValidators([Validators.required, Validators.min(0)]);
          this.deidForm.get('range').updateValueAndValidity();
        } else if (val == 'percentage'){
          this.deidForm.get('percentage').setValidators([Validators.required, Validators.max(1), Validators.min(0)]);
          this.deidForm.get('percentage').updateValueAndValidity();
        }
      });
      const dateShiftingChange$ = this.deidForm.get('dateShifting').valueChanges;
      dateShiftingChange$.subscribe(val => {
        if(val){
          this.deidForm.get('minDateShift').setValidators([Validators.required, Validators.min(0)]);
          this.deidForm.get('minDateShift').updateValueAndValidity();
          this.deidForm.get('maxDateShift').setValidators([Validators.required, Validators.min(0)]);
          this.deidForm.get('maxDateShift').updateValueAndValidity();
        } else {
          this.deidForm.get('minDateShift').clearValidators();
          this.deidForm.get('minDateShift').updateValueAndValidity();
          this.deidForm.get('maxDateShift').clearValidators();
          this.deidForm.get('maxDateShift').updateValueAndValidity();
        }
      });
    });
  }

  get obfuscate() { return this.deidForm.get('obfuscate'); }
  get obfuscateType() { return this.deidForm.get('obfuscateType'); }
  get range() { return this.deidForm.get('range'); }
  get percentage() { return this.deidForm.get('percentage'); }
  get threshold() { return this.deidForm.get('threshold'); }
  get dateShifting() { return this.deidForm.get('dateShifting'); }
  get minDateShift() { return this.deidForm.get('minDateShift'); }
  get maxDateShift() { return this.deidForm.get('maxDateShift'); }
  get serializeID() { return this.deidForm.get('serializeID'); }

  createForm() {
    this.deidForm = this.fb.group({
      obfuscate: [''],
      obfuscateType: [''],
      range: [''],
      percentage: [''],
      threshold: [''],
      dateShifting: [''],
      minDateShift: [''],
      maxDateShift: [''],
      serializeID: ['']
    })
  }

  loadForm(network: any) {
    this.deidForm.get('obfuscate').setValue(network.obfuscateAggregateResults);
    this.deidForm.get('obfuscateType').setValue(network.aggregateObfuscateType);
    this.deidForm.get('range').setValue(network.aggregateObfuscateRange);
    this.deidForm.get('percentage').setValue(network.aggregateObfuscatePercent);
    this.deidForm.get('threshold').setValue(network.aggregateObfuscateThreshold);
    this.deidForm.get('dateShifting').setValue(network.shiftDates);
    this.deidForm.get('minDateShift').setValue(network.minDateShift);
    this.deidForm.get('maxDateShift').setValue(network.maxDateShift);
    this.deidForm.get('serializeID').setValue(network.serializePatientId);

  }

  getNetwork(id: number){
    this.networkService.getNetwork(id)
                       .subscribe(network => {
                          this.network = network;
                          this.loadForm(network);
                        });
  }

  onSubmit(){
    if(this.deidForm.valid){
      let network = {
        obfuscateAggregateResults: this.deidForm.get('obfuscate').value,
        aggregateObfuscateType: this.deidForm.get('obfuscateType').value,
        aggregateObfuscateRange: this.deidForm.get('range').value,
        aggregateObfuscatePercent: this.deidForm.get('percentage').value,
        aggregateObfuscateThreshold: this.deidForm.get('threshold').value,
        shiftDates: this.deidForm.get('dateShifting').value,
        minDateShift: this.deidForm.get('minDateShift').value,
        maxDateShift: this.deidForm.get('maxDateShift').value,
        serializePatientId: this.deidForm.get('serializeID').value
      };
      this.success = false;
      this.error = null;
      this.networkService.updateNetworkDeIDProps(this.network.networkId, network)
                         .subscribe(res => {
                           this.success = true;
                         }, err => {
                           this.error = err.error;
                         });
    }
  }
}

import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { SetupService } from '../../services/setup.service';
import { Router } from '@angular/router';

declare var $:any;

@Component({
  selector: 'app-setup',
  templateUrl: './setup.component.html',
  styleUrls: ['./setup.component.css']
})
export class SetupComponent implements OnInit {
  setupForm: FormGroup;
  loading = false;
  error = '';

  constructor(
              private router: Router,
              private fb: FormBuilder,
              private setupService: SetupService) { }

  ngOnInit() {
    this.setupService.getSetup()
                     .subscribe(isSetup => {
                        if(isSetup === 'Y'){
                          this.router.navigate(['/login']);
                        }
                      });
    this.createForm();
  }

  createForm() {
    this.setupForm = this.fb.group({
      sitename: ['', Validators.required],
      sitekey: ['', Validators.required],
      adminemail: ['', [Validators.required, Validators.email]],
      adminemail_confirmation: ['', [Validators.required, Validators.email]],
      adminpwd: ['', [Validators.required, Validators.minLength(8)]],
      adminpwd_confirmation: ['', [Validators.required, Validators.minLength(8)]],
      adminrealname: ['', [Validators.required, Validators.maxLength(20)]]
    })
  }

  get sitename() { return this.setupForm.get('sitename'); }
  get sitekey() { return this.setupForm.get('sitekey'); }
  get adminemail() { return this.setupForm.get('adminemail'); }
  get adminemail_confirmation() { return this.setupForm.get('adminemail_confirmation'); }
  get adminpwd() { return this.setupForm.get('adminpwd'); }
  get adminpwd_confirmation() { return this.setupForm.get('adminpwd_confirmation'); }
  get adminrealname() { return this.setupForm.get('adminrealname'); }
  
  onSubmit() {
    if(this.setupForm.valid){
      this.loading = true;
      this.setupService.setupSite(this.setupForm.value)
                      .subscribe(response => {
                        localStorage.setItem('currentUser', JSON.stringify(response['user']));
                        localStorage.setItem('jwt', JSON.stringify(response['token']));
                        this.router.navigate(['/queries-from-me']);
                      },
                        error => {
                          if(error.status === 401){
                            this.loading = false;
                            this.error['displayMessage'] = "Invalid Site-name and Site-key combination."
                          } else if(error.status === 500){
                            this.loading = false;
                            this.error = error.error;
                          } else if(error.status === 404){
                            this.loading = false;
                            this.error['displayMessage'] = "Please ask the Daquery developers to check your application.properties file to make sure the central.server.url is set correctly."
                          }
                        });
    } else {
      Object.keys(this.setupForm.controls).forEach(k => {
        this.setupForm.get(k).markAsTouched();
      })
    }
  }

  showErrorInfo(){
    $('#myErrorModal').modal('show');
  }
}

import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { EqualValidator } from '../../validators/equal-validator.directive';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-change-password',
  templateUrl: './change-password.component.html',
  styleUrls: ['./change-password.component.css']
})
export class ChangePasswordComponent implements OnInit {
  model: any = {};
  loading = false;
  error = '';
  success = false;

  changePasswordForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private userService: UserService) { }

  ngOnInit() {
    this.createForm();
  }

  createForm() {
    this.changePasswordForm = this.fb.group({
      old_password: ['', Validators.required],
      new_password: ['', [Validators.required, Validators.minLength(8), Validators.pattern(/^((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&*]))(?=.{8,16}$)/)]],
      new_password_confirmation:  ['', [Validators.required, Validators.minLength(8)]],
    })
  }

  get old_password() { return this.changePasswordForm.get('old_password'); }
  get new_password() { return this.changePasswordForm.get('new_password'); }
  get new_password_confirmation() { return this.changePasswordForm.get('new_password_confirmation'); }

  changePassword(){
    this.loading = true;
    const currentUser = this.userService.getCurrentUser();
    const user = {
      id: currentUser.id,
      newPassword: this.changePasswordForm.controls["new_password"].value,
      oldPassword: this.changePasswordForm.controls["old_password"].value,
      utype: 'FULL'
    };
    this.userService.changePassword(user)
                    .subscribe(res => {
                      this.error = '';
                      this.loading = false;
                      this.success = true;
                      this.changePasswordForm.reset();
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

}

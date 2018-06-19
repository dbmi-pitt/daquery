import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../../services/user.service';3
import { Router } from '@angular/router';

@Component({
  selector: 'app-force-change-password',
  templateUrl: './force-change-password.component.html',
  styleUrls: ['./force-change-password.component.css']
})
export class ForceChangePasswordComponent implements OnInit {

  error: any;
  loading = false;
  changePasswordForm: FormGroup;

  constructor(private fb: FormBuilder,
    private userService: UserService,
    private router: Router) { }

  ngOnInit() {
    this.createForm();
  }

  createForm() {
    this.changePasswordForm = this.fb.group({
      new_password: ['', [Validators.required, Validators.minLength(8)]],
      new_password_confirmation:  ['', [Validators.required, Validators.minLength(8)]],
    })
  }

  get new_password() { return this.changePasswordForm.get('new_password'); }
  get new_password_confirmation() { return this.changePasswordForm.get('new_password_confirmation'); }

  changePassword(){
    this.loading = true;
    const user = {
      id:  localStorage.getItem('currentUserId'),
      newPassword: this.changePasswordForm.controls["new_password"].value,
      utype: 'FULL'
    };
    this.userService.forceChangePassword(user)
                    .subscribe(res => {
                      localStorage.setItem('currentUser', JSON.stringify(res['user']));
                      localStorage.setItem('currentUserId', '');
                      this.router.navigate(['/queries-to-me']);
                    }, error => {
                      this.loading = false;
                      this.error = error.error;
                    });
  }
}

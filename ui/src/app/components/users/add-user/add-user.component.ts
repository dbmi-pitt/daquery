import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../../../services/user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css'],
})
export class AddUserComponent implements OnInit {

  userForm: FormGroup;
  @Output()
  showAddUser = new EventEmitter<boolean>();
  @Output()
  newUser = new EventEmitter<any>();
  constructor(private fb: FormBuilder, private userService: UserService) { }

  ngOnInit() {
    this.createForm();
  }

  createForm() {
    this.userForm = this.fb.group({
      email: [null, Validators.required],
      password: [null, Validators.required],
      password_confirmation: [null, Validators.required]
    });

    this.userForm.valueChanges.subscribe(data => this.onValueChange(data));
  }

  onValueChange(data?: any) {
    if(!this.userForm) { return; }
    const form = this.userForm;

    for (const field in this.formErrors) {
      this.formErrors[field] = '';
      const control = form.get(field);

      if(control && control.dirty && !control.valid) {
        const messages = this.validationMessages[field];
        for(const key in control.errors) {
          this.formErrors[field] += messages[key] + ' ';
        }
      }
    }
  }

  onSubmit() {
    this.userService.createUser(this.userForm.value)
                    .subscribe(res => this.newUser.emit(res));
    this.showAddUser.emit(false);
  }

  formErrors = {
    'email': '',
    'password': '',
    'password_confirmation': ''
  }

  validationMessages = {
    'email': {
      'required': 'Email is required'
    },
    'password': {
      'required': 'Password is required'
    },
    'password_confirmation': {
      'required': 'Password Confirmation is required'
    }
  }
}

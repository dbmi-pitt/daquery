import { Component, OnInit } from '@angular/core';
import { UserService } from '../../../services/user.service';
import { ActivatedRoute, Params } from '@angular/router';
import { Observable } from 'rxjs/Observable';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {

  user_id: string;
  user$: Observable<any>
  editMode = false
  profileForm: FormGroup
  submitting = false

  constructor(private userService: UserService,
              private activatedRoute: ActivatedRoute,
              private fb: FormBuilder,) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe((params: Params) => {
      this.user_id = params['id'];
      this.user$ = this.userService.getUser(this.user_id);
      this.createForm();
    });
  }

  createForm() {
    this.profileForm = this.fb.group({
      realName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      newPassword: ['', [Validators.required, Validators.minLength(8)]],
    })
  }

  get realName() { return this.profileForm.get('realName'); }
  get email() { return this.profileForm.get('email'); }
  get newPassword() { return this.profileForm.get('newPassword'); }

  listRoles(roles: any[]): string{
    return roles.map(r => r.name).join(', ');
  }

  onSubmit() {
    this.submitting = true;
    if(this.profileForm.valid){
      const user = Object.assign({
        id: this.user_id,
        utype: 'FULL'
      }, this.profileForm.value);
      this.userService.updateUser(user)
                      .subscribe(res => {
                        this.editMode = false;
                        this.submitting = false;
                        this.user$ = this.userService.getUser(this.user_id);
                      })
    }
  }
}

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
  user: any;
  editMode = false
  profileForm: FormGroup
  submitting = false
  local_roles: any[];

  constructor(private userService: UserService,
              private activatedRoute: ActivatedRoute,
              private fb: FormBuilder,) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe((params: Params) => {
      this.user_id = params['id'];
      this.userService.getUser(this.user_id)
                      .subscribe(res => {
                        this.user = res;
                        this.getLocalRoles();
                        this.createForm();
                      })
    });
  }

  createForm() {
    this.profileForm = this.fb.group({
      realName: [this.user.realName, Validators.required],
      roles: this.fb.array([]),
      email: [this.user.email, [Validators.required, Validators.email]],
      newPassword: ['', [Validators.required, Validators.minLength(8)]],
    })
  }

  get realName() { return this.profileForm.get('realName'); }
  get roles() { return this.profileForm.get('roles'); }
  get email() { return this.profileForm.get('email'); }
  get newPassword() { return this.profileForm.get('newPassword'); }

  listRoles(roles: any[]): string{
    return roles.map(r => r.name).join(', ');
  }

  getLocalRoles() {
    this.userService.getLocalRoles()
                    .subscribe(res => {
                      this.local_roles = [];
                      for(let role of res){
                        let check = this.user.roles.find(x => x['name'] == role['name']) ? true : false;
                        this.local_roles.push([role['name'], check]);
                        (<FormArray>this.profileForm.get('roles')).push(this.fb.group({ "name": role['name'], "check": check }));
                      }
                    });
  }

  onSubmit() {
    this.submitting = true;
    if(this.profileForm.valid){
      const user = Object.assign({
        id: this.user_id,
        utype: 'FULL'
      }, this.profileForm.value);
      user.roles = user.roles.filter(r => r.check === true).map(r => {
        delete r['check'];
        return r;
      });
      this.userService.updateUser(user)
                      .subscribe(res => {
                        this.editMode = false;
                        this.submitting = false;
                        this.userService.getUser(this.user_id)
                                        .subscribe(res => {
                                          this.user = res;
                                        })
                      })
    }
  }
}

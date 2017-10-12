import { Component, OnInit } from '@angular/core';
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

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  changePasswod(){
    this.loading = true;
    const currentUser = JSON.parse(localStorage.getItem('currentUser'));
    const user = {
      id: currentUser.id,
      newPassword: this.model.new_password,
      oldPassword: this.model.old_password
    };
    this.userService.changePassword(user)
                    .subscribe(res => {
                      if(res == true){
                        this.error = '';
                        this.loading = false;
                        this.success = true;
                        setTimeout(() => {
                          this.success = false;
                        }, 3000);
                      } else {
                        this.error = 'Your password is incorrect';
                        this.loading = false;
                      }
                    });
  }

}

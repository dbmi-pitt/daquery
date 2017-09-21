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

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  changePasswod(){
    const currentUser = JSON.parse(localStorage.getItem('currentUser'));
    const user = {
      id: currentUser.id,
      password: this.model.new_password,
      old_password: this.model.old_password
    };
    this.userService.changePassword(user)
                    .subscribe(res => {
                      
                    });
  }

}

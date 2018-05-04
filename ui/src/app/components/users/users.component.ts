import { Component, OnInit, ViewChild } from '@angular/core';
import { UserService } from '../../services/user.service';
import { User } from '../../models/user.model';
import { LocalUserComponent } from 'app/components/users/local-user/local-user.component';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  showAddUser = false;
  users: User[];
  @ViewChild(LocalUserComponent)  private localUserComponent: LocalUserComponent;
  constructor(private userService: UserService) {
  }

  ngOnInit() {
    this.getUsers();
  }

  getUsers() {
    this.userService.getUsers()
                    .subscribe(users => {
                      this.users = users
                    });
  }

  toggleShowAddUser(showAddUser: boolean) {
    this.showAddUser = showAddUser;
  }

  addNewUser(user: any) {
    this.showAddUser = false;
    this.users.unshift(user);
    this.localUserComponent.getLocalRoles();
  }
}

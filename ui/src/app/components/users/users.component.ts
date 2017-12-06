import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { User } from '../../models/user.model';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  showAddUser = false;

  users: User[];
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
    this.users.push(user);
  }
}

import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  showAddUser = false;

  users: any[] = [];
  constructor(private userService: UserService) {
    this.users = this.userService.getUsers();
  }

  ngOnInit() {
  }

}

import { Component, OnInit, Input } from '@angular/core';
import { UserService } from '../../../shared/user.service';

@Component({
  selector: 'app-manage-users',
  templateUrl: './manage-users.component.html',
  styleUrls: ['./manage-users.component.css']
})
export class ManageUsersComponent implements OnInit {

  @Input()
  site: any;

  users: any[] = [];
  constructor(private userService: UserService) {
  }

  ngOnInit() {
    this.users = this.userService.getUsersBySite(this.site.name);
  }

}

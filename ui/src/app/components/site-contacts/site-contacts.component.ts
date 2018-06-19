import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { User } from '../../models/user.model';

@Component({
  selector: 'app-site-contacts',
  templateUrl: './site-contacts.component.html',
  styleUrls: ['./site-contacts.component.css']
})
export class SiteContactsComponent implements OnInit {

  users: User[];

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.getAdminUsers();
  }

  getAdminUsers() {
    this.userService.getAdminUsers()
                    .subscribe(users => {
                      this.users = users;
                    });
  }

  onChange(e){
    let user_id = e.target.getAttribute('data-userid');
    let user = this.users.find(u => u.id === user_id);
    if(e.target.checked){
      user['contact'] = true;
      this.userService.addContact(user)
                         .subscribe(res => {
                            console.log(res);
                         });
    } else {
      user['contact'] = false;
      this.userService.removeContact(user)
                         .subscribe(res => {
                            console.log(res);
                         });
    }
  }
}

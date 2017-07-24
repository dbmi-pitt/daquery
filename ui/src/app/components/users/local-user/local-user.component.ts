import { Component, OnInit, Input } from '@angular/core';
import { UserService } from '../../../services/user.service';

@Component({
  selector: 'app-local-user',
  templateUrl: './local-user.component.html',
  styleUrls: ['./local-user.component.css']
})
export class LocalUserComponent implements OnInit {

  @Input()
  user: any;

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  toggleRole(event: any, role: string){
    let user = `{"id": ${event.target.id}, 
                 "roles": {
                   "${role}": ${event.target.checked}
                 } 
                }`;
    this.userService.toggleUserRole(user)
                    .subscribe(res => console.log(res));
  }
}

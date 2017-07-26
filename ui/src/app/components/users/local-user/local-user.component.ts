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
  local_roles: any[] = [];
  showSpin = false;

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.getLocalRoles();
  }

  getLocalRoles() {
    this.userService.getLocalRoles()
                    .subscribe(res => {
                      for(let role of res){
                        this.local_roles.push([role, `is_${role}`]);
                      }
                    });
  }

  toggleRole(event: any, role: string){
    this.showSpin = true;
    let user = `{"id": ${event.target.dataset.userid}, 
                 "roles": {
                   "${role}": ${event.target.checked}
                 } 
                }`;
    this.userService.toggleUserRole(user)
                    .subscribe(res => {
                      console.log(res);
                      this.showSpin = false;
                    });
  }
}

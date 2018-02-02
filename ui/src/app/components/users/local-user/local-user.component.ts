import { Component, OnInit, Input } from '@angular/core';
import { UserService } from '../../../services/user.service';

@Component({
  selector: 'app-local-user',
  templateUrl: './local-user.component.html',
  styleUrls: ['./local-user.component.css']
})
export class LocalUserComponent implements OnInit {

  @Input() user: any;
  roles: any[];
  local_roles: any[] = [];
  showSpin = false;

  constructor(private userService: UserService) { }


  ngOnInit() {
    this.roles = this.user.roles.map(r => r.name).join(', ');
    this.getLocalRoles();
  }

  getLocalRoles() {
    this.userService.getLocalRoles()
                    .subscribe(res => {
                      this.local_roles = [];
                      for(let role of res){
                        let check = this.user.roles.find(x => x['name'] == role['name']) ? true : false;
                        this.local_roles.push([role['name'], check]);
                      }
                    });
  }

  toggleRole(event: any, role: string){
    //this.showSpin = true;
    let user = JSON.parse(`{"id": "${event.target.dataset.userid}", 
                 "roles": {
                   "${role}": ${event.target.checked}
                 } 
                }`);
    this.userService.toggleUserRole(user)
                    .subscribe(res => {
                      //this.showSpin = false;
                    });
  }
}

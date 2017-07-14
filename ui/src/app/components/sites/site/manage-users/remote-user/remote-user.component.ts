import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-remote-user',
  templateUrl: './remote-user.component.html',
  styleUrls: ['./remote-user.component.css']
})
export class RemoteUserComponent implements OnInit {

  @Input()
  user: any;

  constructor() { }

  ngOnInit() {
  }

}

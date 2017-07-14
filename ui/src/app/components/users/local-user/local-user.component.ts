import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-local-user',
  templateUrl: './local-user.component.html',
  styleUrls: ['./local-user.component.css']
})
export class LocalUserComponent implements OnInit {

  @Input()
  user: any;

  constructor() { }

  ngOnInit() {
  }

}

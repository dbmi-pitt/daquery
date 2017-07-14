import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';

@Component({
  selector: 'app-sidebar',
  providers: [Location],
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {
  location: Location;

  constructor(location: Location) {
    this.location = location;
  }

  ngOnInit() {
  }

  isActive(path){
      return this.location.path().indexOf(path) > -1;
  }
  
}

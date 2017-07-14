import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-site',
  templateUrl: './site.component.html',
  styleUrls: ['./site.component.css']
})
export class SiteComponent implements OnInit {
  showManageUser = false;

  @Input()
  site: any;

  constructor() { }

  ngOnInit() {
  }

}

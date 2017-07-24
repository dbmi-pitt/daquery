import { Component, OnInit, Input } from '@angular/core';
import { Site } from '../../../models/site.model';

@Component({
  selector: 'app-site',
  templateUrl: './site.component.html',
  styleUrls: ['./site.component.css']
})
export class SiteComponent implements OnInit {
  showManageUser = false;

  @Input()
  site: Site;

  constructor() { }

  ngOnInit() {
  }

}

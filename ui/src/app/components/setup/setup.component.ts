import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-setup',
  templateUrl: './setup.component.html',
  styleUrls: ['./setup.component.css']
})
export class SetupComponent implements OnInit {
  model: any = {};
  loading = false;
  error = '';

  constructor() { }

  ngOnInit() {
  }

  submit() {
    
  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-step1',
  templateUrl: './step1.component.html',
  styleUrls: ['./step1.component.css']
})
export class Step1Component implements OnInit {
  model: any = {};
  loading = false;
  error = '';

  constructor(private router: Router) { }

  ngOnInit() {
  }

  next() {
    this.router.navigate(['./setup/step2']);
  }
}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-step2',
  templateUrl: './step2.component.html',
  styleUrls: ['./step2.component.css']
})
export class Step2Component implements OnInit {
  model: any = {};
  loading = false;
  error = '';

  constructor(private router: Router) { }

  ngOnInit() {
  }

  next() {
    this.router.navigate(['./setup/step3']);
  }

}

import { Component, OnInit } from '@angular/core';
import { SetupService } from '../../../services/setup.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-step3',
  templateUrl: './step3.component.html',
  styleUrls: ['./step3.component.css']
})
export class Step3Component implements OnInit {
  key_store = true;
  model: any = {};
  loading = false;
  error = '';


  constructor(private router: Router,
              private setupService: SetupService) { }

  ngOnInit() {
    this.setupService.getKeyStore()
                     .subscribe(keystore => {
                       this.key_store = keystore;
                       if(this.key_store){
                          this.model.keytype = '2';
                       } else {
                          this.model.keytype = '1';
                       } 
                     }); 
  }

  submit(){
    this.setupService.setKeyType(this.model.keytype)
                     .subscribe(() => {

                     });
  }

}

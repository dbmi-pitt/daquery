import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { NetworkService } from '../../../services/network.service';
import { Network } from '../../../models/network.model';


@Component({
  selector: 'app-create-network',
  templateUrl: './create-network.component.html',
  styleUrls: ['./create-network.component.css']
})
export class CreateNetworkComponent implements OnInit {

  @Output()
  newNetwork = new EventEmitter<Network>();

  form: FormGroup;
  constructor(private fb: FormBuilder,
              private networkService: NetworkService) { }

  createForm() {
    this.form = this.fb.group({
      name: '',
      database_url: '',
      database_username: '',
      database_password: ''
    })
  }

  ngOnInit() {
    this.createForm();
  }

  onSubmit() {
    this.networkService.createNetwork(this.form.value)
                       .subscribe(network => {
                        this.newNetwork.emit(network);
                       })

  }

}

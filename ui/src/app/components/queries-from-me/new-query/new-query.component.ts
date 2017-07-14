import { Component, OnInit } from '@angular/core';
import { TabsetComponent } from 'ngx-bootstrap';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup } from '@angular/forms';
import { NewQuery } from '../../../models/new-query.model';
import { SiteService } from '../../../services/site.service';

@Component({
  selector: 'app-new-query',
  templateUrl: './new-query.component.html',
  styleUrls: ['./new-query.component.css'],
})
export class NewQueryComponent implements OnInit {

  queryForm: FormGroup;
  sites;
  constructor(private fb: FormBuilder, private siteService: SiteService) { 
    this.sites = siteService.getSites();
    this.createForm();
  }

  createForm() {
    this.queryForm = this.fb.group({
      dataType: '',
      queryName: '',
      studyName: '',
      queryDescription: '',
      oracleQuery: '',
      sqlQuery: '',
      sitesToQuery: this.fb.array([])
    });

    // const siteFGs = this.sites.map(site => this.fb.group({"name": site.name, "check": false}));
    // const siteFormArray = this.fb.array(siteFGs);
    // this.queryForm.setControl('sitesToQuery', siteFormArray);
  }

  ngOnInit() {
  }

  onSubmit() {
    
  }

}

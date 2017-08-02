import { Component, OnInit } from '@angular/core';
import { TabsetComponent } from 'ngx-bootstrap';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup } from '@angular/forms';
import { NewQuery } from '../../../models/new-query.model';
import { SiteService } from '../../../services/site.service';
import { Site } from '../../../models/site.model';

@Component({
  selector: 'app-new-query',
  templateUrl: './new-query.component.html',
  styleUrls: ['./new-query.component.css'],
})
export class NewQueryComponent implements OnInit {

  queryForm: FormGroup;
  sites: Site[];
  constructor(private fb: FormBuilder, private siteService: SiteService) { }

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

    const siteFGs = this.sites.map(site => this.fb.group({"name": site.name, "check": false}));
    const siteFormArray = this.fb.array(siteFGs);
    this.queryForm.setControl('sitesToQuery', siteFormArray);
  }

  get sitesToQuery(): FormArray {
    return this.queryForm.get('sitesToQuery') as FormArray;
  };

  ngOnInit() {
    // this.siteService.getSites()
    //                 .subscribe(sites => {
    //                     this.sites = sites;
    //                     this.createForm();
    //                   });
  }

  onSubmit() {
    
  }

}

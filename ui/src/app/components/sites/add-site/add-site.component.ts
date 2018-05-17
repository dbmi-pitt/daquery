import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, Params } from '@angular/router';
import { NetworkService } from '../../../services/network.service';
import { SiteService } from '../../../services/site.service';
import { DaqueryService } from '../../../services/daquery.service';
import { FormArray, FormBuilder, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-site',
  templateUrl: './add-site.component.html',
  styleUrls: ['./add-site.component.css']
})
export class AddSiteComponent implements OnInit {

  network: any;
  sites: any[];
  aliases: any[];
  loadingAvailableSites = true;
  loadingAlias = false;

  connectSiteForm: FormGroup;
  submitted = false;
  submitting = false;
  constructor(private fb: FormBuilder,
              private networkService: NetworkService,
              private siteService: SiteService,
              private daqueryService: DaqueryService,
              private activatedRoute: ActivatedRoute,
              private router: Router) { }
  
  createForm(network_id: Number) {
    this.connectSiteForm = this.fb.group({
      network_id: network_id,
      site: ['', Validators.required],
      // alias: ['', Validators.required],
      name: ['', Validators.required],
      url: ['', Validators.required],
      admin_email: ['', Validators.required]
    });
  }

  get site() { return this.connectSiteForm.get('site')};
  // get alias() { return this.connectSiteForm.get('alias')};
  get name() { return this.connectSiteForm.get('name')};
  get url() { return this.connectSiteForm.get('url')};
  get admin_email() { return this.connectSiteForm.get('admin_email')};

  ngOnInit() {
    // subscribe to router event
    this.activatedRoute.queryParams.subscribe(async (params: Params) => {
      let id = params['network'];
      this.createForm(id);
      await this.getNetwork(id);
      this.getAvailableSites(this.network);
      this.getAlias();
    });
  }

  onChange(){
    if(this.connectSiteForm.controls["site"].value === 'new'){
      this.connectSiteForm.controls["name"].setValidators(Validators.required);
      this.connectSiteForm.controls["name"].updateValueAndValidity();
      this.connectSiteForm.controls["url"].setValidators(Validators.required);
      this.connectSiteForm.controls["url"].updateValueAndValidity();
      this.connectSiteForm.controls["admin_email"].setValidators(Validators.required);
      this.connectSiteForm.controls["admin_email"].updateValueAndValidity();
    } else if (this.connectSiteForm.controls["site"].value !== 'new'){
      const site = this.sites.find(x => x.siteId === this.connectSiteForm.controls["site"].value);
      this.connectSiteForm.controls["name"].setValue(site.name);
      this.connectSiteForm.controls["name"].updateValueAndValidity();
      this.connectSiteForm.controls["url"].setValue(site.url);
      this.connectSiteForm.controls["url"].updateValueAndValidity();
      this.connectSiteForm.controls["admin_email"].setValue(site.adminEmail);
      this.connectSiteForm.controls["admin_email"].updateValueAndValidity();
    } else {
      this.connectSiteForm.controls["name"].setValidators(null);
      this.connectSiteForm.controls["name"].updateValueAndValidity();
      this.connectSiteForm.controls["url"].setValidators(null);
      this.connectSiteForm.controls["url"].updateValueAndValidity();
      this.connectSiteForm.controls["admin_email"].setValidators(null);
      this.connectSiteForm.controls["admin_email"].updateValueAndValidity();
    }
  }

  onSubmit(){
    this.submitting = true;
    this.submitted = true;
    if(this.connectSiteForm.valid){
      let selectedSite = this.sites.find(x => x.siteId = this.connectSiteForm.controls["site"].value);
      this.siteService.requestConnectSite(this.connectSiteForm.value)
                      .subscribe(site => {
                        alert("Your request to connect to " + selectedSite.name + " has been emailed to " + selectedSite.adminEmail + ".");
                        this.router.navigate([`/networks/${this.network.id}`]);
                      });
    } else {
      this.submitting = false;
    }
  }

  onCancel(){
    this.router.navigate([`/networks/${this.network.id}`]);
  }
  

  getNetwork(id: number): Promise<any>{
    return new Promise((resolve, reject) => {
      this.networkService.getNetwork(id)
                         .subscribe(network => {
                           this.network = network;
                           resolve();
                        });
    });
  }

  getAvailableSites(network: any){
    this.siteService.getAvailableSites(network)
                    .subscribe(data => {
                      this.loadingAvailableSites = false;
                      this.sites = data.full;
                      data.outgoing.forEach(e => {
                        this.sites.map(s => {
                          if(s.siteId === e.siteId)
                            s["connected"] = true;
                        });
                      });
                    });
  }

  getAlias(){
    this.loadingAlias = true;
    this.daqueryService.getAlias()
                       .subscribe(data => {
                         this.loadingAlias = false;
                         this.aliases = data.aliases;
                       })
  }
}

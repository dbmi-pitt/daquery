import { Injectable } from '@angular/core';

@Injectable()
export class SiteService {

  constructor() { }

  sites = [];
  getSites() {
    return this.sites = SITES.slice(0);
  }
}

const SITES = [
  {"id" : 1, "name": "PITT", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 2, "name": "PSU", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 3, "name": "JHU", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
  {"id" : 4, "name": "Utah", "status": "On", "lastTest": "2017-07-01T18:25:42.123Z"},
];
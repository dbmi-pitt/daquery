import { Injectable } from '@angular/core';

@Injectable()
export class UserService {

  constructor() { }

  users = [];
  getUsers() {
  	return this.users = USERS.slice(0);
  }

  remote_users = [];
  getUsersBySite(site: string) {
    return this.remote_users = REMOTE_SITE_USERS.find(s => s.sitename === site).users;
  }
}

const USERS = [
  {"id": 1, "username": "desheng", "signupAt": "2017-05-03T10:12:44.321Z", "roles": {
    "is_admin": true,
    "is_steward": false,
    "is_viewer": false,
  }},
  {"id": 2, "username": "bill", "signupAt": "2017-05-03T10:12:44.321Z", "roles": {
    "is_admin": false,
    "is_steward": true,
    "is_viewer": false,
  }},
  {"id": 1, "username": "chuck", "signupAt": "2017-05-03T10:12:44.321Z", "roles": {
    "is_admin": false,
    "is_steward": false,
    "is_viewer": true,
  }},
]

const REMOTE_SITE_USERS = [
  {"sitename": "PITT", "users": [
    {"username": "desheng", "rights": {
      "aggregate": true,
      "data": true,
    }},
    {"username": "nickie", "rights": {
      "aggregate": true,
      "data": false,
    }},
    {"username": "chuck", "rights": {
      "aggregate": false,
      "data": false,
    }},
  ]},
  {"sitename": "PSU", "users": [
    {"username": "psu-desheng", "rights": {
      "aggregate": true,
      "data": true,
    }},
    {"username": "psu-nickie", "rights": {
      "aggregate": true,
      "data": false,
    }},
    {"username": "psu-chuck", "rights": {
      "aggregate": false,
      "data": false,
    }},
  ]},
  {"sitename": "JHU", "users": [
    {"username": "jhu-desheng", "rights": {
      "aggregate": true,
      "data": true,
    }},
    {"username": "jhu-nickie", "rights": {
      "aggregate": true,
      "data": false,
    }},
    {"username": "jhu-chuck", "rights": {
      "aggregate": false,
      "data": false,
    }},
  ]},
  {"sitename": "Utah", "users": [
    {"username": "utah-desheng", "rights": {
      "aggregate": true,
      "data": true,
    }},
    {"username": "utah-nickie", "rights": {
      "aggregate": true,
      "data": false,
    }},
    {"username": "utah-chuck", "rights": {
      "aggregate": false,
      "data": false,
    }},
  ]}
]
import { Injectable } from '@angular/core';

@Injectable()
export class Session {
  constructor() { }

  get serverExpirationTime(): Date {
    var base64Url =localStorage.getItem('jwt').split('.')[1];
    var base64 = base64Url.replace('-', '+').replace('_', '/');
    let token = JSON.parse(window.atob(base64));
    return new Date(token.exp * 1000);
  }
}
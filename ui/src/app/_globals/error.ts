import { Injectable } from '@angular/core';

@Injectable()
export class Error {
  error: any;
  message: string
  constructor() { }
  /*
  error: { //_global.error
    error: { // HttpErrorResponse
      error: {
        displayMessage: , //
        longMessage: , //
        stackTrace: , //
      }
      ...
      message: //standard http error message 
    }
  }
  */
}
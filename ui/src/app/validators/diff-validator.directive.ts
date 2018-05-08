import { Directive, forwardRef, Attribute } from '@angular/core';
import { Validator, AbstractControl, NG_VALIDATORS } from '@angular/forms';

@Directive({
  selector: '[validateDiff][formControlName],[validateDiff][formControl],[validateDiff][ngModel]',
  providers: [
    { provide: NG_VALIDATORS, useExisting: forwardRef(() => DiffValidator), multi: true }
  ]
})
export class DiffValidator implements Validator {
  constructor(@Attribute('validateDiff') public validateDiff: string,
              @Attribute('diff') public diff: number) { }

  validate(c: AbstractControl): { [key: string]: any } {
    // self value
    let v = c.value;

    // control value
    let e = c.root.get(this.validateDiff);

    // max - min <= diff
    if (e && Math.abs(v - e.value) <= this.diff) {
      return {
        validateDiff: true
       }
    } else {
      if (c.errors && c.errors['validateDiff']) delete c.errors['validateDiff'];
      if (c.errors && !Object.keys(c.errors).length) c.setErrors(null);
    }

    return null;
  }
}
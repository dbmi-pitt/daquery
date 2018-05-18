import { Pipe, PipeTransform } from '@angular/core';

@Pipe({name: 'direction'})
export class Direction implements PipeTransform {
  // Leave the site in given direction and status is connected
  transform(value: any[], args?: string): Object[] {
    return value.filter(c => c.direction.toUpperCase() === args.toUpperCase() && c.status.toUpperCase() === 'CONNECTED');
  }
}

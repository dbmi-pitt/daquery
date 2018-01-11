import { TestBed, inject } from '@angular/core/testing';

import { DaqueryService } from './daquery.service';

describe('DaqueryServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DaqueryService]
    });
  });

  it('should be created', inject([DaqueryService], (service: DaqueryService) => {
    expect(service).toBeTruthy();
  }));
});

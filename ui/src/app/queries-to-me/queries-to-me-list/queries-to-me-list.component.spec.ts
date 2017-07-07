import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QueriesToMeListComponent } from './queries-to-me-list.component';

describe('QueriesToMeListComponent', () => {
  let component: QueriesToMeListComponent;
  let fixture: ComponentFixture<QueriesToMeListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QueriesToMeListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QueriesToMeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QueriesToMeTableComponent } from './queries-to-me-table.component';

describe('QueriesToMeTableComponent', () => {
  let component: QueriesToMeTableComponent;
  let fixture: ComponentFixture<QueriesToMeTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QueriesToMeTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QueriesToMeTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

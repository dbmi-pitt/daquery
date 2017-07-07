import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QueriesToMeComponent } from './queries-to-me.component';

describe('QueriesToMeComponent', () => {
  let component: QueriesToMeComponent;
  let fixture: ComponentFixture<QueriesToMeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QueriesToMeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QueriesToMeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

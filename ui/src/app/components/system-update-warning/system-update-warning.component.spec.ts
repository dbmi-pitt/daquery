import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SystemUpdateWarningComponent } from './system-update-warning.component';

describe('SystemUpdateWarningComponent', () => {
  let component: SystemUpdateWarningComponent;
  let fixture: ComponentFixture<SystemUpdateWarningComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SystemUpdateWarningComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SystemUpdateWarningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

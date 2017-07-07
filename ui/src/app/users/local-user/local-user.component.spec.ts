import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LocalUserComponent } from './local-user.component';

describe('LocalUserComponent', () => {
  let component: LocalUserComponent;
  let fixture: ComponentFixture<LocalUserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LocalUserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LocalUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QueriesFromMeComponent } from './queries-from-me.component';

describe('QueriesFromMeComponent', () => {
  let component: QueriesFromMeComponent;
  let fixture: ComponentFixture<QueriesFromMeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QueriesFromMeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QueriesFromMeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QueriesFromMeListComponent } from './queries-from-me-list.component';

describe('QueriesFromMeListComponent', () => {
  let component: QueriesFromMeListComponent;
  let fixture: ComponentFixture<QueriesFromMeListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QueriesFromMeListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QueriesFromMeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

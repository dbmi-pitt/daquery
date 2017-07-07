import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QueriesFromMeTableComponent } from './queries-from-me-table.component';

describe('QueriesFromMeTableComponent', () => {
  let component: QueriesFromMeTableComponent;
  let fixture: ComponentFixture<QueriesFromMeTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QueriesFromMeTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QueriesFromMeTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

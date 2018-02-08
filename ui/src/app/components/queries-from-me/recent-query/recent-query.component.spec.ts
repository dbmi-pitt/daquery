import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RecentQueryComponent } from './recent-query.component';

describe('RecentQueryComponent', () => {
  let component: RecentQueryComponent;
  let fixture: ComponentFixture<RecentQueryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RecentQueryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RecentQueryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

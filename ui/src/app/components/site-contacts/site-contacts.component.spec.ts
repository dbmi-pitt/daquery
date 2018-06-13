import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SiteContactsComponent } from './site-contacts.component';

describe('SiteContactsComponent', () => {
  let component: SiteContactsComponent;
  let fixture: ComponentFixture<SiteContactsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SiteContactsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SiteContactsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

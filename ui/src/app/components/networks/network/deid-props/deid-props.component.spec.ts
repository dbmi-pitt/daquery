import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeidPropsComponent } from './deid-props.component';

describe('DeidPropsComponent', () => {
  let component: DeidPropsComponent;
  let fixture: ComponentFixture<DeidPropsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeidPropsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeidPropsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

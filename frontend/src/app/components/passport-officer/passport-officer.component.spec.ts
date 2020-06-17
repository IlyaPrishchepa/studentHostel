import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PassportOfficerComponent } from './passport-officer.component';

describe('PassportOfficerComponent', () => {
  let component: PassportOfficerComponent;
  let fixture: ComponentFixture<PassportOfficerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PassportOfficerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PassportOfficerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PassportOfficerHeaderComponent } from './passport-officer-header.component';

describe('PassportOfficerHeaderComponent', () => {
  let component: PassportOfficerHeaderComponent;
  let fixture: ComponentFixture<PassportOfficerHeaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PassportOfficerHeaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PassportOfficerHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

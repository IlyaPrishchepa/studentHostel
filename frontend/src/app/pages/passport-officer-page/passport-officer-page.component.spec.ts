import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PassportOfficerPageComponent } from './passport-officer-page.component';

describe('PassportOfficerPageComponent', () => {
  let component: PassportOfficerPageComponent;
  let fixture: ComponentFixture<PassportOfficerPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PassportOfficerPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PassportOfficerPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

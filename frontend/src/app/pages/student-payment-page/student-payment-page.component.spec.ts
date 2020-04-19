import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentPaymentPageComponent } from './student-payment-page.component';

describe('StudentPaymentPageComponent', () => {
  let component: StudentPaymentPageComponent;
  let fixture: ComponentFixture<StudentPaymentPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentPaymentPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentPaymentPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { StudentPaymentService } from './student-payment.service';

describe('StudentPaymentService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StudentPaymentService = TestBed.get(StudentPaymentService);
    expect(service).toBeTruthy();
  });
});

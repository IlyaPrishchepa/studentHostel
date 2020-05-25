import { TestBed } from '@angular/core/testing';

import { StudentReprimandService } from './student-reprimand.service';

describe('StudentReprimandService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StudentReprimandService = TestBed.get(StudentReprimandService);
    expect(service).toBeTruthy();
  });
});

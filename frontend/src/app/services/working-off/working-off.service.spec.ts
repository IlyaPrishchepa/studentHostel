import { TestBed } from '@angular/core/testing';

import { WorkingOffService } from './working-off.service';

describe('WorkingOffService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: WorkingOffService = TestBed.get(WorkingOffService);
    expect(service).toBeTruthy();
  });
});

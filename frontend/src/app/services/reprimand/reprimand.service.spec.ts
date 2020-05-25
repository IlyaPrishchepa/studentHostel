import { TestBed } from '@angular/core/testing';

import { ReprimandService } from './reprimand.service';

describe('ReprimandService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ReprimandService = TestBed.get(ReprimandService);
    expect(service).toBeTruthy();
  });
});

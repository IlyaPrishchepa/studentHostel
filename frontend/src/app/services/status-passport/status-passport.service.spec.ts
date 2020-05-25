import { TestBed } from '@angular/core/testing';

import { StatusPassportService } from './status-passport.service';

describe('StatusPassportService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StatusPassportService = TestBed.get(StatusPassportService);
    expect(service).toBeTruthy();
  });
});

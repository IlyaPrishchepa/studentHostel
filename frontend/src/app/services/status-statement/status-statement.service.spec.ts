import { TestBed } from '@angular/core/testing';

import { StatusStatementService } from './status-statement.service';

describe('StatusStatementService', () => {
  let service: StatusStatementService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StatusStatementService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

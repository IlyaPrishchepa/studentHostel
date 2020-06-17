import { TestBed } from '@angular/core/testing';

import { DutyTypeService } from './duty-type.service';

describe('DutyTypeService', () => {
  let service: DutyTypeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DutyTypeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

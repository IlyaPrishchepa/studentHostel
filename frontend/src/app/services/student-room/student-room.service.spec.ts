import { TestBed } from '@angular/core/testing';

import { StudentRoomService } from './student-room.service';

describe('StudentRoomService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StudentRoomService = TestBed.get(StudentRoomService);
    expect(service).toBeTruthy();
  });
});

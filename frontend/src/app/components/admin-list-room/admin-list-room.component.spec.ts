import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminListRoomComponent } from './admin-list-room.component';

describe('AdminListRoomComponent', () => {
  let component: AdminListRoomComponent;
  let fixture: ComponentFixture<AdminListRoomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminListRoomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminListRoomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

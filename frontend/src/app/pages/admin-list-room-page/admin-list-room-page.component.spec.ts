import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminListRoomPageComponent } from './admin-list-room-page.component';

describe('AdminListRoomPageComponent', () => {
  let component: AdminListRoomPageComponent;
  let fixture: ComponentFixture<AdminListRoomPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminListRoomPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminListRoomPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

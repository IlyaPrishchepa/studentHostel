import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkerStatemrntComponent } from './worker-statemrnt.component';

describe('WorkerStatemrntComponent', () => {
  let component: WorkerStatemrntComponent;
  let fixture: ComponentFixture<WorkerStatemrntComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WorkerStatemrntComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WorkerStatemrntComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkerStatemrntPageComponent } from './worker-statemrnt-page.component';

describe('WorkerStatemrntPageComponent', () => {
  let component: WorkerStatemrntPageComponent;
  let fixture: ComponentFixture<WorkerStatemrntPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WorkerStatemrntPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WorkerStatemrntPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

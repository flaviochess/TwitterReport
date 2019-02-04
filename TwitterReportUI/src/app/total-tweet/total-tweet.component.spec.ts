import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TotalTweetComponent } from './total-tweet.component';

describe('TotalTweetComponent', () => {
  let component: TotalTweetComponent;
  let fixture: ComponentFixture<TotalTweetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TotalTweetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TotalTweetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { TwitterReportService } from './twitter-report.service';

describe('TwitterReportService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TwitterReportService = TestBed.get(TwitterReportService);
    expect(service).toBeTruthy();
  });
});

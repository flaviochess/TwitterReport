import { Component, OnInit } from '@angular/core';
import { TweetByHour } from '../tweetByHour';
import { TwitterReportService } from '../twitter-report.service';

@Component({
  selector: 'app-total-tweet',
  templateUrl: './total-tweet.component.html',
  styleUrls: ['./total-tweet.component.css']
})
export class TotalTweetComponent implements OnInit {

  tweetsByHour: TweetByHour[];

  constructor(private twitterReportService: TwitterReportService) { }

  ngOnInit() {
    this.getTweetsByHour();
  }

  getTweetsByHour() : void {
    this.twitterReportService.getTweetsByHour().subscribe(tweetsByHour => this.tweetsByHour = tweetsByHour);
  }

}

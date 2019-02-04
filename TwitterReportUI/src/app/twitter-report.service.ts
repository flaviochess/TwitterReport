import { Injectable } from '@angular/core';
import { TwitterUser } from './twitterUser';
import { TWITTER_USERS } from './mock-twitterusers';
import { TweetByHour } from './tweetByHour';
import { TWEETS_HOUR } from './mock-tweets-by-hour';
import { HashtagCountry } from './hashtagCountry';
import { HASHTAGS_COUNTRYS } from './mock-hastags-country';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TwitterReportService {

  constructor() { }

  getTop5TwitterUsers(): Observable<TwitterUser[]> {
    return of(TWITTER_USERS);
  }

  getTweetsByHour() : Observable<TweetByHour[]> {
    return of(TWEETS_HOUR);
  }

  getHashtagsByCountry() : Observable<HashtagCountry[]> {
    return of(HASHTAGS_COUNTRYS);
  }
}

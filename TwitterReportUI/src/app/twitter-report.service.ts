import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { TwitterUser } from './twitterUser';
import { TweetByHour } from './tweetByHour';
import { HashtagLanguage } from './hashtagLanguage';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TwitterReportService {

  constructor(private http: HttpClient) { }

  private twitterReportUrl = 'http://gateway-api:8080/api/twitter';

  getTop5TwitterUsers(): Observable<TwitterUser[]> {
    return this.http.get<TwitterUser[]>(this.twitterReportUrl + '/top-users/5');
  }

  getTweetsByHour() : Observable<TweetByHour[]> {
    return this.http.get<TweetByHour[]>(this.twitterReportUrl + '/report-tweets-hourly');
  }

  getHashtagsByLanguage() : Observable<HashtagLanguage[]> {
    return this.http.get<HashtagLanguage[]>(this.twitterReportUrl + '/report-hashtag-language');
  }
}

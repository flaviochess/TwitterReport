import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { Top5followersComponent } from './top5followers/top5followers.component';
import { AppRoutingModule } from './app-routing.module';
import { TotalTweetComponent } from './total-tweet/total-tweet.component';
import { HashtagCountryComponent } from './hashtag-country/hashtag-country.component';

@NgModule({
  declarations: [
    AppComponent,
    Top5followersComponent,
    TotalTweetComponent,
    HashtagCountryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

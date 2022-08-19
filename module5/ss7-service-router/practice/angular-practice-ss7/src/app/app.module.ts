import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TimelinesAppComponent } from './timelines-app/timelines-app.component';
import { TimelinesComponent } from './service/timelines/timelines.component';
import { YoutubePlaylistComponent } from './youtube-playlist/youtube-playlist.component';

@NgModule({
  declarations: [
    AppComponent,
    TimelinesAppComponent,
    TimelinesComponent,
    YoutubePlaylistComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

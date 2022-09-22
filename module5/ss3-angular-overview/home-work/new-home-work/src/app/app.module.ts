import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CalculatingComponent } from './calculating/calculating.component';
import {FormsModule} from '@angular/forms';
import { ChangingColorComponent } from './changing-color/changing-color.component';

@NgModule({
  declarations: [
    AppComponent,
    CalculatingComponent,
    ChangingColorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

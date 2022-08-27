import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NgxPaginationModule} from 'ngx-pagination';
import {ToastrModule} from 'ngx-toastr';
import {FooterComponent} from './footer/footer.component';
import {HeaderComponent} from './header/header.component';
import {HomeComponent} from './home/home.component';
import {HttpClientModule} from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import { BenhAnListComponent } from './benh-an/benh-an-list/benh-an-list.component';
import { BenhAnEditComponent } from './benh-an/benh-an-edit/benh-an-edit.component';
import { BenhAnCreateComponent } from './benh-an/benh-an-create/benh-an-create.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    HomeComponent,
    BenhAnListComponent,
    BenhAnEditComponent,
    BenhAnCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    NgxPaginationModule,
    HttpClientModule,
    ReactiveFormsModule,
    ToastrModule.forRoot({
      timeOut: 1000,
      progressBar: true,
      progressAnimation: 'increasing',
      preventDuplicates: true,
    }),
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}

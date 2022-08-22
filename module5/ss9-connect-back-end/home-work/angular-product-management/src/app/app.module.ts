import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProductComponent } from './product/list-product/product.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { CreateListComponent } from './product/create-list/create-list.component';
import {Routes, RouterModule} from '@angular/router';
import { EditProductComponent } from './product/edit-product/edit-product.component';

const routes: Routes = [{
  path: 'list/product',
  component: ProductComponent
}, {
  path: 'create/product',
  component: CreateListComponent
}, {
  path: 'edit/product/:id',
  component: EditProductComponent
}];
@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    CreateListComponent,
    EditProductComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [RouterModule]
})
export class AppModule { }

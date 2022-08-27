import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {BookComponent} from './book/book.component';
import {BookCreateComponent} from './book-create/book-create.component';
import {BookEditComponent} from './book-edit/book-edit.component';


const routes: Routes = [{
  path: 'book/list',
  component: BookComponent
}, {
  path: 'book/create',
  component: BookCreateComponent
}, {
  path: 'book/edit',
  component: BookEditComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomeComponent} from './home/home.component';
import {BenhAnListComponent} from './benh-an/benh-an-list/benh-an-list.component';
import {BenhAnEditComponent} from './benh-an/benh-an-edit/benh-an-edit.component';
import {BenhAnCreateComponent} from './benh-an/benh-an-create/benh-an-create.component';


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  }, {
    path: 'benh-an/list',
    component: BenhAnListComponent
  }, {
    path: 'benh-an/edit/:id',
    component: BenhAnEditComponent
  }, {
    path: 'benh-an/create',
    component: BenhAnCreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

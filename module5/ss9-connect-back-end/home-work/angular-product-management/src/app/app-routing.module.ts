import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ProductComponent} from './product/list-product/product.component';
import {CreateListComponent} from './product/create-list/create-list.component';
import {EditProductComponent} from './product/edit-product/edit-product.component';
import {ListCategoryComponent} from './category/list-category/list-category.component';
import {CreateCategoryComponent} from './category/create-category/create-category.component';
import {EditCategoryComponent} from './category/edit-category/edit-category.component';


const routes: Routes = [{
  path: 'list/product',
  component: ProductComponent
}, {
  path: 'create/product',
  component: CreateListComponent
}, {
  path: 'edit/product/:id',
  component: EditProductComponent
}, {
  path: 'list/category',
  component: ListCategoryComponent
}, {
  path: 'create/category',
  component: CreateCategoryComponent
}, {
  path: 'edit/category/:id',
  component: EditCategoryComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

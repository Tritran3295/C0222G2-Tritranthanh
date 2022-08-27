import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from '../home/home.component';
import {ListCustomerComponent} from './list-customer/list-customer.component';
import {CreateCustomerComponent} from './create-customer/create-customer.component';
import {EditCustomerComponent} from './edit-customer/edit-customer.component';


const routes: Routes = [
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerRoutingModule { }

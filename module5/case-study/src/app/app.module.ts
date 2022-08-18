import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';

import {AppComponent} from './app.component';
import {FooterComponent} from './footer/footer.component';
import {HeaderComponent} from './header/header.component';
import {ListCustomerComponent} from './customer/list-customer/list-customer.component';
import {CreateCustomerComponent} from './customer/create-customer/create-customer.component';
import {HomeComponent} from './home/home.component';
import {EditCustomerComponent} from './customer/edit-customer/edit-customer.component';
import {ListFacilityComponent} from './ficility/list-facility/list-facility.component';
import {CreateFacilityComponent} from './ficility/create-facility/create-facility.component';
import {EditFacilityComponent} from './ficility/edit-facility/edit-facility.component';
import {ListContractComponent} from './contract/list-contract/list-contract.component';
import {EditContractComponent} from './contract/edit-contract/edit-contract.component';
import {CreateContractComponent} from './contract/create-contract/create-contract.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

const routes: Routes = [{
  path: '',
  component: HomeComponent
}, {
  path: 'list/customer',
  component: ListCustomerComponent
}, {
  path: 'create/customer',
  component: CreateCustomerComponent
}, {
  path: 'edit/customer/:id',
  component: EditCustomerComponent
}, {
  path: 'list/facility',
  component: ListFacilityComponent
}, {
  path: 'create/facility',
  component: CreateFacilityComponent
}, {
  path: 'edit/facility',
  component: EditFacilityComponent
}, {
  path: 'list/contract',
  component: ListContractComponent
}];

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    ListCustomerComponent,
    CreateCustomerComponent,
    HomeComponent,
    EditCustomerComponent,
    ListFacilityComponent,
    CreateFacilityComponent,
    EditFacilityComponent,
    ListContractComponent,
    EditContractComponent,
    CreateContractComponent
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
export class AppModule {
}

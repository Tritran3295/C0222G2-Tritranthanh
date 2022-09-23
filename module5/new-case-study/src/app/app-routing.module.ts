import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {CustomerListComponent} from "./customer/customer-list/customer-list.component";
import {CustomerCreateComponent} from "./customer/customer-create/customer-create.component";
import {CustomerEditComponent} from "./customer/customer-edit/customer-edit.component";
import {FacilityListComponent} from "./facility/facility-list/facility-list.component";
import {FacilityCreateComponent} from "./facility/facility-create/facility-create.component";
import {FacilityEditComponent} from "./facility/facility-edit/facility-edit.component";


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },{
    path: 'customer/list',
    component: CustomerListComponent
  },{
    path: 'customer/create',
    component: CustomerCreateComponent
  },{
    path: 'customer/edit',
    component: CustomerEditComponent
  },{
    path: 'facility/list',
    component: FacilityListComponent
  },{
    path: 'facility/create',
    component: FacilityCreateComponent
  },{
    path: 'facility/edit',
    component: FacilityEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

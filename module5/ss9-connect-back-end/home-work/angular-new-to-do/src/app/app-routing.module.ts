import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ToDoComponent} from './todo/to-do/to-do.component';


const routes: Routes = [{
  path: 'list/todo',
  component: ToDoComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

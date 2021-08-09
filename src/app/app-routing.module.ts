import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmpByIdComponent } from './Employee/emp-by-id/emp-by-id.component';
import { EmpListComponent } from './Employee/emp-list/emp-list.component';

const routes: Routes = [
  {path: 'empList', component: EmpListComponent},
  {path: 'empById', component:EmpByIdComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

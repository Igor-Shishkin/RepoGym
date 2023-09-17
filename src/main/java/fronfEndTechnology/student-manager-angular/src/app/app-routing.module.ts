import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateStudentComponent } from './create-student/create-student.component';
import { StudentsListComponent } from './students-list/students-list.component';

const routes: Routes = [
  { path: "add-student", component: CreateStudentComponent},
  { path: "stufents", component: StudentsListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

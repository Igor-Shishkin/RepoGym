import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateStudentComponent } from './create-student/create-student.component';
import { StudentsListComponent } from './students-list/students-list.component';
import { EditStudenrComponent } from './edit-studenr/edit-studenr.component';
import { EditStudentComponent } from './edit-student/edit-student.component';
import { DetailStudentComponent } from './detail-student/detail-student.component';

const routes: Routes = [
  { path: "add-student", component: CreateStudentComponent},
  { path: "stufents", component: StudentsListComponent},
  { path: "edit-student/:id", component: EditStudentComponent},
  { path: "detail-student/:id", component : DetailStudentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

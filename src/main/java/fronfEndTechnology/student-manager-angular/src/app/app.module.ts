import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { StudentsListComponent } from './students-list/students-list.component';
import { HttpClientModule } from '@angular/common/http';
import { CreateStudentComponent } from './create-student/create-student.component';
import { FormsModule } from '@angular/forms';
import { EditStudenrComponent } from './edit-studenr/edit-studenr.component';
import { EditStudentComponent } from './edit-student/edit-student.component';
import { DetailStudentComponent } from './detail-student/detail-student.component';
import { DetailStudentHeaderComponent } from './detail-student/detail-student-header/detail-student-header.component';
import { DetailStudentContentComponent } from './detail-student/detail-student-content/detail-student-content.component';
import { DetailStudentActionButtonsComponent } from './detail-student/detail-student-action-buttons/detail-student-action-buttons.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    StudentsListComponent,
    CreateStudentComponent,
    EditStudenrComponent,
    EditStudentComponent,
    DetailStudentComponent,
    DetailStudentHeaderComponent,
    DetailStudentContentComponent,
    DetailStudentActionButtonsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

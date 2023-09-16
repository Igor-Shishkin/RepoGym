import { Component } from '@angular/core';
import { StudentService } from '../student.service';
import { Student } from 'd:/IdeaProjects/courseSDA/src/main/java/fronfEndTechnology/student-manager-angular/src/app/student';

@Component({
  selector: 'app-students-list',
  templateUrl: './students-list.component.html',
  styleUrls: ['./students-list.component.css']
})
export class StudentsListComponent {
  //[x: string]: import("d:/IdeaProjects/courseSDA/src/main/java/fronfEndTechnology/student-manager-angular/src/app/student").Student[];

  isLoaded = false;
  btnTitle = "Show";
  students : Student[] = [];

  constructor(private studentService : StudentService) {

  }



  search1(isLoaded : boolean) {
    console.log("button is clicked")
  }
  search2() {
    console.log("button is clicked")
    this.isLoaded = !this.isLoaded;

    if (this.isLoaded) {
        this.btnTitle = "hide"
    } else {
      this.btnTitle = "show"
    }
    this.studentService.getStudents().subscribe(data =>{
      console.log("wewnatrz subscribe");
      console.log(data);
      this.students = data;
    });

    console.log("poza subscribe");
  }
}



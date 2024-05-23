import { Component } from '@angular/core';
import { StudentService } from '../student.service';
import { Student } from 'd:/IdeaProjects/courseSDA/src/main/java/fronfEndTechnology/student-manager-angular/src/app/student';
import { delay } from 'rxjs';

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
  isDataSearch = false;
  isErrorOccurre = false
  copyStudents: Student[] = [];

  constructor(private studentService : StudentService) {

  }

  search1(isLoaded : boolean) {
    console.log("button is clicked")
  }
  search2() {
    console.log("button is clicked")

    if (!this.isLoaded) {
      this.isDataSearch = true;
        this.btnTitle = "hide"
        this.studentService.getStudents()
        .pipe(delay(1500))
        .subscribe({
          next: data =>{
        console.log("wewnatrz subscribe");
        console.log(data);
        this.students = data;
        this.copyStudents = data;
        this.isDataSearch = false;
        this.isErrorOccurre = false
      },
      error : ()=>{
        this.isDataSearch = false;
        this.isLoaded = false
        this.btnTitle = "Show"
        this.isErrorOccurre = true
      }});
    } else {
      this.btnTitle = "show"

    }


    console.log("poza subscribe");
    this.isLoaded = !this.isLoaded;
  }

  delete(id : number){
    alert("Button 'Delete' is clicked. ID: " + id)

    this.studentService.deleteStudent(id)
      .subscribe(()=>{
        // filtr from array of student
        this.students = this.students.filter(x=>x.id != id)
      })
  }

  searchBy(searchPhrase : string){
    this.students = 
      this.copyStudents
      .filter(x=>x.name.toLowerCase()
        .startsWith(searchPhrase.toLowerCase()));
  }

}



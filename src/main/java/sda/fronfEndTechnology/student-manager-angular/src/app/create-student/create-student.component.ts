import { Component } from '@angular/core';
import { StudentService } from '../student.service';
import { Student } from '../student';
import { delay } from 'rxjs';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent {

  isAddProcessing = false
  isSuccess = false


  constructor(private studentService : StudentService){

  }

  save(nameInput : HTMLInputElement, emailInput : HTMLInputElement) {
    this.isAddProcessing = true

    this.studentService.addStudent({name : nameInput.value, email : emailInput.value} as Student)
      .subscribe(()=>{
        this.isAddProcessing = false
        this.isSuccess = true
        nameInput.value = "";
        emailInput.value = "";
      })
    return false
  }

}

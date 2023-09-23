import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { StudentService } from '../student.service';
import { Student } from '../student';
import { delay } from 'rxjs';

@Component({
  selector: 'app-edit-student',
  templateUrl: './edit-student.component.html',
  styleUrls: ['./edit-student.component.css']
})
export class EditStudentComponent {

  student!: Student;
  isSuccessUpdate = false;
  isUpdateProcessing = false;

  constructor(private activatedRoute: ActivatedRoute, private studentService: StudentService) {
    this.activatedRoute.params
      .subscribe(param => {
        // alert('przekazano parametr: ' + param["id"]);
        this.studentService.getStudentById(param["id"])
          .subscribe(data => {
            this.student = data;
            console.log(this.student);
          })

      })


  }

  save(){
    this.isUpdateProcessing = true;
    this.studentService.updateStadent(this.student)
      .pipe(delay(1000))
      .subscribe(data => {
        this.isSuccessUpdate = true;
        this.isUpdateProcessing = false;
      })
  }



}

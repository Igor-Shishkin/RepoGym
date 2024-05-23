import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentService } from '../student.service';
import { Student } from '../student';

@Component({
  selector: 'app-detail-student',
  templateUrl: './detail-student.component.html',
  styleUrls: ['./detail-student.component.css']
})
export class DetailStudentComponent {
  student!: Student;

  constructor(private activatedRoute: ActivatedRoute,
    private studentService: StudentService,
    private router : Router) {
    this.activatedRoute.params
      .subscribe(param => {
        this.studentService.getStudentById(param["id"])
          .subscribe(data => {
            this.student = data;
            alert("id: " + param["id"] + ", name: " + this.student.name);
          })
      })
  }
  navigateToEdit() {
    
    this.router.navigate(['/edit-student/' + this.student.id])
  }

}

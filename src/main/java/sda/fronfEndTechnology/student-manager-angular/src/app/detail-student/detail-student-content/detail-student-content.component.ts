import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-detail-student-content',
  templateUrl: './detail-student-content.component.html',
  styleUrls: ['./detail-student-content.component.css']
})
export class DetailStudentContentComponent {
  @Input()
  studentName = "";
  @Input() 
  studentEmail = "";
}

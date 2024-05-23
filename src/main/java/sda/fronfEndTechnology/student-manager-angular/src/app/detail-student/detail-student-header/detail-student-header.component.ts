import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-detail-student-header',
  templateUrl: './detail-student-header.component.html',
  styleUrls: ['./detail-student-header.component.css']
})
export class DetailStudentHeaderComponent {
 @Input()
 studentId = 0;
 
  

}

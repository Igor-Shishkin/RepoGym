import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-studenr',
  templateUrl: './edit-studenr.component.html',
  styleUrls: ['./edit-studenr.component.css']
})
export class EditStudenrComponent {

  constructor(private activatedRoute : ActivatedRoute){
    this.activatedRoute.params
    .subscribe(param =>{
      alert('przekazano parametr: ' + param["id"]);
    })
  
  }
}

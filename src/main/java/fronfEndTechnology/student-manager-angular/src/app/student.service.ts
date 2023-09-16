import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private httpClient : HttpClient) { }


  //Metoda odpowiedzialna za pobieranie studentów
  getStudents() {
    return this.httpClient.get<Student[]>("https://jsonplaceholder.typicode.com/users");
  }
}

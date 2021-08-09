import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from '../Employee/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  private baseUrl="http://localhost:8090/api/v1";
  constructor(private http:HttpClient) { }

  getEmpList(){
    console.log(this.http.get(this.baseUrl+'/employees'));
    return this.http.get<any[]>(this.baseUrl+'/employees');
  }

  public getEmpById(id: number){
    console.log(this.http.get<Employee>(this.baseUrl+'/employeeById/'+id));
    return this.http.get<Employee>(this.baseUrl+'/employeeById/'+id);
  }

}

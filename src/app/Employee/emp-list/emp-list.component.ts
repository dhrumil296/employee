import { Component, OnInit } from '@angular/core';
import { EmpService } from 'src/app/Services/emp.service';
import { Employee } from '../Employee';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  constructor(private employeeService:EmpService) { }
  empList: Employee[] = [];

  ngOnInit(): void {
    this.loadData();
  }

  loadData() {
    this.employeeService.getEmpList().subscribe((data: Employee[]) => {
      this.empList = data;
    });
  }

}

import { Component, OnInit } from '@angular/core';
import { EmpService } from 'src/app/Services/emp.service';
import { Employee } from '../Employee';

@Component({
  selector: 'app-emp-by-id',
  templateUrl: './emp-by-id.component.html',
  styleUrls: ['./emp-by-id.component.css']
})
export class EmpByIdComponent implements OnInit {

  emp: Employee = new Employee();

  constructor(private empService: EmpService) { }

  ngOnInit(): void {
    this.getEmpById(109);
  }

  getEmpById(id: number) {
    this.empService.getEmpById(id).subscribe((data: Employee) => {
      this.emp = data;
    });
  }

}



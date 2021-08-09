package com.lti.appl.user;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.beans.Employee;
import com.lti.appl.exp.HrException;
import com.lti.appl.services.EmpService;
import com.lti.appl.services.EmpServiceImpl;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		EmpService service = ctx.getBean("empService", EmpServiceImpl.class);

		Scanner sc = new Scanner(System.in);
		int choice;
		int empId;
		String empName;
		long salary;
		String cont;

		do {
			System.out.println(
					"Select an option:\n1. Add Employee\n2. Find Employee by id\n3. Update salary by id\n4. Delete employee by id\n5. Display all employee");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter employee's id: ");
				empId = sc.nextInt();
				System.out.print("Enter employee's name: ");
				empName = sc.next();
				System.out.print("Enter employee's salary: ");
				salary = sc.nextLong();

				Employee emp = new Employee();
				emp.setEmpNo(empId);
				emp.seteName(empName);
				emp.seteSal(salary);
				service.saveEmployee(emp);
				break;
			case 2:
				System.out.print("Enter employee id: ");
				empId = sc.nextInt();
				System.out.println(service.findEmpById(empId));
				break;
			case 3:
				System.out.print("Enter employee id: ");
				empId = sc.nextInt();
				System.out.print("Enter new salary: ");
				salary = sc.nextLong();

				try {
					System.out.println(service.updateSal(empId, salary));
				} catch (HrException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.print("Enter employee id: ");
				empId = sc.nextInt();
				System.out.println(service.deleteEmpById(empId));
				break;
			case 5:
				service.getEmpList().forEach(System.out::println);
				break;
			}
			System.out.println("Do you want to continue?? Type y to continue");
			cont = sc.next();
		} while (cont.toUpperCase().equals("Y"));
		System.out.println("Thank you for using our app!!");

		
//		Employee e = new Employee(110, "Dice", 15000);
//
//		List<Employee> empList = service.getEmpList();
//		empList.forEach(System.out::println);
//
//		System.out.println("\nUpdated: " + service.updateSal(110, 15000));
//
//		System.out.println("\nFind by id: " + service.findEmpById(110));
//
//		System.out.println("\nDelete by id....Recorded deleted: " + service.deleteEmpById(110));
//
//		service.getEmpList().forEach(System.out::println);
	}

}

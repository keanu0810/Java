package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {

	private EmployeeController ssm = new EmployeeController();
	
	public EmployeeMenu() {
		
	}
	
	public void printEmployeeMenu() {
		System.out.println("���� �̸�\f����\f����");
		System.out.println("----------------");
		
		for (Employee Employee : ssm.printstudent() ) {
			System.out.println(Employee);
		}
		System.out.println("-----------------");
		System.out.println("���� : " );
		System.out.println();
	}
	
}
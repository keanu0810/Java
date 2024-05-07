package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {

	
	private Employee[] sArr = new Employee[5];
	public static final int CUT_LINE = 60;
	
	public EmployeeController() {
		sArr[0] = new Employee("��浿", "�ڹ�", 100);
		sArr[1] = new Employee("�ڱ浿", "���", 50);
		sArr[2] = new Employee("�̱浿", "ȭ��", 85);
		sArr[3] = new Employee("���浿", "����", 60);
		sArr[4] = new Employee("ȫ�浿", "�ڹ�", 20);
	}

	public Employee[]printstudent() {
		return sArr;
	}
	public int sumScore() {
		int sum = 0;
		for (Employee e : sArr) {
			sum += e.getScore();
			
		}
		return sum;
	}
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length;
		return avgArr;
	}
	
	public double avgScore2() {
		double avgArr = sumScore() / sArr.length;
		return avgArr;
	}
	public void printPass() {
		for (Employee e : sArr) {
			e.setPassde(e.getScore() <= CUT_LINE);
		System.out.println();
	}
	
	}
}

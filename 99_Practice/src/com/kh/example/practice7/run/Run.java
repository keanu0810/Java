package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		//���� 1�� ���� ������ ���� ������ Employess ��ü ����
		Employee emp1 = new Employee();
		emp1.empNo = 1;
		emp1.empName = "�����";
		emp1.gender = '��';
		System.out.println("===����1===");
		System.out.println("�����ȣ : " + emp1.empNo);
		System.out.println("����̸� : " + emp1.empName);
		System.out.println("������� : " + emp1.gender);
		
		// ����2 �ʼ��� ��ȣ �̸� �ʼ� ����
		//��ü ������ �� �ʼ������ڷ� �ۼ��ϱ�
		Employee emp2 = new Employee(2, "���׶��");
		System.out.println("===����2===");
		System.out.println("�����ȣ : " + emp2.empNo);
		System.out.println("����̸� : " + emp2.empName);
		
		//���� 3 �ʼ��� ��� �ۼ��ؼ� ����
		Employee emp3 = new Employee(3, "������", "������", "�繫��",20, '��', 5000, 1000,"010-0000-0000", "����� ������");
		System.out.println("===����3===");
		System.out.println("�����ȣ : " + emp3.empNo);
		System.out.println("����̸� : " + emp3.empName);
		System.out.println("����μ� : " + emp3.dept);
		System.out.println("������� : " + emp3.job);
		System.out.println("������� : " + emp3.gender);
		System.out.println("������� : " + emp3.salary);
		System.out.println("���Ư�� : " + emp3.bonusPoint);
		System.out.println("������� : " + emp3.phone);
		System.out.println("����ּ� : " + emp3.address);
	}
}

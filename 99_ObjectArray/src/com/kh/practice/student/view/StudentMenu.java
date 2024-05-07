package com.kh.practice.student.view;

import com.kh.practice.student.model.vo.Student;
import com.kh.practice.student.student.controller.StudentController;

//������� ���忡�� �ٶ󺸴� ��ǻ��
public class StudentMenu {
	private StudentController ssm = new StudentController();
			
	public StudentMenu() {
		
	}
	//void �л������� ���� ��� ����ϴ� �޼���
	public void printStudentMenu() {
		System.out.println("�л� �̸�\f����\f����");
		System.out.println("--------------");
		//for - each
		//String ���� �ߴٸ� �л��� �̸� or ���� or ����
		//Student �̸��� ���� ������ ���~~ ������ ���ڴٴ� �ǹ�
		/*          �� �� �� �� ȫ �浿*/
		for( Student student : ssm.printStudent() ) {
			System.out.println(student.inform());
		}
		System.out.println("-------------------");
		System.out.println("���� : " + ssm.sumScore());
		System.out.printf("��� : %.2f\n" , ssm.avgScore()[1]);
		System.out.println("�հݿ��� : " + (ssm.avgScore()[1] >= StudentController.CUT_LINE));
		
		ssm.printPass();
		/*
		 * boolean�� �Ἥ true���� false ������ ������ �����µ�
		 *  true �� false �������ϱ�?
		 * 			�л����� ��� ��� >= �հ�ĿƮ����
		 * 		ssm.avgScore()[1] >= StudentController.COT_LINE
		 * 				80						60
		 * ���� ���ų� ũ�ų� �۴ٴ� ���� ǥ���ϴ� �ε�ȣ���� true���� false���� ���и� �ϱ� ���� �����Ѵ�.
		 * 
		 * 
		 * 
		 * */
	}
}

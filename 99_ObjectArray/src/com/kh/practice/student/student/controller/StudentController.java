package com.kh.practice.student.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	/*Student[] sArr = new Student[5]
	 * 			��sArr[0] �̸� ���� ����
	 *			��sArr[1] �̸� ���� ����
	 *  Student ��sArr[2] �̸� ���� ����
	 * 	 sArr	��sArr[3] �̸� ���� ����
	 * 			��sArr[4] �̸� ���� ����
	 * 
	 * */
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;//���
//�޼���
	//������ : �⺻
	public StudentController() {
		sArr[0] = new Student("��浿", "�ڹ�", 100);
		sArr[1] = new Student("�ڱ浿", "���", 50);
		sArr[2] = new Student("�̱浿", "ȭ��", 85);
		sArr[3] = new Student("���浿", "����", 60);
		sArr[4] = new Student("ȫ�浿", "�ڹ�", 20);
		/*
		 * 			��sArr[0] ��浿 �ڹ� 100
		 *			��sArr[1] �ڱ浿 ��� 50
		 *  Student ��sArr[2] �̱浿 ȭ�� 85
		 * 	 sArr	��sArr[3] ���浿 ���� 60
		 * 			��sArr[4] ȫ�浿 �ڹ� 20
		 * */
	}
	
	//sArr�� ����� ������� ������ ��� ����
	public Student[] printStudent() {
		return sArr;
	}
	//�л����� ������ ��� ���ؼ� ������ ���
	public int sumScore() { //���� ���� �� ����
		int sum = 0;
		for(Student s : sArr) {
			sum += s.getScore();
		}
		//���������� ������ sumScore�� �θ��ٸ� ���� ���� ������ �����ְڴ� 
		return sum;
	}
	
	//������ �޾Ƽ� ��� ���ϱ�
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore(); //������ ���� ��� �л��� ���� ���� ���� �����ϴ� ���� 0
		avgArr[1] = avgArr[0] / sArr.length; //  ��� = ���� / ���л���
		return avgArr;
	}
	//�������� �迭�� ������� �ʰ� ���� ���ϱ�
	public double avgScore2() {
		double avgArr = sumScore() / sArr.length; //  ��� = ���� / ���л���
		return avgArr;
	}
	
	
	//�� �л��� �հ� ���θ� Ȯ���ϰ� ����ϴ� �޼���
	public void printPass() {
		for (Student s  : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " �л��� " + (s.isPassed() ? "���" : "���հ�")  + "�Դϴ�.");
			
			/*
			if(s.getScore() >= CUT_LINE) {
				System.out.println(s.getName() + " �л��� �հ��Դϴ�.");
			} else {
				System.out.println(s.getName() + " �л��� ���հ��Դϴ�.");
			}
			*/
		}
	}
	
	
	

	
}
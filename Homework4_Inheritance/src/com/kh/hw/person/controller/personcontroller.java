package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Student;

public class personcontroller {
	//�л��ڸ� 3�ڸ�
	private Student[] students = new Student[3];
	
	private int studentIndex = 0;
	
	//��� �� ����
	public int[] personCount() {
		int[] counts = new int[2]; // counts[0] = �л��� �ڸ� counts[1] = ������ ��
		counts[0] = studentIndex;
		counts[1] = 0;
		return counts;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		//�л��� �߰��ϱ�
		//�迭�� ���� �� index ���� legbth���� �ʰ��Ǹ� ���� ���ϰ� �սô�.
		if(studentIndex< students.length) {
		students[studentIndex++] = new Student(name, age, height,weight, grade, major);
		} else {
			System.out.println("�� �̻� �л��� �߰��� �� �����ϴ�.");
		}
	}
	//�л� ��Ϻ���
	public Student[] printStudent() {
		return students; 
		
	}
}

package com.kh.oop.basic;

public class Student {
	//�ʵ� String name int age int grade
	public String name;
	public int age;
	public int grade;
	
	public void info() {
	System.out.println("�̸� : " + name);
	System.out.println("���� : " + age);
	System.out.println("�г� : " + grade);
	}
	public Student(String �̸�, int ����, int �г�) {
		this.name = �̸�;
		this.age = ����;
		this.grade = �г�;
	}
	//�л��ε�  �л��� �̸���	���̿� 		�г�
	//������ �޼��� (�ʼ��� �ۼ��ؾ��ϴ� ������ �޼��� �����)
	//�ʼ��� �־�� �ϴ� �� �̸� ���� �г�
	
	//��� �޼��� ���� ��� �޼���
	public void ifod() {
		System.out.println("�̸� : "+ name + "\n ���� : " + age +"\n �г� :"+ grade);
	}
	//public void into(){
		//System.out.println �̸� ���� �г� ���
	//}
	
	//���� ���� �޼���
	//�л� ��ü �����ϱ� ��ö�� 18 3 �ڿ��� 20 2
	public static void main(String[] args) {
		Student student1 = new Student("��ö��", 18, 3);
		Student student2 = new Student("�ڿ���", 20, 2);
	}
	//Student student1
	//Student student2
	
	//�л�1�� �л�2 ���� ����ϱ�
}

package com.kh.oop.method;

public class Student {
	//�ε�
	//�л� �̸� ���� �г�
	private String name;
	private int age;
	private int grade;
	
	//�޼���
		//������ : �⺻ 
	
		public Student() {
			
		}
		//������ : �ʼ� �̸� ���� �г�
		public  Student(String name, int age, int grade ) {
			this.name = name;
			this.age = age;
			this.grade = grade;
		}
		//return
		public String getname() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getGrade() {
			return grade;
		}
		public void info() {
			System.out.println("�л��� �̸� : " + name);
			System.out.println("�л��� ���� : " + age);
			System.out.println("�л��� �г� : " + grade);
			System.out.println("--------------------");	
		}
		// ���θ޼���
	public static void main(String[] args) {
		
		//student1 "�ڿ���" 15 2
		Student sd1 = new Student("�ڿ���" , 15, 2);
		//student2 "�迵��" 17 1
		Student sd2 = new Student("�迵��" , 17, 1);
		sd1.info();
		sd2.info();
	}

}

package com.kh.example.practice4.model.vo;

public class Student {
	//�ʵ�
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassroom() {
		return classroom;
	}


	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public Student() {
		
	}
	
	
	//�޼��� void
	public void information() {
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classroom);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + height);
		System.out.println("���� : " + gender);
	}
	
	
	
	
	
	
	
}

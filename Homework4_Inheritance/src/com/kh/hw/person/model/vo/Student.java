package com.kh.hw.person.model.vo;

public class Student extends Person {
	//�г� ����
	private int grade;
	private String major;
//�޼���
	//Setter
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	//Getter
	public int getGrade() {
		return grade;
	}

	public String getMajor() {
		return major;
	}
	//������ : �⺻ 
	public Student() {
		
	}
	//������ : �ʼ�
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	//@Override toString

	@Override
	public String toString() {
		return "�л� [�̸�=" + getName() + ", ����=" + getAge()
				+", Ű =" + getHeight() + ",������=" + getWeight()
				+", �г�=" + grade + ", ����=" + major + "j";
	}


}

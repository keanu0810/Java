package com.kh.practice.student.model.vo;

public class Student {
//�ʵ�
	// �̸� ���� ����
	private String name;
	private String subject;
	private int score;
	private boolean passed; //�հ� ����  boolean ���� ���� false
	
	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	//�޼���
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}

	// ������:�⺻
	public Student() {

	}

	// ������:�ʼ�
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	// �ڵ����� ����Ű : ctrl + shift + f
	// return String inform()
	public String inform() {
		return "�̸�: " + name + ", ����: " + subject + ", ����:" + score;
	}
}
package com.kh.practice.Employee.model.vo;

public class Employee {
//�ʵ�
	private String name;
	private String subject;
	private int score;
	private boolean passde;
public boolean isPassde() {
		return passde;
	}
	public void setPassde(boolean passde) {
		this.passde = passde;
	}
	//�޼���	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	//������ : �⺻
	public Employee() {
		
	}
	//������ : �ʼ�
	public  Employee(String name, String subject, int score) {
		
	}
	//void 
	public void information() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + subject);
		System.out.println("���� : " + score);
	}
}

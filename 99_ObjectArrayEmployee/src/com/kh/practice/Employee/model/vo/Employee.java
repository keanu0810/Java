package com.kh.practice.Employee.model.vo;

public class Employee {
//필드
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
	//메서드	
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
	//생성자 : 기본
	public Employee() {
		
	}
	//생성자 : 필수
	public  Employee(String name, String subject, int score) {
		
	}
	//void 
	public void information() {
		System.out.println("이름 : " + name);
		System.out.println("주제 : " + subject);
		System.out.println("점수 : " + score);
	}
}

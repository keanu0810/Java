package com.kh.example.practice1.model.vo;

public class Member {
	public String memberId; 
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	//������
	public Member() {
		
	}
	
	//��¸޼���
	public void changeName(String name) {
		System.out.println("�̸� : " + name);
		
	}
	
	public void printName() {
	System.out.println("�̸� : " + memberName);
	
	}
		
		//public void changeName(String name) {
			//this.memberName = name;
			
		//public String chageEmail(String �����̸���) {
			//this.email = �����̸���;
			
	
	
	/*
	memberId : String
	memberPwd : String
	memberName : String
	age : int
	gender : char
	phone : String
	email : String
	*/
}

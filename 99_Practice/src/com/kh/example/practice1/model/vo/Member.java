package com.kh.example.practice1.model.vo;

public class Member {
	public String memberId; 
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	//생성자
	public Member() {
		
	}
	
	//출력메서드
	public void changeName(String name) {
		System.out.println("이름 : " + name);
		
	}
	
	public void printName() {
	System.out.println("이름 : " + memberName);
	
	}
		
		//public void changeName(String name) {
			//this.memberName = name;
			
		//public String chageEmail(String 수정이메일) {
			//this.email = 수정이메일;
			
	
	
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

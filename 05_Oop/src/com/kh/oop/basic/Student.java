package com.kh.oop.basic;

public class Student {
	//필드 String name int age int grade
	public String name;
	public int age;
	public int grade;
	
	public void info() {
	System.out.println("이름 : " + name);
	System.out.println("나이 : " + age);
	System.out.println("학년 : " + grade);
	}
	public Student(String 이름, int 나이, int 학년) {
		this.name = 이름;
		this.age = 나이;
		this.grade = 학년;
	}
	//학생인데  학생의 이름과	나이와 		학년
	//생성자 메서드 (필수로 작성해야하는 생성자 메서드 만들기)
	//필수로 넣어야 하는 것 이름 나이 학년
	
	//출력 메서드 정보 출력 메서드
	public void ifod() {
		System.out.println("이름 : "+ name + "\n 나이 : " + age +"\n 학년 :"+ grade);
	}
	//public void into(){
		//System.out.println 이름 나이 학년 출력
	//}
	
	//최종 메인 메서드
	//학생 객체 생성하기 김철수 18 3 박영희 20 2
	public static void main(String[] args) {
		Student student1 = new Student("김철수", 18, 3);
		Student student2 = new Student("박영희", 20, 2);
	}
	//Student student1
	//Student student2
	
	//학생1과 학생2 정보 출력하기
}

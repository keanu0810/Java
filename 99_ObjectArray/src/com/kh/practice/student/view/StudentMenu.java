package com.kh.practice.student.view;

import com.kh.practice.student.model.vo.Student;
import com.kh.practice.student.student.controller.StudentController;

//사용자의 입장에서 바라보는 컴퓨터
public class StudentMenu {
	private StudentController ssm = new StudentController();
			
	public StudentMenu() {
		
	}
	//void 학생정보와 성적 결과 출력하는 메서드
	public void printStudentMenu() {
		System.out.println("학생 이름\f과목\f점수");
		System.out.println("--------------");
		//for - each
		//String 으로 했다면 학생의 이름 or 과목 or 점수
		//Student 이름과 과목 점수를 모두~~ 가지고 오겠다는 의미
		/*          김 박 이 정 홍 길동*/
		for( Student student : ssm.printStudent() ) {
			System.out.println(student.inform());
		}
		System.out.println("-------------------");
		System.out.println("총점 : " + ssm.sumScore());
		System.out.printf("평균 : %.2f\n" , ssm.avgScore()[1]);
		System.out.println("합격여부 : " + (ssm.avgScore()[1] >= StudentController.CUT_LINE));
		
		ssm.printPass();
		/*
		 * boolean을 써서 true인지 false 인지를 한적이 ㅇ벗는데
		 *  true 와 false 보여집니까?
		 * 			학생들의 평균 평균 >= 합격커트라인
		 * 		ssm.avgScore()[1] >= StudentController.COT_LINE
		 * 				80						60
		 * 값이 같거나 크거나 작다는 것을 표현하는 부등호들의 true인지 false인지 구분만 하기 위해 존재한다.
		 * 
		 * 
		 * 
		 * */
	}
}

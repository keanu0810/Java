package com.kh.operatorPre;
// 패키지 : 내가 만든 클래스가 들어있느 폴더 위치

import java.util.Scanner;

//클래스 : 실행하고자 하는 코드를 작성하는 공간
public class OperatorPre {
	// 기본 출력 메서드
	// 최종으로 출력하는 메서드가 아니지만 상황에 따라
	// 최종 메서드에서 호출해 사용할 수 있는 메서드 중 하나
	// static : 메모리에서 고정 
	public static void practice1() {// 모든 사람이 사탕을 골고루 나눠갖기
		// 스캐너 이용해서 키보드로 입력받은 내용을 컴퓨터에 츌력
		// Ststem.in 키보드로 입력 받을 수 있게 해주는 출력 시스템
		// Scanner : 키보드로 입력받은 내용을 컴퓨터로 출력
		// 기본으로 갖춰져있기는 하지만 라이브러리에서 가져와야하기 떄문에
		// import를 이용해서 가지고 옴
		Scanner sc = new Scanner(System.in);
		// 스캐너를 불러온 다음에 바로 sc 로 스캐너 기능을 불러와도 되긴 하지만
		// System.out.print 를 이용해서 어떤 행동을 진행하고 있는지
		// 확인하는 작업을 진행할 것
		// 인원 수 입력 받기
		System.out.print("인원 수를 입력하세요 : ");
		int people = sc.nextInt();
		// 사탕 개수 입력받기
		System.out.print("사탕 개수를 입력하세여 : ");
		int candies = sc.nextInt();
		
		//1인당 나눠줄 사탕 개수 계산
		int getCnadies = candies / people;
		
		//나눠주고 남은 사탕 개수 계산
		int reMain = candies % people;
		
		//결과 출력
		System.out.println("참여 인원 : " + people);
		System.out.println("캔디 총 개수 : " + candies);
		System.out.println("동일하게 나눠가진 캔디 개수 : " + candies);
		System.out.println("남은 캔디 개수 : " + reMain);
		
	}
	
	/* *  이름 : 학년(숫자만) 반(숫자만) 번호(숫자만) 성별(M/F) 성적(소수점 아래 둘쨰 자리끼지*/
	public static void practice2() { //키보드로 정보 입력받기 + 남 여 확인
		//Scanner 활용해서 키보드 입력받는 창 만들어주기
		Scanner sc = new Scanner(System.in);
		//이름 입력 받기
		System.out.println("학생관리프로그램 : ");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		//학년 입력 받기
		System.out.print("학년(숫자만) : ");
		//학년 입력받기
		int grade = sc.nextInt();
		System.out.println();
		int classNum = sc.nextInt();
		// 번호 입력 받기
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		// 성별 입력 받기 String -> char
		// 스캐너로 char 값을 입력받고자 할 경우에는
		//charAt 을 사용해서 문자열 위치를 읽어오는 작업을 진행해야
		//시스템으로 예를 들면
		//System - out - print()
		//Scanner - next - charAt()
		//                 내가 보고자 하는 숫자 위치
		// T      A      B      L       E  = 5글자
		// 만약에 맨 앞글자를 보고 싶다면
		// charAt(0) : 맨 앞 글자를 보기
		// charAt(1) : 두번쨰 글자를 보기
		// charAt(2) : 세번쨰 글자를 보기
		// charAt(3) : 네번쨰 글자를 보기
		// charAt(4) : 다섯번쨰 글자를 보기
		// TABLE의 경우 총 5글자이기 떄문에
		// chatAt 에서는 4까지만 작성할 수 있음
		
		System.out.print("성별(M/F) : ");
		//String gender = sc.next();
		char gender = sc.next().charAt(0);
		//어떤 글자가 들어오든 관계없이 맨 앞에 있는 글자만
		//필요하기 떄문에 0으로 작성
		//성적 입력 받기 (소수점 둘째 자리 까지만 입력받음)
		
		// 성적 입력 받기 소수점 둘쨰 자리 까지만 입력받음
		
		
		System.out.println("점수");
		double score = sc.nextDouble(); // 전체자리 입력받음
		//성별에 따라 출력 문자열 설정
		//삼항 연산자 출력 문자열 설정
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println(" 반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("성별 : " + gender);
		//System.out.println("성적 : " + score);
		//printf + ,
		//printf 로 %f 를 출력 할 떄는 소수점 자리를 지정해줘도 되고
		// 지정해주지 않나도 된다.
		// 다만 만약에 소수점 자리 위치를 지정해서 출력하길 원한다면
		// % . 출력을 우너하는 소수점 위치자리 값 f
		//예를 들어 소수점 4번째 자리까지 출력하길 원함 : %.4f
		// 예를 들어 소수점 5번째 자리까지 출력하길 원함 : %.5f
		
		// 소수점 2번째 자리까지 출력하길 원한다면 %. 2f
		System.out.printf("성적 :  %.2f" , score); //
		/*Syetem. out. print("줄바꿈 없이 가로로 출력")
		 			   println("다 출력한 다음에 다음줄에서 작성하기 Enter")
		 			   printf("서식이 지정된 문자열을 출력할 떄 사용")
		 			   		%d 정   수
		 			   		%f 소수점 수
		 			   		%s 문자열 출력
		 			   		%c문자 하나 출력
		 			   		%b true
		 			   		%x 16진수의 정수
		 			   		%o 8진수의 정수
		 			   		
		 */
	}

	
	/*
	 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
	 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요
	 (국어 + 영어 + 수학 ) 3.0
	 * */
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		//국어 점수 입력
		System.out.println("국어 점수를 입력하세요");
		int korean = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int english = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		//입력 받은 점수로 합계 계산
		//점수 총합 = 국어점수 + 영어점수 + 수학점수;
		int total = korean + english + math;
		// 총 점수 나누기 3 을 해서 평균 점수 계산하기
		// 점수가 무조건 소수점 이외 정수만 나온다는 보장이 없기 떄문에
		// 싱수(소수점자리가 있는 수) 가 나온다는 가정에 진행
		double average = (double) total / 3.0;
		System.out.println("국어점수 : " + korean);
		System.out.println("국어점수 : " + english);
		System.out.println("국어점수 : " + math);
		System.out.println("국어 + 영어 + 수학 : " + total);
		System.out.println("국어 영어 수학 평군점수 : " + average);
		}
	

		
	// 2개의 수를 키보드를 입력 받아 입력 받은 수가 모두 같으면 
	// true 아니면 false 출력
		
	public static void method4() {
		Scanner sc = new Scanner(System.in);
	//첫번쨰 수 입력받기
	System.out.println("첫 번쨰 수를 입력하세요");
	int num1 = sc.nextInt();
	System.out.println("두 번쨰 수를 입력하세요");
	int num2 = sc.nextInt();
	
	// == true == 양쪽에 있는 값이 같으면 true
	// 3 == 5 false 라고 표현
	// 3 == 5 true 라고 표현
	// ! = 양쪽에 있는 값이 다르지만 다른게 맞아! true
	// ! == 양쪽에 있는값이 다르지만 다른데 맞아! true
	//true false 표현할 떄 그 값이 true false로 표현받기 위해서는
	// boolean을 사용해서 표현을 함
	// 거짓 참을 담는 변수 = true or false;
	// = equal
		boolean result = num1 == num2 ;
		System.out.println("num1 과 num2의 결과 : " + result);
	/* 실습문제 4번 응용
	 	2개의 수를 키보드로 입력 받은 수가 모두 다르면
	 								true 모두 같으면 false 출력
	 * */
	}
	public static void practice4() {
		//스캐너 이용해서 num1 num2 값 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 의 값을 입력하세요 : ");
		int num1 = sc.nextInt();// 정수로 num1 값을 반음
		System.out.println("num2 의 값을 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		// 모두 다르면 !=
		//boolean 참 거짓
		boolean result = num1 != num2 ; // 두수 값이 다르면 참
		System.out.println("num1 의 값" + num1);
		System.out.println("num2 의 값" + num2);
		System.out.println("num1 != num2 : " + result);
		System.out.println("num1 과 num2의 결과 : " + result);
	}
	//
	// 3개의 수를 키보드로 입력 받아
	// 입력 받은 수가 모두 같으면 true, 아니면 false를 출력
	public static void practice5() {
		//스캐너 출력해서 int로 변수명 3개 만들기
		Scanner sc = new Scanner(System.in);
		//int 로 변수명 3개 만들기
		System.out.println("num1 의 값을 입력하세여 : ");
		int num1 = sc.nextInt();
		System.out.println("num2 의 값을 입력하세여 : ");
		int num2 = sc.nextInt();
		System.out.println("num3 의 값을 입력하세여 : ");
		int num3 = sc.nextInt();
		
		// ampersand && and
		// (구분1) && (구분2) = true
		// (true) && (true) = true
		// (true) && (false) = false
		// (false) && (true) = false
		// (false) && (false) = false
		//                        ㅂ + 한자
		//						┌  true ┐
		//		num1이랑 num2가 같은 때 && num2랑 num3가 같은 때
		boolean result = (num1 == num2) && (num2 == num3);
		// || vertical bar or
		// 구분 1  or  구분2
		// (true) or (false) = true
		// (false) or (true) = true
		// (true) or (false) = true
		// (false) or (false) = false
		// Enter 위에 
		// 원화()표시를 shft + 눌러주면 |
		boolean isOR = (num1 == num2) || (num1 == num2);
				
				
		System.out.println("num1 : " + num1 + ", num2 : " + num2 + ", num3 : ");
		System.out.println("result : " + result);
		System.out.println("isOR : " + isOR);
		
		
	} 
	// 메인 메서드 : 최종으로 실행하는 메서드
	public static void main(String[] args) {
		//작성해준 메서드 중에서 실행이나 출력하고자 하는 메서드 작성
		//practice1();
		//practice2();
		//practice3();
		//method4();
		//practice4();
		practice5();
		

	}

}

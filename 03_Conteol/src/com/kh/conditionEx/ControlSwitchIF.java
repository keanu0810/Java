package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIF {

	public static void takeAtaxi() {
		// 입력받은 돈이 3000원 이상일 경우에만 택시를 탈 것인지 물어볼 것
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		//if 문을 사용해서 금액이 3000원 이상일 경우에만 물어보는 코드를 작성 해줄 것
		if(money >=3000) {
			System.out.println("택시를 탈까요? (예/아니요)");
			String answer = sc.next();
			
			//answer로 받은 대답에 따라 응답을 처리하기
			switch (answer) {
			case "예" :
				System.out.println("택시를 탔습니다.");
				break;
			case "아니요" :
				System.out.println("택시를 타지 않습니다.");
				break;
			default :
				System.out.println("잘못된 입력이 아닙니다.");
			
			}
		}else {
			System.out.println("3000원 이하이므로 잔액이 부족합니다.");
		}
	}
	
	/*public static void whyScore
	 * 사용자로부터 점수를 입력받아 성적 등급을 판별하는 프로그램 작성
	 * int score
	 * if
	 * 90 이상일 경우 A학점
	 * 80 이상을 경우 B학점
	 * 70 이상일 경우 C학점
	 * 60 이상일 경우 D학점
	 * 50 이상일 경우 F학점
	 * switch
	 * 	-> F 확정일 때 재수강 하시겠습니다 (yes / No)
	 * 만약에 yes No 이외의 값이 나올 수 있기 떄문에
	 * case YES : case NO : 
	 * */
	public static void whyScore() {
		// 스캐너 이용해서 점수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요");//키보드로 점수 입력받기
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A학점 입니다.");
		} else if (score >= 80) {
			System.out.println("B학점 입니다.");
		} else if (score >= 70) {
			System.out.println("C학점 입니다.");
		} else if (score >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
			System.out.println("재수강 하시겠습니까? (yes / no) : ");
			String reScore = sc.next();
			
			//재수강의 여부를 확인하기
			switch (reScore) {
				case "yes" : case "YES" :
					System.out.println("재수강 신청이 완료되었습니다.");
					break;
				case "no" : case "NO" :
					System.out.println("수강시청 하지 않았습니다.");
					break;
				default :
					System.out.println("바르게 입력하시요.");
				
			}
		}
		
		
	}
	/*public static void whayDay
	 * 월 수 금 : 헬스
	 * 화 목 : 공부
	 * 토 일 : 주말인데 집에서 쉴 예정입니까? (예 / 아니오)
	 * 만약에 집에서 쉴 예정이면 네 집에서 쉴 예정입니다.
	 * 		아니요 선택하면 어떤 활동을 할 예정인지 선택해주세요.
	 * 			활동 1. 등산 2. 독서 3. 수영 선택할 수 있게 만들어줌 
	 * */
	public static void whayDay() {
		//오늘은 어떤 요일인지 확인한 후에 요일에 따른 출력을 진행할 것
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하세요 : ");
		System.out.println("(월 / 화 / 수 / 목 / 금 / 토 /일)");
		String day = sc.next();
		String result;
		switch(day) {
		case "월" : case "수": case "금":
			result = "헬스";
			break;
		case "화" : case "목" : 
			result = "공부";
			break;
		case "토": case "일" : 
			System.out.println("집에서 쉴 예정입니까? (예 / 아니요) : ");
			String answer = sc.next();
			if (answer.equals("예")) {
				result = "집";
			} else { //집에서 쉴 예정이 아닐 경우
				System.out.println("어떤 활동을 할 계획인가요 ?");
				System.out.println("1.등산 2.독서 3.수영 : ");
				int activity = sc.nextInt();
				switch (activity) {
				case 1:
					result = "등산";
					break;
				case 2:
					result = "독서";
					break;
				case 3:
					result = "수영";
					break;
				default :
					result = "잘못된 입력";
					return;
				}
			}
		default :
			return;
		}
		
		System.out.println(day +"위에 요일에 " + result + "할 예정");
	}
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		whayDay();
	}

}

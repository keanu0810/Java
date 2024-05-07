package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	/* public static viod methhod1() {
	 	숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
	 	Scanner sc = new Scanner(System).in);
	 	int num1 = sc.nextInt();
	 	int num2 = sc.nextInt();
	 	같다면 같습니다, 출력하고
	 	같지 않다면 같지 않습니다, 출력하기
	*/
	public static void methhod1() {
		Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
			System.out.println("두번쨰 숫자를 입력해주세요 : ");
	 	int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + "과" + num2 + "의 값이 같습니다.");
		}else {
			System.out.println(num1 + "과" +  num2 + "의 값이 같지 앖습니다.");
		}
	}
	/*public static void methhod2() {
	  if 문 활용 문자 값 2개를받아서 문자 두개가 일치하는지 확인
	  Scanner sc = new Scanner(System.in);
	  int str1 = sc.next.Line();
	  int str2 = sc.next.Line();
	  같다면 같습니다. 출력하고
	  같지 않다면 같지 않습니다, 출력하기
	  */
	public static void methhod2() {
		  Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요 : ");
		  String str1 = sc.nextLine();
		  String str2 = sc.nextLine();
		  if(str1.equals(str2)) {
				if (str1 == str2) {
					System.out.println(str1 + "과" + str2 + "의 값이 같습니다.");
				}else {
					System.out.println(str1 + "과" +  str2 + "의 값이 같지 앖습니다.");
				}
		  }
	}
	
	public static void methhod3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("douvle1의 값을 입력해주세요 : ");
		double douvle1 = sc.nextDouble();
		System.out.println("douvle2의 값을 입력해주세요 : ");
		double douvle2 = sc.nextDouble();
		if (douvle1 == douvle2) {
			System.out.println(douvle1 + "과" + douvle2 + "의 값이 같습니다.");
		}else {
			System.out.println(douvle1 + "과" +  douvle2 + "의 값이 같지 앖습니다.");
		}
	}
	//최종으로 실행할 메인 메서드
	public static void main(String[] args) {
		//methhod1();
		//methhod2();
		//methhod3();

	}

}

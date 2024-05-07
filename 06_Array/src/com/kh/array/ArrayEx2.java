package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {
	public static void practice1() {
		
		int numbers[] = new int[11];
	
		for(int i = 1; i <numbers.length; i++) {
			numbers[i] = i;
			System.out.print(i+" ");

		}
		
	}

	public void practice7() {
		//입력한 값이 배열에 있는 검색
		//있으면 치킨 배달가능 없으면 없는 치킨 입니다. 출력
		
		String[] chickenMenu = {"양념치킨","후라이드치킨", "간장치킨"};
				
			//사용자로 부터 치킨 이름 입력받기
			Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요 : ");
		String inputChic = sc.next();
		
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		//for -each 문을 사용해서 치킨이 있는지 확인하는 직업
	
		for(String 치킨 : chickenMenu) {
			//System.out.println(치킨);
			//만약에 치킨이 존재한다면 found = true ; break;
			if( 치킨.equals(inputChic)) {
				found = true;
				break;
			}
		}
		//만약에 치킨이 존재한다면 배달가능 출력
		if(found) {
			System.out.println(inputChic + "배달 가능! 합니다.");
		}else {
			System.out.println(inputChic + "은(는) 없는 메뉴 입니다..");
		//존재하지 않는다면 ㅇㅇ 치킨은 없는 메뉴입니다. 출력
		}
		
	}
	
	public static void main(String[] args) {
		practice1();
		
		// for 문을 활용한 배열 출력하기
		/*
		int numbers[] = new int[5];
		
		//1 부터 4까지 배열애 숫자 넣기
		//index 0 부터 시작하기 떄문에 i = 0
		//length = 길이
		
		System.out.println("최대길이 : " +numbers.length);
		
		for(int i = 0; i <numbers.length; i++ ) {
			numbers[i] = i;
			System.out.println("numbers[" + i + "] = " + i);
		}
		*/
	}
}

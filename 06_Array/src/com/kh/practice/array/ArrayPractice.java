package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		
			int numbers[] = new int[11];
		
			for(int i = 1; i <numbers.length; i++) {
				numbers[i] = i;
				System.out.print(i+" ");

			}
			
		}

	public void practice2() {
		
		int numbers[] = new int[10];
		
		for(int i = 0; i <numbers.length; i++ ) {
			numbers[i] = numbers.length -i;
			System.out.println("numbers[" + i + "] " + numbers[i]);
				
		}
	}

	public void practice3() {
		
		//양의 정수를 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		
		int size = sc.nextInt();
		int[] numbers = new int[size]; //size = 5
		
		for(int i = 0; i < size ; i++) {
			numbers[i] =i + 1;
			System.out.print(numbers[i] + " ");
		}
	}

	public void practice4() {
						//  0	  1		2		3		4
		String[] fruits =  {"사과", "귤", "포도", "복숭아", "참회"};
			System.out.println(fruits[1]);
		
		
/*길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
 * 배열 인덱스를 활용해서 귤을 출력하세요.*/
		}
	
	public void practice6() {
		
		// 요일 생성
		int number[] = new int[6];
		//length 7
		//index 		   0    1    2    3     4    5    6
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		//0부터 6까지의 숫자 입력
		System.out.print("0부터 6까지의 숫자 입력받기 :");
		int num = sc.nextInt();
		
		// 입력한 숫자가 0 ~ 6 사이에 있는지 사이에 있는지 확인 후 사이에 있다면 요일 출력
		if(num >= 0 && num <= 6) {
			System.out.println(week[num] +"요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
			
	}

	public void practice7() {
		
		//길이가 7인 배열을 생성
		int[] num = new int[7]; //index [0 1 2 3 4 5 6] length 7
					// num의 최종 길이를 알기 위해서 num.length 를 사용
		// 램덤으로 숫자 램덤으로 숫자 출력하기
		// 램덤으로 숫자를 출력하는 방법
		// 1. Random 객체사용 : 조금 더 넓은 범위로 램덤을 사용
		// 2. Math 객체에서 random() 메서드 사용 : 위 Random 객체보가 작은 범위로 사용 가능
		
		for(int i =0; i<num.length; i++) {
			num[i]	= (int)(Math.random() * 45 + 1); //45 0 ~ 44 -> 1 ~ 45
			System.out.println("num[" + i +"]  = "+ num[i] );
		}
	}
	
	public void practice9() {
		
	}
	public void	method1() {
		//정수 0 1 2 10 20 30 출력하기
		int[] num = new int[6];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		

		// 문자열 각 자리에 월 화 수 목 금 토 일 각 자리에 어떤 요일이 들어가 있는지 출력
		String str[] = {"월","화","수","목","금","토","일"};
		//for 문을 활용한 출력
		
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
 		
		//실수 index 2 까지 만들어주고 출력 실수 자유
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for(int i = 0; i < dbl.length; i++) {
			System.out.println(dbl[i] + " ");
		}
		// 실수 'A' 'B' 'C' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A', 'B', 'C'};
		
		for(int i = 0; i < chr.length; i ++) {
			System.out.println(chr[i] + "  ");
		}
	}
}
	
	


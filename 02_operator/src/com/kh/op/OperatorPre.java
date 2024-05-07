package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	// 최종 출력하는 메인메서드
	public static void main(String[] args) {
		method1();
	}
	//최종적으로 출력하는 메서드는 아님
	//내가 필요할 떄 꺼내서 사용하는 메서드
	//메서드 : 특정 상태나 기능을 정리해놓은 집합
	
	//static : 고정된 이라는 뜻을 가지고 있음
	//static 이 붙는 것을 자료형이나 변수에 담아서 쓰는게 아니라
	//단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
	
	
	public static void method1() {
		
		
		
		
		
		// 1. int num1 = 10 int num2 = 3
		// 더하기 뺴기 곱하기 나누기 결과를 출력하기

		//int num1 = 10;
		//int num2 = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("a값을 입력하세요 :");
		int A = sc. nextInt();
		System.out.println("b값을 입력하세요 :");
		int B = sc. nextInt();
		
		//int sum = num1+num2;
		//System.out.println("sum : "+ sum);
		//int dif = num1-num2;
		//System.out.println("dif : "+ dif);
		//int mul = num1*num2;
		//System.out.println("mul : "+ mul);
		//int div = num1/num2;
		//System.out.println("div : "+ div);
		
		
		// 2. double num3 = 2.5 double num4 = 3.5
		// 더하기 뺴기 곱하기 나누기 결과를 출력하기
		//double num3 = 2.5;
		//double num4 =3.5;
		
		//double sum1 = num3+num4;
		//System.out.println("sum : "+ sum1);
		//double dif1 = num4-num3;
		//System.out.println("dif : "+ dif1);
		//double mul1 = num3*num4;
		//System.out.println("mul : "+ mul1);
		//double div1 = num4/num3;
		//System.out.println("div : "+ div1);
		
		/****************************/

		
		int sum2 = A+B;
		System.out.println("sum : "+ sum2);
		int dif2 = A-B;
		System.out.println("dif : "+ dif2);
		int mul2 = A*B;
		System.out.println("mul : "+ mul2);
		int div2 = A/B;
		System.out.println("div : "+ div2);
		
		
			/**/

		 //더하기 뺴기 곱하기 나누기 결과를 출력하기
	    System.out.println("C입력하세요");
	    double num3 = sc.nextDouble();
	    System.out.println("d입력하세요");
	    double num4 = sc.nextDouble();
	    
		
	    double sum1 = num3+num4;
		System.out.println("sum : "+ sum1);
		double dif1 = num4-num3;
		System.out.println("dif : "+ dif1);
		double mul1 = num3*num4;
		System.out.println("mul : "+ mul1);
		double div1 = num4/num3;
		System.out.println("div : "+ div1);
	}

}

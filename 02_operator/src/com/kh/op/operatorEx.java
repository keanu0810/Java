package com.kh.op;

import java.util.Scanner;

public class operatorEx {
	//메인 메서드 호출
	public static void main(String[] args) {
		//int a = 1;
		//int b = 3;
		//내가 스캐너로 입력박은 값이 출력되게 해봅시다.
		Scanner sc = new Scanner(System. in);
		System.out.println("안녕하세요 계산기입니다.");
		System.out.print("a값을 입력하세요");
		System.out.print("b값을 입력하세요");
		// a = 큰 수를 사용
		int a = sc.nextInt();
		int b =sc.nextInt();
		System.out.println(a+b);
		//덧셈
		int sum = a+b;
		System.out.println("sum : "+ sum);
		//뺼셈
		int dif = a-b;
		System.out.println("뺼셈 결과 dif : "+ dif);
		//곱셈
		int mul = a*b;
		System.out.println("곱셈 결과 mul " + mul);
		//나눗셈
		int div = b/a;
		System.out.println("나눗셈 결과 div " + div);
	}

}

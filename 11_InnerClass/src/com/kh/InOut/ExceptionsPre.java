package com.kh.InOut;

public class ExceptionsPre {
	public static void main(String[] args) {
		 //0으로 나누기 할 때 if 작성하며 예외 처리하기
		try {
			//예외가 발생할 순 있지만 일단 실행!
			
		int 나누기결과 = 10 / 0;
		System.out.println(나누기결과);
			//산수관련 Exception 변수명
		} catch (ArithmeticException 산수발생예외발생) {
			System.out.println("산수 문제가 발생했습니다 : ");
			
	}
		
		//try 단축키 try 작성후 ctrl space
		
		try {
			//예외가 발생할 수 있지만 시도하고 싶은코드 작성
			
			// index     0  1  2  [] 안에 들어갈 수 있는 최대 숫자
			int[] 배열 = {1, 2, 3};
			System.out.println(배열[3]);
			
					
					
		} catch (Exception e) {
			System.out.println("범위를 벗어났습니다.");
		}

	
		
	}
}

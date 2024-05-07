package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	public static void main(String[] args) {
		//Stck 을 활용해서 10 30 50 40 20 을 넣고 push 사용
		Stack<Integer> 숫자 = new Stack<>();
		숫자.add(10);
		숫자.add(30);
		숫자.add(50);
		숫자.add(40);
		숫자.add(20);
		// pop 맨위에 값을 지우고 반환해서 확인
		int 맨위 = 숫자.pop();
		System.out.println(맨위);
		//peek 현재 맨 위 값 확인
		int 맨위값 = 숫자.peek();
		System.out.println(맨위값);
		//isEmpty 비어있는지 확인
		boolean 숫자유무 = 숫자.isEmpty();
		System.out.println(숫자유무);
		//size 크기가 몇인지 확인
		int 사이즈 = 숫자.size();
		System.out.println(사이즈);
	}
}

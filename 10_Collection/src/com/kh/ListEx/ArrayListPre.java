package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		
		//add 사과 바나나 오렌지
		a.add("사과");
		a.add("바나나");
		a.add("오렌지");
		
		//출력 System.out.println(a);
		System.out.println(a);
		
		//get(1)을 사용해서 1에 들어있는 값 반환
		String 겟 = a.get(1);
		System.out.println(겟);
		
		// set(1, "포도")을 사용해서 바나나를 포도로 변경
		a.set(1, "포도"); // 값을 입력할 땐 . set
		System.out.println(a.get(1));//값을 출력할 땐 . get
		
		//size 이용해서 크기 반환
		System.out.println(a.size());
		
		//isEmpty() 리스트가 비어있는지 확인
		System.out.println(a.isEmpty());
		
		//remove(2) 지정된 자리제거
		a.remove(2);
		
		//remove("사과") 사과 제거
		a.remove("사과");
		
		//clear 모두제거
		a.clear();
	}
}

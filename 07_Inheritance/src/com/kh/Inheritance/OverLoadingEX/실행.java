package com.kh.Inheritance.OverLoadingEX;
/*
  └
  ㅂ + 한자
  동물 
  └강아지
  └고양이
 * */
public class 실행 {
	//최종으로 싱행하기 위해서 main 메서드 ctrl + space 
	public static void main(String[] args) {
		
		강아지 강아지1번 = new 강아지("멍멍이");		
		강아지1번.소리();
		
		고양이 고양이1번 = new 고양이("고영희");
		고양이1번.소리();
		
		//소, 토끼
		
		소 소1번 = new 소("초롱이");
		소1번.소리();
		
		토끼 토끼1번 = new 토끼("깡총이");
		토끼1번.소리();
		
		
		
	}
}

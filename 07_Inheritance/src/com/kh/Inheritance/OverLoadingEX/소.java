package com.kh.Inheritance.OverLoadingEX;

public class 소 extends 동물{

	public 소(String 이름) {
		super(이름);
	}
	
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 음메소리 냅니다.");
	}
}

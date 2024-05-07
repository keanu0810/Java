package com.kh.interfaceEx;

public class 중학생용계산기 implements 계산기, 기계 {
	
	public int 합(int a, int b) {
		return a + b;
	}
	public int 차(int a, int b) {
		return a - b;
	}	
	public int 곱(int a, int b) {
		return a * b;
	}		
	public double 몫(int a, int b) {
		return a / b;
	}			
	public int 나머지(int a, int b) {
		return a % b;
	}
	@Override
	public void 전원켜기() {
		System.out.println("중학생용 계산기를 킵니다");
	}
	@Override
	public void 전원끄기() {
		System.out.println("중학생용 계산기를 끕니다");
	}
}

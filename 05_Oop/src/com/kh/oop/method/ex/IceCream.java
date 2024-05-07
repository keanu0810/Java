package com.kh.oop.method.ex;

public class IceCream {
	//필드
	//private String name;
	//private boolean milk;
	private String name;
	private boolean milk;
	private int sugar;

public void setName(String name) {
		this.name = name;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
public String getName() {
		return name;
	}
	public boolean isMilk() {
		return milk;
	}
	public int getSugar() {
		return sugar;
	}
	//메서드
	//생성자 : 기본
	public IceCream() {
		
	}
	//생성자 : 필수 이름 설탕 우유 유무
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
		
	//void makeIceCream(){
	void makeIceCream(){
		System.out.println("아이스크림을 제조합니다.");
		System.out.println(" 종류 : " + name);
		System.out.println("우유 여부 : " + milk);
		if(milk) {
			System.out.println("우유추가");
		} else { //우유 없음
			System.out.println("우유 미추가");
		}
		System.out.println("아이스크림이 준비되었습니다.");
	}
	//아이스림 만들고
	//이름 성탕 우유 유무 출력
	//우유 추가 하면 우유 추가
	//우유 미추가하면 우유 미추가
//IceCreamRun -> 메인메서드
	
	
	
}

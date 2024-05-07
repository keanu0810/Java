package com.kh.oop.method.ex;

public class HamburgerStore {

	//필드 햄버거 가격
	private String name;
	private int pirce;
	
	public void setName(String name) {
		this.name = name;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	public String getName() {
		return name;
	}

	//메서드
	public HamburgerStore() {
		
	}
	
	public HamburgerStore(String Name, int Price) {
		this.name = Name;
		this.pirce =Price;
			
	
		
		
	}
	//setter
	
	//getter
	//생성자 : 기본
	
	//생성자 : 필수 name price
	
	//void info() 햄버거 정보 출력
	public void infor() {
		System.out.println("햄버거 이름 " + name);
		System.out.println("햄버거 가격" + pirce);
	}
	//main
	public static void main(String[] args) {
		HamburgerStore ham1 = new HamburgerStore();
		ham1.setName("불고기버거");
		ham1.setPirce(2000);
		
		
		HamburgerStore ham2 = new HamburgerStore("치즈버거", 3000);
		ham2.infor();
	}
	//1. 시본 생성자 불고기버거 2000
	//2. 필수 생성자 치즈버거 3000
}

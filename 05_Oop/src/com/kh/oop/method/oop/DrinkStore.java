package com.kh.oop.method.oop;

public class DrinkStore {
//필드	
	//음료 제조 객체 생성
	DrinkMaker drinMaker = new DrinkMaker("아메리카노" , 2,3);
	DrinkStore DrinkStore = new DrinkStore(drinMaker, "서울","메가커피",true);
	private DrinkMaker maker; // 다른 클래스명
	private String location; //위치
	private String name; // 브랜드
	private boolean takeout; // ok
	
	//getter
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}
	
	//setter
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	
//메서드	
	//생성자 : 기본
	public DrinkStore() {
		
	}
	//생성자 : 필수 음료종류 음료 양 온도
	public DrinkStore( DrinkMaker maker, String location, String name, boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this. takeout = takeout;
	}
	//void orderDrink
	public void orderDrink() {
		System.out.println(location + " " + name + "에 주문한 정보");
		// 제조 음료 확인
		maker.makerDrink();
	if(takeout) {
		System.out.println("테이크아웃주문");
	} else {
		System.out.println("매장용 컵으로 드리겠습니다.");
	}
	//System.out.println(location + " " + name
	//								+"에 주문한 정보");
			//만약 takeout true 테이크아웃 주문
			// else 매장 내 섭취
}
}

package com.kh.oop.method.ex;

public class PizzaStore {
	//필드 alt shift s
	private String pizzaName; // 피자명
	private int pizzaPrice; //피자가격
	
	//settet gettet
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	
	//생성자 : 기본
	public PizzaStore() {
		
	}
	//메서드 : 생성자 : 필수 피자의 이름 가격
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
	}
	//메서드
	public void inforPizza() {
		System.out.println("피자이름 : " + pizzaName);
		System.out.println("피자가격 : " + pizzaPrice);
		
	}

	//메서드 : main ( 단축키 main ctrl + space)
	public static void main(String[] args) {
		//피자객체
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("페페로니 피자");
		pizza1.setPizzaPrice(11000);
		
		pizza1.inforPizza();
		
		System.out.println("---------------");
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("포테이토 피자");
		//가격 적는 것을 잊음
		pizza2.inforPizza();
		
		//필수 생성자로 피자생성
		PizzaStore pizza3 = new PizzaStore("치즈 피자", 13000);
		pizza3.inforPizza();
		
	}
	
	
}

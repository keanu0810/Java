package com.kh.oop.method.ex;

public class CoffeeRun {
	public static void main(String[] args) {
		//Ŀ�� ����Ŀ ��ü ����
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("�Ƹ޸�ī��");
		coffee1.setSuger(1);
		coffee1.setMilk(false);
		coffee1.makeCoffee();
		System.out.println("---------");
		
		
		
		CoffeeMaker coffee2 = new CoffeeMaker("��ī���ξƸ޸�ī��",2,true);
		coffee2.makeCoffee();
		
		
	}
}

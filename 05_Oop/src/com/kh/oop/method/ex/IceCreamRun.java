package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		IceCream ice = new IceCream();
		ice.setName("������");
		ice.setSugar(3);
		ice.setMilk(false);
		ice.makeIceCream();
		
		IceCream ice1 = new IceCream("�ٴҶ� ���̽�ũ��", 2, true);
		ice1.makeIceCream();
	}

}

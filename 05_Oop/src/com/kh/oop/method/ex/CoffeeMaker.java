package com.kh.oop.method.ex;

//Ŀ�Ǹ����
public class CoffeeMaker {
	//�ʵ�
	private String coffeeType; //Ŀ������
	private int sugar;// ������
	private boolean milk;// ��������
	//�޼���
		//setter
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSuger(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
		//getter - boolean ���� ��� get�� �ƴ϶� is �� ǥ��
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSuger() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
	//������ : �⺻
	public CoffeeMaker() {
		
	}
	//������ : �ʼ�
	public CoffeeMaker(String coffeeType, int sugar, boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk; 
	}
	//void - Ŀ������
	public void makeCoffee() {
		System.out.println("Ŀ�Ǹ� �����մϴ�.");
		System.out.println("���� : " + coffeeType);
		System.out.println("���� : " + sugar + "g");
		//���࿡ ������ �߰� �ƴٸ�
		if(milk) {
			System.out.println("�����߰�");
		} else { //���� ����
			System.out.println("���� ���߰�");
		}
		System.out.println("Ŀ�ǰ� �غ�Ǿ����ϴ�.");
	}
	/*
	//main - �������� �����ϰų� ����� �ڵ� �ۼ�
	public static void main(String[] args) {
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("�Ƹ޸�ī��");
		coffee1.setSuger(1);
		coffee1.setMilk(false);
		
		coffee1.makeCoffee();
		System.out.println("-------------");
		//�ʼ� ������ ����ؼ� Ŀ�� ��ü ����
		CoffeeMaker coffee2 = new CoffeeMaker("��ī���ξƸ޸�ī��",2,true);
		coffee2.makeCoffee();
	}
	*/
}

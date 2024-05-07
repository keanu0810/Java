package com.kh.oop.method.ex;

public class PizzaStore {
	//�ʵ� alt shift s
	private String pizzaName; // ���ڸ�
	private int pizzaPrice; //���ڰ���
	
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
	
	//������ : �⺻
	public PizzaStore() {
		
	}
	//�޼��� : ������ : �ʼ� ������ �̸� ����
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
	}
	//�޼���
	public void inforPizza() {
		System.out.println("�����̸� : " + pizzaName);
		System.out.println("���ڰ��� : " + pizzaPrice);
		
	}

	//�޼��� : main ( ����Ű main ctrl + space)
	public static void main(String[] args) {
		//���ڰ�ü
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("����δ� ����");
		pizza1.setPizzaPrice(11000);
		
		pizza1.inforPizza();
		
		System.out.println("---------------");
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("�������� ����");
		//���� ���� ���� ����
		pizza2.inforPizza();
		
		//�ʼ� �����ڷ� ���ڻ���
		PizzaStore pizza3 = new PizzaStore("ġ�� ����", 13000);
		pizza3.inforPizza();
		
	}
	
	
}

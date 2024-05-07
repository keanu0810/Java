package com.kh.oop.method.oop;
//Ŀ�ǰ��� Ŭ����
public class CoffeeStore {
//�ʵ�
	//Ŀ�Ǹ���� ������ �����ͼ� ������ ���� Ŀ�� ����� ����� �ٸ��� �ۼ�
	private CoffeeMaker maker;
	private String storeName; // �����̸�
	private String location; // ������ġ
//�޼���
	//setter
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	
	//getter
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}

	//������ : �⺻
	public CoffeeStore() {
		
	}
	//������ : �ʼ� //Ŀ�� ������� ���Ը� ����
	public CoffeeStore(CoffeeMaker maker, String storeName , String location){
		this.maker =maker;
		this.storeName = storeName;
		this.location = location;
	}
	
	//void Ŀ�� �ֹ� �޼���
	public void orderCoffee() {
		System.out.println("���� : "+location);
		System.out.println(storeName + " �� �ֹ��� Ŀ�� ����");
		maker.makeCoffee();
	}
}

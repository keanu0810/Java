package com.kh.oop.method;

public class Car {
	//�ʵ�
	public String brand; // �� �귣��
	public String model; //�� ��
	public   int year; // �� ����
	
	//������
	//������ : �⺻
	public Car() {
		
	}
	//������ : �ʼ�
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model= model;
		this.year= year;
	
	}
	//������ : ctrl ����ä�� ������ ���콺�� ��� ó�� ������� �������� ��ġ�� ��
	
	//return�޼���
	public String getBrand() {
		return brand;
	}
	
		public String getmodel() {
			return model;
	}
		
		public int getyear() {
			return year;
	}
	
	public static void main(String[] args) {

		// �ڵ��� car1 ���
		
		Car car1 = new Car("Toyota", "Carmy", 2022);
		
		//���� ���
		System.out.println(car1.getBrand() + "  " + car1.getmodel() + "  "+ car1.getyear());

	}

}

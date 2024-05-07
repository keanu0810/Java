package com.kh.oop.basic;

public class Car {
	// �ʵ�
	public String color; // ���ǻ���
	public int speed; // ���� �ӵ�
	public String door;
	public String windoow;
	public String sunRoof;
	public String insurance;

	//������ = �޼ҵ带 ��ų� �ʱ�ȭ�� ���� ������
	public Car() {
		
	}
	
	// ������ = �ʼ� �ɼ�
	//�����ڴ� Ŭ���� �̸��� �Ȱ��ƾ���
	//������ �̸� = Ŭ�����̸� = ���ϸ�
	//public Car(���ڷ� ���� �� ����, ���ڷ� ���� �� �ӵ�)
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	// �޼���
	public void displayInfo() {
		System.out.println("�� ����");
		System.out.println("color : " + color);
		System.out.println("speed : " + speed);
		
	}
	//���� �޼���
	public static void main(String[] args) {
		//Car�� ������ ��������
		Car myCar = new Car();
		myCar.color = "������";
		System.out.println("���� �� ���� : " + myCar.color);
		
		//����ּ� ���� �������ϰ� �����̶� ���ǵ尡 ������ �� ����
		//���� ������� �����̶� ���ǵ�� ���� ������� ���ϴ� ���·� �� ���
		//order = (������) �ֹ�
		Car orderCar = new Car("blaek", 60);
		
		orderCar.displayInfo();
		
		// storeCar �ֹ� ���� white ���ǵ� �ִ� 100
		// ����� ���ǵ带 ���
		
		Car storeCar = new Car("white", 100);
		
		storeCar.displayInfo();
	}
}

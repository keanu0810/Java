package com.kh.oop.method.oop;

public class DrinkMaker {
	//�ʵ�
	private String drinkType; //��������
	private   int quantity;	// ���� ��
	private   int temp; // �µ�
//�޼���
	//setter	
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}


	
	//getter
	public String getDrinkType() {
		return drinkType;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getTemp() {
		return temp;
	}


	//������ : �⺻
	public DrinkMaker () {
		
	}
	
	//������ : �ʼ� �������� ���� �� �µ�
	public DrinkMaker (String drinkType, int quantity, int temp ) {
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}
	//void makerDrink
	public void makerDrink() {
		System.out.println("�ֹ����� : " + drinkType );
		System.out.println("������ �� : " + quantity);
		
		if(temp<5) {
			System.out.println("������");
	} else if (temp >5 && temp < 10) {
			System.out.println("�������ϰ�");
	} else { 
			System.out.println("�̰߰�");
		}
		System.out.println("�ֹ��� ���ᰡ ���Խ��ϴ�.");
	}
	

		//�������� �����
		//if �µ�<5) ������
		//else if �µ� (5~10)�������ϰ�
		//else { �̰߰�
	//if - else if - else Ż�� ��
	//�������� �Ϸ� ���
}


package com.kh.oop.method.oop;

public class DrinkStore {
//�ʵ�	
	//���� ���� ��ü ����
	DrinkMaker drinMaker = new DrinkMaker("�Ƹ޸�ī��" , 2,3);
	DrinkStore DrinkStore = new DrinkStore(drinMaker, "����","�ް�Ŀ��",true);
	private DrinkMaker maker; // �ٸ� Ŭ������
	private String location; //��ġ
	private String name; // �귣��
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
	
//�޼���	
	//������ : �⺻
	public DrinkStore() {
		
	}
	//������ : �ʼ� �������� ���� �� �µ�
	public DrinkStore( DrinkMaker maker, String location, String name, boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this. takeout = takeout;
	}
	//void orderDrink
	public void orderDrink() {
		System.out.println(location + " " + name + "�� �ֹ��� ����");
		// ���� ���� Ȯ��
		maker.makerDrink();
	if(takeout) {
		System.out.println("����ũ�ƿ��ֹ�");
	} else {
		System.out.println("����� ������ �帮�ڽ��ϴ�.");
	}
	//System.out.println(location + " " + name
	//								+"�� �ֹ��� ����");
			//���� takeout true ����ũ�ƿ� �ֹ�
			// else ���� �� ����
}
}

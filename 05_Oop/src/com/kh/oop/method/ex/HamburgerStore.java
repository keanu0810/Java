package com.kh.oop.method.ex;

public class HamburgerStore {

	//�ʵ� �ܹ��� ����
	private String name;
	private int pirce;
	
	public void setName(String name) {
		this.name = name;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	public String getName() {
		return name;
	}

	//�޼���
	public HamburgerStore() {
		
	}
	
	public HamburgerStore(String Name, int Price) {
		this.name = Name;
		this.pirce =Price;
			
	
		
		
	}
	//setter
	
	//getter
	//������ : �⺻
	
	//������ : �ʼ� name price
	
	//void info() �ܹ��� ���� ���
	public void infor() {
		System.out.println("�ܹ��� �̸� " + name);
		System.out.println("�ܹ��� ����" + pirce);
	}
	//main
	public static void main(String[] args) {
		HamburgerStore ham1 = new HamburgerStore();
		ham1.setName("�Ұ�����");
		ham1.setPirce(2000);
		
		
		HamburgerStore ham2 = new HamburgerStore("ġ�����", 3000);
		ham2.infor();
	}
	//1. �ú� ������ �Ұ����� 2000
	//2. �ʼ� ������ ġ����� 3000
}

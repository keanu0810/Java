package com.kh.oop.constructor;

public class Cafe { // �� ������ () ���� ����
	//�ʵ� ����
		//ī�� �̸� ���� ���̺��
	public String name;
	public String location;
	public int tableNum;
	
	//�⺻ ������ �� �ʼ� ������ �����
	public Cafe() {
		
	}
	public Cafe(String name, String location, int tableNum) {
				this.name = name;
				this.location = location;
				this.tableNum = tableNum;
	}
	// void �޼��� �����
	public void cafeInfo() {
		//ī���̸� ���� ���̺�� ����ϱ�
		//System.out.println("---------------"; - = 15�� ����
		System.out.println("ī���̸�" + name);
		System.out.println("ī����ġ" + location);
		System.out.println("���̺��" + tableNum);
		System.out.println("---------------");
	}
	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���. kh�����Դϴ�.");
		System.out.println("===ī�� ��ȸ�ϱ�===");
		
		
		
		
		//cafe ��ü�� ����ؼ�
		//1. �⺻������ cafe1 �����
		// �̸� ���̺� �ۼ��ϰ� ����ϱ�
		Cafe cafe1 = new Cafe();
		cafe1.name = "khī��";
		cafe1.cafeInfo();
		
		
		//2 �⺻ �����ڷ� cafe2 �����
		// ���� ���̺� �ۼ��ϰ� ����ϱ�
		Cafe cafe2 = new Cafe();
		cafe2.location = "����";
		cafe2.tableNum = 10;
		cafe2.cafeInfo();
		
		
		//3. �ʼ� ������ cafe3 �����
		// �ʼ��� ������ ���� ����ϱ�
		Cafe cafe3 = new Cafe("cafeKH", "Seoul", 6);
		cafe3.cafeInfo();

	}

}

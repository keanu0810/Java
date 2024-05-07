package com.kh.oop.basic;

public class Bank {
	// �̸� ���¹�ȣ �ܾ� ��й�ȣ �����ü��ŵ���
	public  String name;
	public  String accountNumber;
	public     int balance;
	public  String password;
	public boolean agree;
	//boolean �⺻�� false
	// ������ �޼��� 
	// 1. �ʼ��� �ƴ� ������ = Ŭ������ ���ƾ���
	public Bank() {
		
	}
	// 2. �ʼ��� ������ �̸� ���¹�ȣ �ܾ� �н�����
	public Bank(String name, String a, int b, String password) {
		this.name = name;
		this.accountNumber = a;
		this.balance = b;
		this.password = password;
		
	}
	// 3. ��� ������
	public void info() {
		System.out.println("�̸� : " + name);
		System.out.println("���¹�ȣ :" + accountNumber);
		System.out.println("�ܾ� : " + balance);
		System.out.println("��й�ȣ : " + password);
		System.out.println("�����ü��ŵ��� : " + agree);
	}
	
	// 4. ���� ���� ��� �޼���
	public static void main(String[] args) { 
		// 1. �� �� ���� ���� ok
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-3333";
		customer1.balance = 123;
		customer1.password = "0000";
		customer1.agree = true;
		
		customer1.info();
		
		// 2. �� �� ���� ���� ���ŵ��� �Ǽ��� ����
		Bank customer2 = new Bank();
		customer2.name = "dan";
		customer2.accountNumber = "111-110-1234";
		customer2.balance = 1000;
		customer2.password = "1234";
		//���ŵ��Ǹ� �ؾ��ϴµ� ���ŵ��Ǹ� ���ϰ� �ٻڴٰ� ���� ��������
		
		customer2.info();
		// 3. �ʼ� �����ڸ� Ȱ���ؼ� ����Ŭ ���� ���� ���� 
				//�̸� ���¹�ȣ �ܾ� ��й�ȣ �� �Է��ϰ�
				// ������ ���ŵ��Ǹ� true �����ؼ� ����ϱ�
				Bank customer3 = new Bank("����Ŭ", "456-678-234", 4567, "0000");
				customer3.agree = true;
				
				customer3.info();
	}
}
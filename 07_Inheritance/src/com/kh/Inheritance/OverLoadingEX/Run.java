package com.kh.Inheritance.OverLoadingEX;

public class Run {
	//main �޼��� : main�� �����ε� X �������̵� X
	public static void main(String[] args) {
		//��� 1 : ȫ�浿
		Person ���1 = new Person();
		���1.setName("ȫ�浿");
		//��� 2 : �ڿ���
		Person ���2 = new Person("�ڿ���");
	
		//��� 3 : ��ö��
		Person ���3 = new Person("��ö��" , 7);
		
		
		���1.displayInfo();
		���2.displayInfo();
		���3.displayInfo();
		
	}
}

package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	 if ������ ������ ���� �� �ְ�, �Ǽ��� ���Ҽ� �ְ�, ���ڿ� ���� �� ��� ���� ���� �� ����
	 
	 ��ǥ������ �����񱳿� ���ڿ� �� ����
	 = �� equal
	 ������
	 	if(���� == ����) {
	 		���ڿ� ���ڰ� ���� �� ������ ��¹�
	 	}
	 	���ڿ� ��		,equal
	 		if ("���ڿ�".equals("���ڿ�")) {
	 		���ڿ��� ���ڿ��� ���� �� ������ ��¹�
	 		
	 	}
	 	���ڿ��� String �������� �־��شٸ� "���ڿ�" ū ����ǥ�� �ٿ��� ���� �ʰ�
	 	�������� �������� �����ָ� �ȴ�.
	 	
	 	String str = "���ڿ�";
	 	if (str.equals(str)) {
	 		System.out.println("���ڿ��� �����մϴ�"_;
	 	}
	 	if ("���ڿ�".equals(str)) {
	 		System.out.println("���ڿ��� �����մϴ�.");
	 	if (str.equals("���ڿ�") {
	 		System.out.println("���ڿ��� �����մϴ�.");
	 	}
	 * */
	
	
	
	public static void main(String[] args) {
		//������
		int number = 10;
		//���࿡ ���ڰ� 10 �̶��
		if (number == 10) {
			System.out.println("���ڰ� �����մϴ�.");
		}
		
		//���ڿ� ��
		String str = "hello";
		// ���࿡ �� ���ڿ��� ���ٸ�
		if (str.equals("hello")		) {
			System.out.println("�� ���ڿ��� �����ϴ�.");

		}
		
		String str1 = "��";
		String str2 =  "";
		
		if("��".equals(str1)) {
			System.out.println("��� �� �Դϴ�.");
		}
	}
}
package com.kh.operatorPre;

import java.util.Scanner;

public class ConditionEx2 {
	/*
	 if		-	else if		-	else
	 �����
	 if (����) {
	   ������ ���� ��� ������ �ڵ� �ۼ�
	   
	 } else if (����2) {
	 
	 	����1�� ������ ��� ������ �ڵ� �ۼ�
	 	
	 } else(����2) {
	 
	 	����1�� �����̰�
	 	����2�� ������� ������ �ڵ� �ۼ�
	 	
	 } else{
	 
	 	����1�� ����2�� ��� ������ ��� ������ �ڵ� �ۼ�
	 	
	 */

	
	/* ���̸� �Է¹޾Ƽ�
	   13�� ���ϸ� "���"
	   13�� �ʰ� 18�� ���� "û�ҳ�"
	   18�� �ʰ� "����"
	*/
	
	/*
	 �� �� �Է� �޾� �ش��ϴ� ���� ����ϱ�
	 �� : 3,4,5
	 ���� : 6,7,8
	 ���� : 9,10,11
	 �ܿ� : 12,1,2
	 * */
	public static void method1() {
		// ���࿡ ���� 2000�� �̻� ���� ��� �ýø� ź��
		// ���࿡ ���� 1500~1900 ���� ���� ��� ���߱����� �̿��Ѵ�
		// ���࿡ ���� ������� �ɾ��.
		
		String result;
		
		int money = 1800; // ���� ���� ������ �ִ� ��
		
		if(money >= 2000) { // 2000�� �̻��� ���
			result = "�ýø� ź��";
		// 2000�� �̻��� ������ 1500�� �̻��� ���� ���
		} else if (money >= 1500 && money <= 1900 ) {
			result = "���߱����� �̿��Ѵ�.";
		// 1400�� ���� ���� ��� �ɾ��.
		} else {
			result = "�ɾ��.";
			System.out.println(result);
		}
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��ϼ��� khƼ�ϳ����Դϴ�. ");
		System.out.println("���̸� �Է����ּ��� ");
		int age = sc.nextInt();
		
		if (age <= 13) {
			System.out.println("���");
		}else if (age <= 18) {
			System.out.println("û�ҳ�");
		}else {
			System.out.println("����");
		}
	}
	

	public static void method3(){
		// ���࿡ 1,2, 12�ܿ�
		// 3 4 5 ��
		// 6 7 8 ����
		//9 10 ����
		// �ش��ϴ� ������ �����ϴ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ۼ��ϼ���.");
		int month = sc.nextInt();
		
		String result;
		
		if(month == 1 || month == 2 || month == 12) {
				result = "�ܿ�";
			}else if (month >= 3 && month <= 5) {
				result = "��";
			}else if (month >= 6 && month <= 8) {	
				result = "����";
			}else if (month >= 9 && month <= 11) {	
				result = "����";
			}else {
				result = "�ش��ϴ� ������ �����ϴ�.";
			
			}
		System.out.println(result);
		}
	
	public static void method4(){
		//13�� ���� ��� 14 ~ 18�� û�ҳ� 19�� ����
		
		int age = 22;
		// ������ ����� Ȱ���ؼ� �������� ���̿� ���� ǥ�⸦ ���
		String result;
		if(age <= 13) {
			result = "���";
		} else if (age >=14 && age <= 18) {
			result = "û�ҳ�";
		} else {
			result = "����";
		}
		System.out.println(result + "�Դϴ�.");
		}
		
	
		public static void main(String[] args) {
				method1(); 
				//method2();
				//method3();
				//method4();

		
	}
	
}

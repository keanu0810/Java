package com.kh.conditionEx;

import java.util.Scanner;

// ��Ű�� : �ۼ��� ������ ���� ��ġ

// ���ǹ� ��ɿ� Ŭ����
public class CondtionEx {
	/*
	 if�� �� class
	 if �־��� ������ ���� �� ���� �Ǵ� �ڵ� ���
	 else ������ ������ �� ����Ǵ� �ڵ� ���(�ʼ��� �ƴ�)
	 
	 �����
	 if( ���ǹ�) {
	 	������ ���� ��� ������ �ڵ� �ۼ�
	 	���࿡ ���ǹ��� ������ ���� �ƴ� ���
	 	�ڵ����� ���� ����
	 }
	 
	 
	 	*/
	//�޼��� 1 : 19�� �̻��� ���� �Դϴ�. ����ϱ�
	
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		// ���࿡ ���� ���̰� 19�� �̻��̶��
		if (age >= 19) {
			// age�� ���� 19 �̻��̸� �����Դϴ� ��µǰ� �ϱ�
			System.out.println("�����Դϴ�.");
		} else {
			// ���࿡ ������ �ƴ϶�� ������ �ƴմϴ�. ����ϰ� �ϱ�
			System.out.println("������ �ƴմϴ�.");
			
		}

	}
	public static void method2(){
		int num = 2;
		
		//���࿡ num �� ¦���� ��� ¦���Դϴ�. ����ϱ�
		// ¦�� 2 % 0
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�!!!");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		//num �� Ȧ���� ��� Ȧ�� �Դϴ�. ����ϱ�
		
	}
	public static void method3(){
		int age = 10;
			//	true	true
		if (age > 0 && age < 14) {
			//��̶�� ǥ���ϱ�
			System.out.println("��Դϴ�.");
			//14 ���ʹ� ��̰� �ƴմϴ�.
		
		
		// 14 ���� ��̰� �ƴմϴ�.
	}
	}
	
	// public static void practice1()
	 	// ���̰� 10�� �̻� 20�� �̾��� ���� 10��
		// �ܴ̿� 10�밡 �ƴ� ���
	//public static void practice2()
			// ���̰� 80�� �̻��̸� 80�� �̻��Դϴ�. ����ϱ�
	//���࿡ age ���� ������ �ƴ϶�� ������ �ƴմϴ�. ����ϰ� �ϱ�
	
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���. : ");
		
		int age = sc.nextInt();
		if (age <= 10 && age > 20) {
			System.out.println("10�� �Դϴ�");
		}else
			System.out.println("20�� �Դϴ�");
			
		}

	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		int age = 80;
		if (age >= 80); {
			System.out.println("80�� �̻��Դϴ�.");
			
		}
	}
	public static void practice3() {
		int num = 8;
		
		if(num % 8 == 12) {
			System.out.println("¦���Դϴ�!!!");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
	public static void main(String[] args) {	
		//method1();
		//method2();
		//method3();
		//practice1();
		//practice2();
	}

}
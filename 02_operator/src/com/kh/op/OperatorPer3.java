package com.kh.op;

import java.util.Scanner;

public class OperatorPer3 {
	//���� ������� �޼���
	//public static void method1()�� ����
	//Scanner �� �̿��ؼ� num1 num2 �� ���� �Է¹ް�
	// <>�� ����ؼ� �Է� ���� ���� <> �� � ������ true �� �������� Ȯ���ϱ�
	// boolean resul1 = num1 > num2;
	// boolean resul2 = num1 >= num2;
	// boolean resul3 = num1 < num2;
	// boolean resul4 = num1 <= num2;
	public static void method1() {
		Scanner sc = new Scanner(System. in);
		System.out.println("num1�� ���� �Է��ϼ���" );
		int num1 = sc.nextInt();
		System.out.println("num2�� ���� �Է��ϼ���");
		int num2 = sc.nextInt();
		 boolean resul1 = (num1 > num2);
		 System.out.println("num1 > num2" + resul1 );
		 boolean resul2 = (num1 >= num2);
		 System.out.println("num1 >= num2" + resul2 );
		 boolean resul3 = (num1 < num2);
		 System.out.println("num1 < num2" + resul3);
		 boolean resul4 = (num1 <= num2);
		 System.out.println("num1 <= num2" + resul4);
	}
	
	// ������
	// public static void method2() num1 num2 num3�� �ް�
	// && || ����ؼ� ũ�� ���� �� Ȯ���ϱ�
	// boolean result = (num1 <num2) && (num1 == num2) ���� �Ǵ°�?

	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1�� ���� �Է��ϼ���" );
		int num1 = sc.nextInt();
		System.out.println("num2�� ���� �Է��ϼ���");
		int num2 = sc.nextInt();
		System.out.println("num3�� ���� �Է��ϼ���");
		int num3 = sc.nextInt();
		// && if while ������ üũ�� ��
		//		�� ���� ������ ��� �����ϴ� ��� ���
		// & 	��Ʈ ���� �������� Ư�� ��Ʈ ������ �Ǵ��� �� ���
		boolean result = (num1 < num2) && (num2 == num3);
		System.out.println("(num1 < num2) && (num2 == num3) �ᱫ");
	}
	public static void main(String[] args) {	

		//method1();
		method2();	
	}
	
}

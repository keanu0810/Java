package com.kh.op;

import java.util.Scanner;

// class �ٱ����� package�� import �� �ۼ��� �� ����
// �̿� �����ڰ� �����ϰ��� �ϴ� ������ �ۼ��Ҽ� ����
//�޼��� : Ư�� ���³� ����� �����س��� ����
public class OperatorEx2 {
	//1. �޼��� : ��ĳ�ʸ� ������� �ʴ� �޼���
	public static void �޼���1() {
		//������ ���� �޼��� �߿���
		//����ϰ� ���� �޼��常 �ۼ��� ��
		//���࿡ �޼���1() �ȿ� �ۼ��� ������ ����ϰ� �ʹٸ�
		//�޼���1(); �̶�� �ۼ� �� ����ϸ� ����

		�޼���1();
	
		
		int num1 = 20;
		int num2 = 5;
		int ���ϱ� = num1 + num2;
		int ���� = num1 - num2;
		int ���ϱ� = num1 * num2;
		int ������ = num1 / num2;
		System.out.println("���ϱ� :" + ���ϱ�);
		System.out.println("���� :" + ����);
		System.out.println("���ϱ� :" + ���ϱ�);
		System.out.println("������ :" + ������);
	}
		//�޼��� 3 () -> Scanner
		//�޼��� ���� �ִ� () ���߿� � ���� ���� �� ���
		//���� ���� ���� ������ () ��������� ����
	
	public static void �޼���2() {
		double num3 = 1.4;
		double num4 = 2.5;
		double sum = num3 + num4;
		double sub = num3 - num4;
		double mul = num3 * num4;
		double div = num3 / num4;
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
		
	}
	
		public static void �޼���3() {
			 Scanner sc = new Scanner(System.in);
			//Ű����� �ۼ��� ���ڰ� num5�� ���� �� �ְ� ���� ����
			int num5 = sc.nextInt();
			System.out.print(num5);
			//Ű����� �ۼ��� ������ num6�� ���� �� �ְ� ���� ����
			int num6 = sc.nextInt();
			//Ű����� ���޹��� ���ڸ� ���ϱ� ���� ���ϱ� ������ �� �� ����
			int sum1 = num5 = num6;
			int sub1 = num5 = num6;
			int mul1 = num5 = num6;
			int div1 = num5 = num6;
			System.out.println("sum1 :" +sum1);
			System.out.println("sub1 :" +sub1);
			System.out.println("mul1 :" +mul1);
			System.out.println("div1 :" +div1);
			
		}
	//�޼��� 4�� ���� ��ĳ�ʷ� double ���ϱ� ���� ���ϱ� ������ ���
	// double num7 = sc.nextDouble();
	// double num8 = sc.nextDouble();
	//���ϱ� double sum2
	//���� double sub2
	//���ϱ� double mul2
	//���� double div2
		
	public static void �޼���4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num7�� �ش��ϴ� ���ڸ� �Է��ϼ��� ��");
		System.out.println("num7�� �ش��ϴ� ���ڸ� �Է��ϼ���");
		double num7 = sc.nextDouble();
		System.out.println("num8�� �ش��ϴ� ���ڸ� �Է��ϼ���");
		double num8 = sc.nextDouble();
		
		double sum2 = num7 +num8;
		double sub2 = num7 -num8;
		double mul2 = num7 *num8;
		double div2 = num7 /num8;
		
		System.out.println("���ϱ� : " + sum2);
		System.out.println("���� : " + sub2);
		System.out.println("���ϱ� : " + mul2);
		System.out.println("������ : " + div2);
		
		
		
	}
	
	
	//���� ���� ���� �޼���
	public static void main(String[] args) {
		//������ ���� �޼��� �߿���
		//����ϰ� ���� �޼��常 �ۼ��� ��
		�޼���2();
		�޼���3();
		�޼���4();
	}
	
}

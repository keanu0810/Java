package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	// ���� ����ϴ� ���θ޼���
	public static void main(String[] args) {
		method1();
	}
	//���������� ����ϴ� �޼���� �ƴ�
	//���� �ʿ��� �� ������ ����ϴ� �޼���
	//�޼��� : Ư�� ���³� ����� �����س��� ����
	
	//static : ������ �̶�� ���� ������ ����
	//static �� �ٴ� ���� �ڷ����̳� ������ ��Ƽ� ���°� �ƴ϶�
	//�ܵ����� ���������� �޸𸮿��� ����� �� ������ ��Ÿ���� ǥ��
	
	
	public static void method1() {
		
		
		
		
		
		// 1. int num1 = 10 int num2 = 3
		// ���ϱ� ���� ���ϱ� ������ ����� ����ϱ�

		//int num1 = 10;
		//int num2 = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("a���� �Է��ϼ��� :");
		int A = sc. nextInt();
		System.out.println("b���� �Է��ϼ��� :");
		int B = sc. nextInt();
		
		//int sum = num1+num2;
		//System.out.println("sum : "+ sum);
		//int dif = num1-num2;
		//System.out.println("dif : "+ dif);
		//int mul = num1*num2;
		//System.out.println("mul : "+ mul);
		//int div = num1/num2;
		//System.out.println("div : "+ div);
		
		
		// 2. double num3 = 2.5 double num4 = 3.5
		// ���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		//double num3 = 2.5;
		//double num4 =3.5;
		
		//double sum1 = num3+num4;
		//System.out.println("sum : "+ sum1);
		//double dif1 = num4-num3;
		//System.out.println("dif : "+ dif1);
		//double mul1 = num3*num4;
		//System.out.println("mul : "+ mul1);
		//double div1 = num4/num3;
		//System.out.println("div : "+ div1);
		
		/****************************/

		
		int sum2 = A+B;
		System.out.println("sum : "+ sum2);
		int dif2 = A-B;
		System.out.println("dif : "+ dif2);
		int mul2 = A*B;
		System.out.println("mul : "+ mul2);
		int div2 = A/B;
		System.out.println("div : "+ div2);
		
		
			/**/

		 //���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
	    System.out.println("C�Է��ϼ���");
	    double num3 = sc.nextDouble();
	    System.out.println("d�Է��ϼ���");
	    double num4 = sc.nextDouble();
	    
		
	    double sum1 = num3+num4;
		System.out.println("sum : "+ sum1);
		double dif1 = num4-num3;
		System.out.println("dif : "+ dif1);
		double mul1 = num3*num4;
		System.out.println("mul : "+ mul1);
		double div1 = num4/num3;
		System.out.println("div : "+ div1);
	}

}

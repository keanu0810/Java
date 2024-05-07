package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		
			int numbers[] = new int[11];
		
			for(int i = 1; i <numbers.length; i++) {
				numbers[i] = i;
				System.out.print(i+" ");

			}
			
		}

	public void practice2() {
		
		int numbers[] = new int[10];
		
		for(int i = 0; i <numbers.length; i++ ) {
			numbers[i] = numbers.length -i;
			System.out.println("numbers[" + i + "] " + numbers[i]);
				
		}
	}

	public void practice3() {
		
		//���� ������ �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� : ");
		
		int size = sc.nextInt();
		int[] numbers = new int[size]; //size = 5
		
		for(int i = 0; i < size ; i++) {
			numbers[i] =i + 1;
			System.out.print(numbers[i] + " ");
		}
	}

	public void practice4() {
						//  0	  1		2		3		4
		String[] fruits =  {"���", "��", "����", "������", "��ȸ"};
			System.out.println(fruits[1]);
		
		
/*���̰� 5�� String�迭�� �����ϰ� �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
 * �迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.*/
		}
	
	public void practice6() {
		
		// ���� ����
		int number[] = new int[6];
		//length 7
		//index 		   0    1    2    3     4    5    6
		String[] week = {"��", "ȭ", "��", "��", "��", "��", "��"};
		Scanner sc = new Scanner(System.in);
		//0���� 6������ ���� �Է�
		System.out.print("0���� 6������ ���� �Է¹ޱ� :");
		int num = sc.nextInt();
		
		// �Է��� ���ڰ� 0 ~ 6 ���̿� �ִ��� ���̿� �ִ��� Ȯ�� �� ���̿� �ִٸ� ���� ���
		if(num >= 0 && num <= 6) {
			System.out.println(week[num] +"����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
			
	}

	public void practice7() {
		
		//���̰� 7�� �迭�� ����
		int[] num = new int[7]; //index [0 1 2 3 4 5 6] length 7
					// num�� ���� ���̸� �˱� ���ؼ� num.length �� ���
		// �������� ���� �������� ���� ����ϱ�
		// �������� ���ڸ� ����ϴ� ���
		// 1. Random ��ü��� : ���� �� ���� ������ ������ ���
		// 2. Math ��ü���� random() �޼��� ��� : �� Random ��ü���� ���� ������ ��� ����
		
		for(int i =0; i<num.length; i++) {
			num[i]	= (int)(Math.random() * 45 + 1); //45 0 ~ 44 -> 1 ~ 45
			System.out.println("num[" + i +"]  = "+ num[i] );
		}
	}
	
	public void practice9() {
		
	}
	public void	method1() {
		//���� 0 1 2 10 20 30 ����ϱ�
		int[] num = new int[6];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		

		// ���ڿ� �� �ڸ��� �� ȭ �� �� �� �� �� �� �ڸ��� � ������ �� �ִ��� ���
		String str[] = {"��","ȭ","��","��","��","��","��"};
		//for ���� Ȱ���� ���
		
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
 		
		//�Ǽ� index 2 ���� ������ְ� ��� �Ǽ� ����
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for(int i = 0; i < dbl.length; i++) {
			System.out.println(dbl[i] + " ");
		}
		// �Ǽ� 'A' 'B' 'C' �־��� ���� �� �ڸ� ����غ���
		char chr[] = {'A', 'B', 'C'};
		
		for(int i = 0; i < chr.length; i ++) {
			System.out.println(chr[i] + "  ");
		}
	}
}
	
	


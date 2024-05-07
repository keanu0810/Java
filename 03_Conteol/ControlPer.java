package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPer {
	//�ǽ����� 1�� Ȧ�� ¦�� ��Ÿ����
	// ����̸鼭 ¦�� �ϋ��� ¦���Դϴ�.
	// ���࿡ ���ڰ� 2�� �������� �� �������� 0 �̶�� ¦�� �̴�.
	// ���࿡ ���ڰ� ����� ��쿡�� Ȧ ¦�� ��Ÿ�� ���̴�.
	/* �߶󳻱� ctrl + X ���� : ctrl + C �ٿ��ֱ� ctrl + V*/
	public static void practie1() {
		//Ű����� �Է¹��� ������ ����̸鼭 ¦�� �� ���� ¦���Դϴ� ���
		Scanner sc = new Scanner(System.in);
				
		System.out.println("������ �Է��ϼ��� : ");;
		int number = sc.nextInt(); // Ű����� ���� �Է¹ޱ�
		
		if(number > 0) { // �Է¹��� ���ڰ� ����� ��쿡�� ����ϱ�
			if (number % 2 == 0) {//���ڰ� ¦���� ��� ����ϱ�
				System.out.println("¦���Դϴ�.");
			} else {			 // ���ڰ� Ȧ���� ��� ����ϱ�
				System.out.println("Ȧ���Դϴ�.");
			} 
		} else {				 // �Է¹��� ���ڰ� ������ ��� ����ϱ�
			System.out.println("���� �Դϴ�, ����� �Է����ּ���.");
		}
	}					
				
	public static void practie2() {
		//Ű����� ���� ���� ���� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������");
		int korean = sc.nextInt();
		
		System.out.println("��������");
		int english = sc.nextInt();
		
		System.out.println("��������");
		int math = sc.nextInt();
		
		//�հ�� ��� ���
		int totalScore = korean + english + math; //�հ�
		double averageScore = totalScore / 3.0;
		//�հ� ���� �Ǻ�
		// �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���
		if(korean >= 40 &&  english >= 40 && math >=40 && averageScore <=60)	{
			System.out.println("�������� : " + korean);
			System.out.println("�������� : " + english);
			System.out.println("�������� : " + math);
			System.out.println("��  �� : " + totalScore);
			System.out.println("��  �� : " + averageScore);
			System.out.println("�����մϴ�, �հ��Դϴ�!!!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		
		
	}
				
	public static void practie3() {
		/*
		 *  1 ~ 12 ������ ���� �Է¹޾� �ش� ���� �ϼ��� ����ϼ���.
		 *  2�� ������ �������� �ʽ��ϴ�.
		 *  OO���� �߸� �Է��� ���Դϴ�. ��/�� �빮��O
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� 12 �� �ϳ� �Է� : ");
		int month = sc.nextInt(); //Ű����� �Է��� ��
		
		int daysMonth; // �ش��ϴ� ���� �ϼ�
		switch (month) {
		case 1 : case 3 : case 5 : case 7 :case 8 :case 10 :case 12 : 
			daysMonth = 31;
			break;
		case 4 : case 6 : case 9 : case 11 :
			daysMonth = 28;
			break;
		default :
			System.out.println(month + "���� �������� �ʴ� ���Դϴ�.");
			//daysMonth = 0;
			return;
			/*
			 break �� return
			 break�� ��� switch�� for�� while������ ���
			 		�ش��ϴ� case �ܸ̿� ������
			 return ��𼭵��� ��� ����
			 	���� ��ȯ�� �� �ְ�, �޼��峪 �Լ��� ������ �ߴ��ϸ� ȣ���� ������ ���� ����
			 	�޼��峪 �Լ� ������ return ���� ����Ǹ� �� ���Ŀ� �ڵ�� ������� ����
			 */
		}
		System.out.println(month + "����" + daysMonth + "�ϱ��� �ֽ��ϴ�.");
	}
	public static void practie4() {
		Scanner sc = new Scanner(System.in);
		
		//Ű�� ������ �Է� �ޱ�
		System.out.println("Ű(m) �� �Է��ϼ���");
		double height = sc.nextDouble();
		
		System.out.println("������(kg)�� �Է��ϼ��� : ");
		double weight = sc.nextInt();
		
		//BMI ���
		double bmi = weight / (height * height );
		
		//BMI ������ ���� ��� ���
		if(bmi <18.5) {
			System.out.println("��ü��");
		} else if (bmi <23) {
			System.out.println("����ü��");
		} else if (bmi <25) {
			System.out.println("��ü��");
		} else if (bmi <30) {
			System.out.println("��");
		} else{
				System.out.println("����");
		}
		
		
	}
	
	public static void practie5() {
		//�߰� �⸻ ���� �⼮ �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� ���� : ");
		double mid = sc.nextDouble();
		System.out.print("�⸻ ���� : ");
		double fin= sc.nextDouble();
		System.out.print("���� ���� : ");
		double assig = sc.nextDouble();
		System.out.print("�⼮ Ƚ�� : ");
		int attend = sc.nextInt();
		
		//�⼮ ���� ���
		double attendPer = (double) attend / 20 * 100;
		// attend / 20 = �⼮�� Ƚ���� ��ü ���� Ƚ���� ������ �⼮ ������ ���
		// double �Ҽ��� �ؿ� �ִ� ������ ����
		// �Ǽ��� �� ���� 100�� ���ؼ� ������� ��ȯ
		// �� ������ ���� ���� ���
		// �߰� 20 �⸻ 30 ���� 30 �⼮ 20 = 100��
		// �߰� ���� 20
		double midScore = mid * 0.2;
		// �⸻ ���� 30
		double fiScore = fin * 03;     // 100�� ���� 30%
		// ����
		double asScore = assig *0.3;
		double attendScore = attendPer * 0.2;
		double totalScore = midScore= fiScore = asScore = attendPer;
		
		// �򰡿� ���� pass �Ǵ� Fali ���
		if (totalScore >= 70 && attendPer >= 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("======���======");
		System.out.println("�߰���� ���� (20�� ����) : " + midScore);
		System.out.println("�⸻��� ���� (30�� ����) : " + fiScore);
		System.out.println("������� ���� (20�� ����) : " + asScore);
		System.out.println("�⼮��� ���� (30�� ����) : " + attendScore);
		System.out.println("��      �� (20�� ����) : " + totalScore);
	}
	public static void main(String[] args) {
		//practie1();
		//practie2();
		practie3();
		//practie4();
		//practie5();

	}

}

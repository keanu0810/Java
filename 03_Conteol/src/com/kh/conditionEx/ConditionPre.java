package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	/* public static viod methhod1() {
	 	���� �� 2���� �޾Ƽ� ���� �ΰ��� ��ġ�ϴ��� Ȯ��
	 	Scanner sc = new Scanner(System).in);
	 	int num1 = sc.nextInt();
	 	int num2 = sc.nextInt();
	 	���ٸ� �����ϴ�, ����ϰ�
	 	���� �ʴٸ� ���� �ʽ��ϴ�, ����ϱ�
	*/
	public static void methhod1() {
		Scanner sc = new Scanner(System.in);
			System.out.println("ù��° ���ڸ� �Է����ּ��� : ");
		int num1 = sc.nextInt();
			System.out.println("�ι��� ���ڸ� �Է����ּ��� : ");
	 	int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + "��" + num2 + "�� ���� �����ϴ�.");
		}else {
			System.out.println(num1 + "��" +  num2 + "�� ���� ���� �׽��ϴ�.");
		}
	}
	/*public static void methhod2() {
	  if �� Ȱ�� ���� �� 2�����޾Ƽ� ���� �ΰ��� ��ġ�ϴ��� Ȯ��
	  Scanner sc = new Scanner(System.in);
	  int str1 = sc.next.Line();
	  int str2 = sc.next.Line();
	  ���ٸ� �����ϴ�. ����ϰ�
	  ���� �ʴٸ� ���� �ʽ��ϴ�, ����ϱ�
	  */
	public static void methhod2() {
		  Scanner sc = new Scanner(System.in);
			System.out.println("���ڸ� �Է����ּ��� : ");
		  String str1 = sc.nextLine();
		  String str2 = sc.nextLine();
		  if(str1.equals(str2)) {
				if (str1 == str2) {
					System.out.println(str1 + "��" + str2 + "�� ���� �����ϴ�.");
				}else {
					System.out.println(str1 + "��" +  str2 + "�� ���� ���� �׽��ϴ�.");
				}
		  }
	}
	
	public static void methhod3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("douvle1�� ���� �Է����ּ��� : ");
		double douvle1 = sc.nextDouble();
		System.out.println("douvle2�� ���� �Է����ּ��� : ");
		double douvle2 = sc.nextDouble();
		if (douvle1 == douvle2) {
			System.out.println(douvle1 + "��" + douvle2 + "�� ���� �����ϴ�.");
		}else {
			System.out.println(douvle1 + "��" +  douvle2 + "�� ���� ���� �׽��ϴ�.");
		}
	}
	//�������� ������ ���� �޼���
	public static void main(String[] args) {
		//methhod1();
		//methhod2();
		//methhod3();

	}

}

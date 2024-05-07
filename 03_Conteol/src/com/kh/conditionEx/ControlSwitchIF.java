package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIF {

	public static void takeAtaxi() {
		// �Է¹��� ���� 3000�� �̻��� ��쿡�� �ýø� Ż ������ ��� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �����ϰ� �ִ� �ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		//if ���� ����ؼ� �ݾ��� 3000�� �̻��� ��쿡�� ����� �ڵ带 �ۼ� ���� ��
		if(money >=3000) {
			System.out.println("�ýø� Ż���? (��/�ƴϿ�)");
			String answer = sc.next();
			
			//answer�� ���� ��信 ���� ������ ó���ϱ�
			switch (answer) {
			case "��" :
				System.out.println("�ýø� �����ϴ�.");
				break;
			case "�ƴϿ�" :
				System.out.println("�ýø� Ÿ�� �ʽ��ϴ�.");
				break;
			default :
				System.out.println("�߸��� �Է��� �ƴմϴ�.");
			
			}
		}else {
			System.out.println("3000�� �����̹Ƿ� �ܾ��� �����մϴ�.");
		}
	}
	
	/*public static void whyScore
	 * ����ڷκ��� ������ �Է¹޾� ���� ����� �Ǻ��ϴ� ���α׷� �ۼ�
	 * int score
	 * if
	 * 90 �̻��� ��� A����
	 * 80 �̻��� ��� B����
	 * 70 �̻��� ��� C����
	 * 60 �̻��� ��� D����
	 * 50 �̻��� ��� F����
	 * switch
	 * 	-> F Ȯ���� �� ����� �Ͻðڽ��ϴ� (yes / No)
	 * ���࿡ yes No �̿��� ���� ���� �� �ֱ� ������
	 * case YES : case NO : 
	 * */
	public static void whyScore() {
		// ��ĳ�� �̿��ؼ� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���");//Ű����� ���� �Է¹ޱ�
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A���� �Դϴ�.");
		} else if (score >= 80) {
			System.out.println("B���� �Դϴ�.");
		} else if (score >= 70) {
			System.out.println("C���� �Դϴ�.");
		} else if (score >= 60) {
			System.out.println("D���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�.");
			System.out.println("����� �Ͻðڽ��ϱ�? (yes / no) : ");
			String reScore = sc.next();
			
			//������� ���θ� Ȯ���ϱ�
			switch (reScore) {
				case "yes" : case "YES" :
					System.out.println("����� ��û�� �Ϸ�Ǿ����ϴ�.");
					break;
				case "no" : case "NO" :
					System.out.println("������û ���� �ʾҽ��ϴ�.");
					break;
				default :
					System.out.println("�ٸ��� �Է��Ͻÿ�.");
				
			}
		}
		
		
	}
	/*public static void whayDay
	 * �� �� �� : �ｺ
	 * ȭ �� : ����
	 * �� �� : �ָ��ε� ������ �� �����Դϱ�? (�� / �ƴϿ�)
	 * ���࿡ ������ �� �����̸� �� ������ �� �����Դϴ�.
	 * 		�ƴϿ� �����ϸ� � Ȱ���� �� �������� �������ּ���.
	 * 			Ȱ�� 1. ��� 2. ���� 3. ���� ������ �� �ְ� ������� 
	 * */
	public static void whayDay() {
		//������ � �������� Ȯ���� �Ŀ� ���Ͽ� ���� ����� ������ ��
		Scanner sc = new Scanner(System.in);
		System.out.print("��¥�� �Է��ϼ��� : ");
		System.out.println("(�� / ȭ / �� / �� / �� / �� /��)");
		String day = sc.next();
		String result;
		switch(day) {
		case "��" : case "��": case "��":
			result = "�ｺ";
			break;
		case "ȭ" : case "��" : 
			result = "����";
			break;
		case "��": case "��" : 
			System.out.println("������ �� �����Դϱ�? (�� / �ƴϿ�) : ");
			String answer = sc.next();
			if (answer.equals("��")) {
				result = "��";
			} else { //������ �� ������ �ƴ� ���
				System.out.println("� Ȱ���� �� ��ȹ�ΰ��� ?");
				System.out.println("1.��� 2.���� 3.���� : ");
				int activity = sc.nextInt();
				switch (activity) {
				case 1:
					result = "���";
					break;
				case 2:
					result = "����";
					break;
				case 3:
					result = "����";
					break;
				default :
					result = "�߸��� �Է�";
					return;
				}
			}
		default :
			return;
		}
		
		System.out.println(day +"���� ���Ͽ� " + result + "�� ����");
	}
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		whayDay();
	}

}
package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.snack.controller.SnackController;

public class SnackMenu {
	//���� �޴��� �Է��ϰ� ���� â
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���");
		System.out.println("���� : ");
		String kind = sc.next();
		System.out.println("�̸� : ");
		String name = sc.next();
		System.out.println("�� : ");
		String flavor = sc.next();
		System.out.println("���� : ");
		int numOf = sc.nextInt();
		System.out.println("���� : ");
		int price = sc.nextInt();
		
		System.out.println("������ ������ Ȯ���Ͻðڽ��ϱ�? ( y / n)");
		String a = sc.next();
		//���࿡ y�� ������ ������ ���� ���
		//equalsIgnoreCase ��ҹ��� ���̸� �����ϸ鼭 �� ���ڿ��� ���ϴµ� ���
		
		if(a.equalsIgnoreCase("Y")){
			System.out.println("�����Ͻðڽ��ϱ�?");
		} else {
			System.out.println("���� �մϴ�.");
		}
		//���� ���� �� ������ Ȯ��
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		//���� ���� �� ������ Ȯ��
		System.out.println(scr.comfirmData());
				
		
	}
}

package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {
	public static void practice1() {
		
		int numbers[] = new int[11];
	
		for(int i = 1; i <numbers.length; i++) {
			numbers[i] = i;
			System.out.print(i+" ");

		}
		
	}

	public void practice7() {
		//�Է��� ���� �迭�� �ִ� �˻�
		//������ ġŲ ��ް��� ������ ���� ġŲ �Դϴ�. ���
		
		String[] chickenMenu = {"���ġŲ","�Ķ��̵�ġŲ", "����ġŲ"};
				
			//����ڷ� ���� ġŲ �̸� �Է¹ޱ�
			Scanner sc = new Scanner(System.in);
		System.out.println("ġŲ �̸��� �Է��ϼ��� : ");
		String inputChic = sc.next();
		
		//�迭�� ����ڰ� �Է��� ġŲ�� �ִ��� �˻�
		boolean found = false;
		
		//for -each ���� ����ؼ� ġŲ�� �ִ��� Ȯ���ϴ� ����
	
		for(String ġŲ : chickenMenu) {
			//System.out.println(ġŲ);
			//���࿡ ġŲ�� �����Ѵٸ� found = true ; break;
			if( ġŲ.equals(inputChic)) {
				found = true;
				break;
			}
		}
		//���࿡ ġŲ�� �����Ѵٸ� ��ް��� ���
		if(found) {
			System.out.println(inputChic + "��� ����! �մϴ�.");
		}else {
			System.out.println(inputChic + "��(��) ���� �޴� �Դϴ�..");
		//�������� �ʴ´ٸ� ���� ġŲ�� ���� �޴��Դϴ�. ���
		}
		
	}
	
	public static void main(String[] args) {
		practice1();
		
		// for ���� Ȱ���� �迭 ����ϱ�
		/*
		int numbers[] = new int[5];
		
		//1 ���� 4���� �迭�� ���� �ֱ�
		//index 0 ���� �����ϱ� ������ i = 0
		//length = ����
		
		System.out.println("�ִ���� : " +numbers.length);
		
		for(int i = 0; i <numbers.length; i++ ) {
			numbers[i] = i;
			System.out.println("numbers[" + i + "] = " + i);
		}
		*/
	}
}

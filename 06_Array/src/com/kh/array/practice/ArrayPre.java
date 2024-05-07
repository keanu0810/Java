package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
//�޼���
	//������ : �⺻
	public ArrayPre() {
		
	}
	public void practice1() {
		//�迭�� ����ؼ� ��ü �� ���ϱ�
		//�迭�� ����� �� ���� ����
		//�������� ���ڿ����� �������� �Ǽ����� ������ ���� �� [] ǥ �ۼ�
		
		//index 	 0  1  2  3  4	lengte = 5
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;
		
		//for-each �� ó������ ������ �ݺ��ؼ� ���𰡸� ������ �� ���
		// 				{1, 2, 3, 4, 5}
		for(int  ����	:	num	) {
			// num �ȿ� �ִ� ��褤 ���ڰ� �ϳ��� ���� �ȿ� ����
			//���ڵ��� ��
			result += ����; // result = 1 + 2 + 3 + 4 +5
		}
		System.out.println("���ڵ��� �� : " + result);
		
	}

	public void practice2() {
		//ArrayList ����ؼ� ���� �߰��ϱ�
		//	new ArrayList<>() <>�ȿ� String �� �־ �ǰ� �� �־ ��
		ArrayList<String> goods = new ArrayList<>();
		//��ǰ�� �߰��� ���� add ���ϱ�
		goods.add("��ǻ��");
		goods.add("�����");
		goods.add("T  V");
		goods.add("������");
		
		//��� ���� 2����
		System.out.println(goods);
		
		
		//for - each ���� Ȱ���ؼ� ���
		for(String	allgoods	:	goods ) {
			System.out.print(allgoods + " ");
		}
	}

	public void practice3() {
		//�迭�� ����ؼ� �ִ밪 ã��
		int[] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0];
		//				{3, 7, 2, 9, 1};
		for(int num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("�ִ밪 : " + max);
	}

	public void practice4() {
		// ã�� ������~~!
		// ���ϰ��� ��� �ٳ��� ���� ������
		String[] fruits = {"���", "�ٳ���", "����", "������"};
		String search = "�ٳ���";
		boolean found = false;//������ ã�Ҵ��� �� ã�Ҵ��� �𸣱� ������ false
		
		//for - each �� Ȱ���ؼ� �ٳ��� ã��
		//					{"���, "�ٳ���", "����", "������"}
		for ( String f : fruits) {
			
			//���࿡ ���� ã�� ���ϰ� �̸��� �Ȱ��ٸ� ã�Ҵ�~! ���ֱ�
			if(f.equals(search)) {
				found = true;
				break; // ã�ұ� ������ �̸��� �Ȱ����� Ȯ���ϴ� if�� Ż��
			}
		}
		
		System.out.println(search + "ã��?" +(found? "ã�Ҿ�" : "��ã�Ҿ�"));
						
	}

	public void practice5() {
		//��ĳ�� ������ �Է��ϰ� �迭�� ������ �ִ��� Ȯ���� ��
		// 4 search ��ĳ�ʷ� ����
		//String zoo = {"�ڳ���", "������", "Ǫ�ٿ�", "�䳢", "����"};
		String[] zoo = {"�ڳ���", "������", "Ǫ�ٿ�", "�䳢", "����"};
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		System.out.println("�����̸��� �Է��ϼ��� : ");
		String search = sc.nextLine();
		for( String animal : zoo) {
			if(animal.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + "ã�ҽ��ϴ�?" + (found ? "ã�Ҿ��." : "��ã�Ҿ��."));
	}
}

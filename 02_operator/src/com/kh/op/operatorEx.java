package com.kh.op;

import java.util.Scanner;

public class operatorEx {
	//���� �޼��� ȣ��
	public static void main(String[] args) {
		//int a = 1;
		//int b = 3;
		//���� ��ĳ�ʷ� �Է¹��� ���� ��µǰ� �غ��ô�.
		Scanner sc = new Scanner(System. in);
		System.out.println("�ȳ��ϼ��� �����Դϴ�.");
		System.out.print("a���� �Է��ϼ���");
		System.out.print("b���� �Է��ϼ���");
		// a = ū ���� ���
		int a = sc.nextInt();
		int b =sc.nextInt();
		System.out.println(a+b);
		//����
		int sum = a+b;
		System.out.println("sum : "+ sum);
		//�E��
		int dif = a-b;
		System.out.println("�E�� ��� dif : "+ dif);
		//����
		int mul = a*b;
		System.out.println("���� ��� mul " + mul);
		//������
		int div = b/a;
		System.out.println("������ ��� div " + div);
	}

}

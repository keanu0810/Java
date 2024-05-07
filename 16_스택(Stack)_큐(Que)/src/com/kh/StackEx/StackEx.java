package com.kh.StackEx;

import java.util.Stack;

/*
Stack(����)
	�����͸� �����ϴ� �ڷᱸ��
	LIFO Last_In - First Out 	: �������� �߰��� �׸��� ���� ����
	�ڷ� ���� ���, ���� ��� ���� 		

	    pop() : �� �� ���� �����ϰ� ��ȯ(������)
       peek() : �����̳� ť���� �� �� �Ǵ� �� �տ� �ִ� �����͸� ��ȯ(������) ������ ���������� ����
	   push() : ���ÿ��� ���� �߰��� ���� push ����ϰų� add�� ����ؼ� ����
			�ַ� ���ÿ����� push �� ���
			add ���� ����Ʈ�� �÷��ǿ��� �ַ� ���
			Stack Ŭ������ Vector�� ��ӹ޾� ������� Ŭ�����̱� ������ add ����
	isEmpty() : ���� ����ִ��� Ȯ��
	   size() : ũ��Ȯ��
 * */
public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> ���� = new Stack<>();
		
		����.add(1);
		����.add(2);
		����.add(3);
		
		
		//���ÿ��� �� �� �����͸� Ȯ���ϰ� �����
		// pop() : �� ���� �ִ� �����͸� �����ϰ� �� ���� ��ȯ(������)
		int ���� = ����.pop();
		System.out.println(����);
		
		
		int ����Ȯ�� = ����.peek();
		System.out.println(����Ȯ��);

		// isEmpty() : ������ ����ִ��� Ȯ��
		boolean isEmpty = ����.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("======= ���� 2 =======");
		
		Stack<Integer> ����2 = new Stack<>();
		����2.push(1);
		����2.push(2);
		����2.push(3);
		����2.push(4);
		����2.pop();
		System.out.println("���� �������� �����ְ� ����� ����2�� ��"+����2);
		
		int ������ = ����2.peek();
		System.out.println("����2�� �� �� ��" + ������);
		
		boolean ���������� = ����2.isEmpty();
		System.out.println("���� 2�� ����ֳ���? " + ����������);
		
		int ������ = ����2.size();
		System.out.println( "����2�� ������� ? "+ ������);
	}
}

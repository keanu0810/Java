package com.kh.SetEx;

import java.util.TreeSet;

/*
 TreeSrt
 �ߺ��� ������� �ʰ�, ���� �ڵ����� �����ϴ� ����
 �˻� Ʈ���� ���·� �����͸� �����ϸ�, �ڵ����� ���� ���� ���� 
 
 �ڵ����� 0~9, A~Z, ��~�� ��������
 
 add(0 		: �߰�
 remove() 	: ����
 contains() : ������ ���� �ִ��� Ȯ��
 isEmpty 	: TreeSet �� ����ִ��� Ȯ��
 size		: ����Ȯ��
 first		: ���� ���� ������ ��ȯ
 last		: ���� ū �����͸� ��ȯ
 Clear		: ��� �� ����
 * */
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		
		//�߰�
		ts.add(5);
		ts.add(2);
		ts.add(1);
		
		System.out.println("TreeSet ��� ���� : " +ts);
		
		//Set �ߺ��� �ȵǴ� ȣ�ָӴ� ���� ����
		//�ָӴ� ���� = �ȿ� ������� ������ �Ǿ����� �ʴٴ� �ǹ�
		
		ts.remove(2);
		// ����Ű : �ڵ� ���̵�alt ȭ��ǥ �� �Ʒ���
		// ����Ű : �ٻ��� ctrl + D
		System.out.println("TreeSet ��� ���� : " +ts);
		
		// �� ������ �Ǿ��ִ��� Ȯ��
		System.out.println(ts.contains(5)); //������ true
		
		//����ִ��� Ȯ��
		System.out.println(ts.isEmpty());// ��� ������ true);
				
		//������ ����
		System.out.println(ts.size());
		
		//���� ���� ��
		System.out.println(ts.first());
		
		//���� ū ��
		System.out.println(ts.last());
		
		//��� �� ����
		ts.comparator();
		System.out.println("��κ��� : "+ ts);
	}
}

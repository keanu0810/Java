package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		
		//add ��� �ٳ��� ������
		a.add("���");
		a.add("�ٳ���");
		a.add("������");
		
		//��� System.out.println(a);
		System.out.println(a);
		
		//get(1)�� ����ؼ� 1�� ����ִ� �� ��ȯ
		String �� = a.get(1);
		System.out.println(��);
		
		// set(1, "����")�� ����ؼ� �ٳ����� ������ ����
		a.set(1, "����"); // ���� �Է��� �� . set
		System.out.println(a.get(1));//���� ����� �� . get
		
		//size �̿��ؼ� ũ�� ��ȯ
		System.out.println(a.size());
		
		//isEmpty() ����Ʈ�� ����ִ��� Ȯ��
		System.out.println(a.isEmpty());
		
		//remove(2) ������ �ڸ�����
		a.remove(2);
		
		//remove("���") ��� ����
		a.remove("���");
		
		//clear �������
		a.clear();
	}
}

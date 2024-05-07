package com.kh.arrayList.ex;

import java.util.ArrayList;

/*
 ArrayList
 ����Ʈ�� �迭�� ��������� ũ�Ⱑ ������ �Ǿ����� �ʱ� ������ �ٸ�
 ���ϴ� ��ŭ ���� �� ����
 
 ArrayListEx �� �̸� ArrayList�� ������� �� �� !
 
 ArrayList<�ڷ���> ������ = new ArrayList<�ڷ���>();
 int 	 -> INteger
 String - > String
 double - > Double
 
 
 add 		�߰�
 get 		��ȯ
 set 		����
 remove 	����
 size 		���� Ȯ��
 isCmpty 	��� �ִ��� Ȯ��
 Clear 		��� ����
  */
public class ArrayListEx {
public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<Integer>();
	// index �ڸ���ġ 0
	
	//�ڸ��� ����ֱ� ������ true
	System.out.println(num.isEmpty());
	
	//���� �߰��ϱ�
	num.add(10); // index 0 10 ��
	
	System.out.println("�߰� Ȯ�� : " + num.get(0));
	
	System.out.println(num.isEmpty()); //false
	
	//ũ�� Ȯ�� size length ������� ����
	System.out.println(num.size());
	//set �����ϱ�	 ��ġ  ��� �����Ҳ���?
	//			 key	value
	num.set(      0,	 20);
	System.out.println("���� �� " + num.get(0));
	
	//����
	num.remove(0);
	// �����߱� ������ �ƹ��͵� ����
	System.out.println(num.isEmpty());
	}
}

















package com.kh.SetEx;

import java.util.HashSet;

/*
 set(����, �ָӴ�)
 	������ �������� ����
 	�ߺ� ������ ����x(������ ������ �����)
 	 �� HaghSet(��ǥ)   : ó�� �ӵ��� ���� Set
 set �� LinkedHashSet : ������ �����ϴ� set
     �� TreeSet       : �ڵ����ĵǴ� set
     
     HaghSet ��� ����
     	�ÿ� ���� 1 : ��ü�� equals() �����ε� �Ǿ� �־�� ��
     	��� ���� 2 : ��ü�� hashCode() �����ε� �Ǿ� �־�� ��
     	
     Set<�ڷ���> �� = new HashSet<>();
     HashSet<�ڷ���> �ؽü� = new HashSet<>();
     
     
*/
public class SetEx {
	
	public static void main(String[] args) {
		
		//�ߺ��� ������� �ʰ� �� ���� �����ϴ� ���� �����ؼ�
		//������ �ߺ� Ȯ�� ���� ���
		HashSet<String> set = new HashSet<>();
		//�����͸� �߰�            add
		set.add("�θེ");
		set.add("����");
		set.add("�׼�");
		set.add("������");
		System.out.println(set);
		
		/*�ڸ� ������ Ȯ��          get
		System.out.println(set.get(1));
		set �ڸ��� �����̰� Ư���ϰ� �ڸ���ȣ�� ������ �ڸ��� ����
		*/
		//������ ����              remove
		set.remove("�θེ");
		System.out.println(set);
		//������ ũ�� Ȯ��          size
		System.out.println(set.size());
		//������ ��� ����          clear
		set.clear();
		//Ư�� �����Ͱ� �����ϴ��� Ȯ�� contains
		System.out.println(set.contains("������"));
		//������ ���� �Ƕ� ���� �ڸ����� ��� �Ұ� set
		
	}
}

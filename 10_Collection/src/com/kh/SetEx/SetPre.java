package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//set.add ����� ���� �ɰԶ� ������ ��¡��� �˻���Ĩ �ɰԶ� �ɰԶ� �ɰԶ�
		set.add("�����");
		set.add("����");
		set.add("�ɰԶ�");
		set.add("������");
		set.add("��¡���");
		set.add("�˻���Ĩ");
		set.add("�ɰԶ�");
		set.add("�ɰԶ�");
		set.add("�ɰԶ�");
		//System.out.println(set);
		System.out.println(set);
		
		//size() ũ��Ȯ��
		System.out.println(set.size());
		
		//contains ����ؼ� �������� ���� �ϴ��� Ȯ��
		set.contains("������");
		System.out.println("�������� �ֽ��ϱ�? " + set.contains("������"));
		
		//set.reomve("����") ����
		set.remove("����");
		
		//set.isEmpty() �����Ͱ� ��� ���ŵǾ����� Ȯ��
		set.isEmpty();
		System.out.println(set);
		
	}
}

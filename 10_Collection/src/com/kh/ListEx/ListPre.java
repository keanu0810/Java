package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
  	  �� Vector : Java1 ���� �뿡�� ���� ���� �����ؼ� ���� ��
 List ��	ArrayList   :�˻��� ���� ������ ���԰� ������ ����Ѱ�� ������
 	  �� LinkendList : �˻��� ������ ������ ���԰� �������� ����
 
*/
public class ListPre {
//������ : �⺻ ������
	public ListPre() {
		
	}
//void : ����
	public void VectorEx() {
		//Lost<String> ���� = new Vector<>(); �̷��� ����ص� ������ �Ʒ� ��� ����
		Vector<String> ���� = new Vector<>();
		����.add("�ڹ�");
		����.add("���̽�");
		����.add("C");
		System.out.println(����);
	}
	public void LinkedEx() {
		//List<String> ��ũ�帮��Ʈ = new LinkedList
		LinkedList<String> ��ũ�帮��Ʈ = new LinkedList();
		��ũ�帮��Ʈ.add("��");
		��ũ�帮��Ʈ.add("ȣ����");
		��ũ�帮��Ʈ.add("�۾���");
		System.out.println(��ũ�帮��Ʈ);
	}
	
	public void ArrayEx() {
		ArrayList<String> ��̸���Ʈ = new ArrayList<>();
		
		��̸���Ʈ.add("���");
		��̸���Ʈ.add("�ٳ���");
		��̸���Ʈ.add("����");
		System.out.println(��̸���Ʈ);
	}
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();
	}
	
}

package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
 Collecton(List, Set,Map) �ݺ��ϴµ� ���
 Enumeration : �� �̻� ���� X Vector�� ���� ������ ���� Ŭ���������� ����
 
 Iterator : �ݺ��ϴµ� ���(���������� ȸ��)
 			�б⸸ ����, �߰��ϰų� ������ �� ����
 			
 ListIterator : Iterator ���׷��̵� ����
 			List(Vector, ArrayList LinckedList) �÷��ǿ����� ���
 			��������� ���������� ȸ���� �� ����
 			��������� ��ȸ - �յڷ� �̵� ����
 			�߰��ϰų� ������ �� ����
 			
 Iterator �ؿ��ִ� �޼���
 hasNest() : ������ �ִ��� ������ Ȯ��
 			���࿡ �����Ѵٸ� teue �������� �ʴ´ٸ� false
 Nest()	   : ���� ���� ������ ���µ� ���
 		next() �� ����ϱ� ���� hasNext() ����ؼ� �� ������ �ִ��� �������� Ȯ���ϰ� 
 			nest()�� ����ϴ� ���� ������(�ͼ��� ������ ��)
 			
 			
 			
 * */
public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<String> ���ϵ� = new ArrayList<>();
		���ϵ�.add("���");
		���ϵ�.add("��纣��");
		���ϵ�.add("�м��ĸ���"); // ����
		���ϵ�.add("����");
		
		//Iterator
		Iterator<String> �ݺ� = ���ϵ�.iterator();
		
		//hasNext() ���� ���� �ִ��� Ȯ��
		
		//next() ���� �� �ִ��� Ȯ�� = ���� ���Τ�
		while(�ݺ�.hasNext()) {
			//next()�� �� ������ ����
			String ���� = �ݺ�.next();
			System.out.println(����);
		}
	}
}

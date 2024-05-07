package com.kh.MapEx;

import java.util.TreeMap;

/*
 TreeMap �����˻�Ʈ�� ������ �˻� ���� ���� ������ ������ ����
 Ű-��(key-value) �����ϴ� �ڷᱸ��
 Ű�� �������� �����ؼ� ���� (���� : 0-9, ��-��, A-Z, a-z)
 
 �޼���
 put(key, value)	 : TreeMay�� Ű -���� �߰�
 get(key)			 : ����� Ű�� �ִ� ���� ���� ����	
 containsKey(key)	 : Ű�� ���ԵǾ��ִ��� Ȯ��
 containsvalue(value): ������ ���ԵǾ��ִ��� Ȯ��
 remove(key)		 : ������ Ű�� ����
 size()				 : Ű- �� ���� ���� ��ȯ(����Ǿ��ִ�)
 isEmpty()			 : ����ִ��� Ȯ��
 clear()			 : ��� ����
 * */
public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		
		// put ����ؼ� �� �߰�
		tm.put(1, "One");
		tm.put(2, "Two");
		tm.put(3, "Three");
		
		//�� ���� �ۼ��ϰ� �ʹٸ�
		Integer[] keys = {1, 2, 3};
		String[] values = {"One", "Two", "Three"};
		
		//�ݺ����� ����ؼ� �߰�
		for(int i = 0; i < keys.length; i++) {
			tm.put(keys[i], values[i]);
		}
		//Map ���� Ű �ߺ�x �ȵ� ������ �ٸ���� ��
		
		System.out.println(tm);
		
		//get �޼��带 ����ؼ� �� ��������
		System.out.println(tm.get(2));
		
		//remove ����ؼ� Ű-���� ����
		tm.remove(3);
		System.out.println(tm);
		
		//containsKey �޼��带 �̿��ؼ� Ű�� �ִ��� Ȯ��
		System.out.println(tm.containsKey(1));
		
		//size ����ؼ� ���� Ȯ��
		System.out.println(tm.size());
		
		//tm.isEmpt ����ִ��� Ȯ��
		System.out.println(tm.isEmpty());
		
		//clear �� ����ؼ� ��� 
		tm.clear();
		System.out.println(tm);
	}
		
	
}
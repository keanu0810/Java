package com.kh.SetEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
		/*
		 * String,String ���� "apple", "���" "banana", "�ٳ���" "orange", "������" "grape", "����"
		 * "watermelon", "����" [] for ���� Ȱ���ؼ� �߰�
		 * 
		 * ��ü��� get ����ؼ� banana�� �ش��ϴ� �� �������� size Ȯ�� isEmpty ����ִ��� Ȯ�� containsKey Ű��
		 * �����ϴ��� Ȯ�� grape containsValue ���� �����ϴ��� Ȯ�� ���� keySet() ��� Ű ��� Values() ��� �� ���
		 * firstKey() ù���� Ű lastKey() ������Ű ���
		 */

		TreeMap<String, String> ���Ϲٱ��� = new TreeMap<>();

		String[] Ű = { "apple", "banana", "orange", "grape", "watermelon" };

		String[] ���� = { "���", "�ٳ���", "������", "����", "����" };

		for (int i = 0; i < Ű.length; i++) {
			���Ϲٱ���.put(Ű[i], ����[i]);

		}

		System.out.println(���Ϲٱ���);
		System.out.println(���Ϲٱ���.get("banana"));
		System.out.println(���Ϲٱ���.size());
		System.out.println(���Ϲٱ���.isEmpty());
		System.out.println(���Ϲٱ���.containsKey("grape"));
		System.out.println(���Ϲٱ���.containsValue("����"));
		System.out.println(���Ϲٱ���.firstKey());
		System.out.println(���Ϲٱ���.lastKey());
		���Ϲٱ���.clear();
		System.out.println(���Ϲٱ���);

	}
}

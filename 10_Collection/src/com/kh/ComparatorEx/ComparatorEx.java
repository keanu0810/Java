package com.kh.ComparatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 ��Ű�����̳� ���ϸ� �� ���� �ٲٴ� ����Ű F2
 
 Comparator : ���ϴ� ��ü
 �޼���
 compare(������1, ������2) : �� ��ü�� ������ ���ؼ� ���� ������ ����
	 ������1�� ������2���� ������ ���� ��ȯ
	 ������1�� ������2 ������ 0�� ��ȯ
	 ������1�� ������2���� ũ�� ����� ��ȯ
reversed() : ������ �Ųٷ� ����� ������ �ޱ� �� ���
	reversed ����� ����!
Comparing(Ŭ������ :: �����Ҹ޼����) Ŭ���� �ؿ��� ������ �޼��带 ������ �ͼ� ���� ���� �������
 * */
public class ComparatorEx {
		public static void main(String[] args) {
			List<String> �ܾ�� = new ArrayList<>(Arrays.asList("apple","banana","cherry"));
				
			//�ܾ�� �ܾ��� ���̸� �������� ��������
			//Ŭ������ :: ÷���ҋ� �޼����
			//String Ŭ�������� �ؿ��ִ� �޼��� �߿��� ���̸� ��Ÿ���� length �޼��带 ����ؼ� ��
			Comparator<String> ���̺� = Comparator.comparing(String::length);
			
			// sort ����ؼ� ����
			�ܾ��.sort(���̺�);
			
			//���ĵ� ����Ʈ ���
			System.out.println("���ڿ� ���̸� �������� ���ĵ� ����Ʈ" + �ܾ��);
			
		
		
		}
}



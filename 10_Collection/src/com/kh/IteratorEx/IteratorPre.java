package com.kh.IteratorEx;

import java. util.*; //java ���� �ؿ� util���� �ȿ� ���� �������� ��
/*
 * ���� ��ġ�� ������ �� 
 * ������ ���� ��ġ���� ���� ������ ������ ����
 * * ����ؼ� ��� �������⸦ ���ش�.
 			* ��ä���� 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
*/
public class IteratorPre {
	public static void main(String[] args) {
		//100, 10, 20, 30, 50, 70
		//ArrayList<����> ���ڵ� = new ArrayList<>();
		ArrayList<Integer> ���ڵ� = new ArrayList<>(Arrays.asList(100, 10, 20, 30, 50));
		//���ڸ� �߰��ϴ� ��� 1ź
		
		//���ڵ�.add(100);
		���ڵ�.add(70);
			
		//Iterator ����
		Iterator<Integer> �ݺ��ϱ� = ���ڵ�.iterator();
		
		//while�� ����ؼ� hasNext()�� ���� ��Ұ� �ִ��� Ȯ���ϰ�
		while(�ݺ��ϱ�.hasNext()) {
			//next()�� ����ϱ�
			int �ݺ���� = �ݺ��ϱ�.next();
			System.out.println(�ݺ����);
		}
		
		
	}
}

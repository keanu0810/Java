package com.kh.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	public static void main(String[] args) {
		Queue<Integer> ť = new LinkedList<>();
		
		//offer 80 60 30 20
		ť.offer(80);
		ť.offer(60);
		ť.offer(40);
		ť.offer(20);
		//poll ������ Ȯ�� �� ����
		int �Ǿյ����� = ť.poll();
		System.out.println(�Ǿյ�����);
		
		//peek �� �� ������ Ȯ��
		int ������Ȯ�� = ť.peek();
		System.out.println(������Ȯ��);
		
		//isEmpty ����ִ��� Ȯ��
		boolean ��Ȯ�� = ť.isEmpty();
		System.out.println(��Ȯ�� );
	}
}

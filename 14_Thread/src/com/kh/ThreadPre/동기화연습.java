package com.kh.ThreadPre;

import com.kh.SynchronizdEx.SynchronizdEx;

public class ����ȭ���� {
	private static int ���� = 0;
	
	public static void main(String[] args) {
		for(int i = 0; i < 8; i++) {
			Thread t = new Thread(); {
				synchronized (SynchronizdEx.class) {
					
				}
			}
		}
	}
	
	//�������� ������ �����ؼ� ���� 8 synchronized ���� 8���� ����
	Thread thread = new Thread(				);	
}

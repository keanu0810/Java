package com.kh.RunnbleEx;




/*
Runnble
Thread ��ſ� �������� �������ų� ��� ���� �� ����ϴ�
�������̽�
*/
public class RunnableEx implements Runnable{
	
	public void run() {
		System.out.println("������ ���� ��");
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		System.out.println("������ ����");
	}

	}
}

package com.kh.ThreadPre;
					//extends Thread
public class �����忬�� extends Thread{
//�ʵ�
	int ��;
//�޼���
	//������ �ʼ��� �ʰ� ���� ����

	public �����忬��(int ��) {
		super();
		this.�� = ��;
	}
	//void run() { try catch 3 �� ��� ����
	public void run() {
		System.out.println(this.�� + "������ ����");
		try {
			Thread.sleep(3000); //3�� ���
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(this.�� + "������ ���� ��");
		
	}
}

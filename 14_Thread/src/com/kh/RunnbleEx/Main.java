package com.kh.RunnbleEx;

public class Main {
	public static void main(String[] args) {
		//�������� ���� �� �ִ� implements �� ������� ���
		//Runnable �ҷ��� �� ������ ��ü�� �־���
		RunnableEx ���ʺ� = new RunnableEx();
		//������ ����
		Thread ������ = new Thread(���ʺ�);
		
		//���������
		������.start();
	}
}

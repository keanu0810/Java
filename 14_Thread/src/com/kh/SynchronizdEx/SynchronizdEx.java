package com.kh.SynchronizdEx;

/*
 Synchronizd
 	��Ƽ ������ ȯ�濡�� �����ϴ� �����Ϳ� ����ȭ�� ����
 	���� �����尡 �ϳ��� ���ÿ� ������ �� �߻��� �� �ִ� ������ �ذ�
 	
 	Ư�� �ڵ� ������ ���ó���ؼ� �� ���� �ϳ��� �����常 ������ �� ����
 * */
public class SynchronizdEx {
	private static int ���� = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			//���ٽ�
			Thread t = new Thread(); {
				//����� ���Ͽ� �����ؼ� ���������� ī���͸� ������Ŵ
				synchronized (SynchronizdEx.class) {
					����++;
					System.out.println("���ڵ� : " + ����);
				}
			}
			t.start();
		}
	}
}
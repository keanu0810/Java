package com.kh.interfaceEx;
/*
 interface : �۷��� ���� ������ ����� �D��
 �ʵ忡 �ۼ��ϴ� ��� ������
 	public static final �� �ۼ��� ��
 	���� �տ� public static final �� ������ �ʾƵ�
 	�˾Ƽ� �ٿ��� �������
 	�޼��忡 �ۼ��ϴ� ���� �޼��� �տ�
 	public abstract �� �˾Ƽ� �پ �������
 	
 	Q : �׷��ٸ� �������̽��� �� public static final�� public abstract �� �ٴ� �̴ϱ�
 	A : �������̽��� �ڹٿ��� �ٸ� Ŭ�������� ������ �޼����� ���� �����ϴ� ������ ��
 		�������̽��� �ۼ��Ǵ� �ʵ�� �޼���� �ٸ� Ŭ�������� ������ ���� ����ϴ� ��
 		
 		���� �ִ� �ʵ� ���� ������ ������ ���� ���� �ʱ�
 * */
public interface ��� {
//�ʵ�
	//public static final) �� �ڵ����� ������ ����
	// public static final int ��Ʈ ==220; �� �Ȱ���
							int ��Ʈ=220;
							
	//�������̽��� �߻�޼��常 �ۼ��� ����
		public abstract void �����ѱ�();
	// (public abstract) �� �ڵ����� ����������
	//public abstract ��������(); �� �Ȱ���
						void ��������();
}

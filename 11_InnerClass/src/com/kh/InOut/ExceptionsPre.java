package com.kh.InOut;

public class ExceptionsPre {
	public static void main(String[] args) {
		 //0���� ������ �� �� if �ۼ��ϸ� ���� ó���ϱ�
		try {
			//���ܰ� �߻��� �� ������ �ϴ� ����!
			
		int �������� = 10 / 0;
		System.out.println(��������);
			//������� Exception ������
		} catch (ArithmeticException ����߻����ܹ߻�) {
			System.out.println("��� ������ �߻��߽��ϴ� : ");
			
	}
		
		//try ����Ű try �ۼ��� ctrl space
		
		try {
			//���ܰ� �߻��� �� ������ �õ��ϰ� �����ڵ� �ۼ�
			
			// index     0  1  2  [] �ȿ� �� �� �ִ� �ִ� ����
			int[] �迭 = {1, 2, 3};
			System.out.println(�迭[3]);
			
					
					
		} catch (Exception e) {
			System.out.println("������ ������ϴ�.");
		}

	
		
	}
}

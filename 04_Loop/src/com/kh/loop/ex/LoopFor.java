package com.kh.loop.ex;

public class LoopFor {
	/*
	 for�� : ���� ������ �ݺ��� ������ �� ����ϴ� ���
	 Ư�� ������ �����ϴ� ���� { } �ڵ� ����� �ݺ��ؼ� ����
	 �ݺ� Ƚ���� �����ϰ� ������ ��� ���� ���
	 
	 �ÿ� ����
	 for (�ʱ�� ; ���ǽ� ; ������) {
	 
	 	// ������ ���� ��� �ݺ��ؼ� ����� �ڵ� ���
	 } 	  
	 
	//for ������ ������ ���� ������ for ���� Ż���Ѵ�.
	 	 
	 	 
	 	 
	 for-each��
	 �迭�̳� �ݺ� ������ ��� ���� ���� �ݺ������� �۾��� �� ����ϴ� ���� �ݺ���
	 ������ �ݺ��� ó������ ������ ��� �ݺ�
	 
	 ��� ����
	 
	 for(�ڷ��� ��������� : �ݺ��ؼ� �����ְ��� �ϴ� ������ {
	 	// �����ϰ��� �ϴ� �۾� �ۼ�
	 	 System.out.println(������ ������ �ۼ�);
	
	 } 
	 * */
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		//int i =i;
		/*
		 for ( �ʱ� ���� ���̱� ������ i ��� �ۼ��� ���� �� ����
		 ������
		 for( ������ ������ = �������ʱ���� ; ���� ; ������)
		 �ۼ������ ��
		 for ( i ; i <= 2 ; i++ ) {
		 		System.out.println( "i�� �� : " + i );
		 * */
		for(int i = 1 ; i <= 2; i++) {
			System.out.println(i);
		}
		System.out.println("=====for�� 2��=====");
		
		for(int a = 1; a <= 3; a++) {
			System.out.println("a�� �� : " + a);
		}
		
		System.out.println("=====for�� 3��=====");
		//int ���� num =1 �� �� ��
		// num�� ���� 1���� 5���� �������� ���
		
		for(int num = 1; num <= 5; num++) {
			System.out.println("num�� �� : " + num);
		}
		
		System.out.println("=====for�� 4��=====");
		//1���� 10���� ¦���� ����غ���
		//int ���� num = 2 �� �� 
		//�����Ŀ��� num += 2 �ش��� ����غ���
		
		for(int num = 2; num <=10 ; num += 2) {
			System.out.println("num�� �� : " + num);
		}
		
		//for�� ������ 5�� ����ϱ�
		//���� ���� 5���� ǥ���ϱ�
		int dan = 5;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "�� * " + i + " = " + (dan * i));
		}
		
		// �ǽ����� 6��
		System.out.println("=====for 6��=====");
		// �����ܿ��� 3���� 9������ ����ϱ�
		// ó�� 3* 1 = 3 �������� 3 * 9 =27
		// int dandan = 3;
		// num = 1;
		int dandan = 3;
		for (int num = 3; num <= 9; num++) {
			System.out.println(dandan + "�� * " + num + " = " + (dandan * num));
		}
	}

}

package com.kh.array;
/*
 �迭 ( �ڷᱸ��)
 	���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
 	������ �迭�� index�� �̿��ؼ� ����
 	index : ���� ����(0) ����������(���������� -1);
 	
 	������ �迭�� Ȱ���ϱ� ���ؼ��� �迭�� �����ϴ� ������ ���� �̿�
 	[������ ����] - �ּҸ� �����ϴ� ����
 	
 	- �ҹ��ڷ� �����ϴ� �ڷ��� (int double ��) ������ �������� ��� ������
 		��ǥ���� ������ ���� : String
 	
 	//�迭�� ����� ���� ���
 	 ���� �迭
 	 int[] numvers = new int[5];
 	 numbers ���� ���� 5���� ���� �� �ִ� ������ ����
 	 
 	 
 */
public class ArrayEx1 {
	
	public static void main(String[] args) {
		//���� �迭 ���� ����
		int[] numbers = new int[5];
		//int 5��� �ϴ� ����
		// index : 0  1  2  3  4
		// �ʱⰪ :  0  0  0	0  0
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		
		numbers[0] = 10;
		
		System.out.println(numbers[0]);
		
		//0 ~ 4���� �ڸ��� 10 20 30 40 50
		
		numbers[1]	= 20;
		numbers[2]	= 30;
		numbers[3]	= 40;
		numbers[4]	= 50;
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//���ڸ� 7�� ���� �� �ִ� index 0 ~6 ����
		String[] str = new String[7];
		
		str[0] = "��";
		str[1] = "ȭ";
		str[2] = "��";
		str[3] = "��";
		str[4] = "��";
		str[5] = "��";
		str[6] = "��";
		System.out.println(str[0]); //��
		System.out.println(str[1]); //ȭ	
		System.out.println(str[2]);
		System.out.println(str[3]); 
		System.out.println(str[4]);
		System.out.println(str[5]);
		System.out.println(str[6]);
		//System.out.println(str[2]); //nu11
		// 2~6 �� �� �� �� ��
}

}
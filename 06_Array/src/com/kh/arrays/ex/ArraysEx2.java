package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

	//�⺻������
	public ArraysEx2() {
		//���� �迭 �����ϱ�
		int[] num = {6,4,2,3,5,7,9};
		
		// ���� �����ϱ� Arrays.sort
		Arrays.sort(num);
		
		// ���ĵ� ���� ����ϱ� Arrays.toString(    )
		System.out.println(Arrays.toString(num));
		
		// num �迭 �����ϱ� abc 	Arrays.CopyOf(num, num.length	);
		int[] abc = (Arrays.copyOf(num, num.length));
		System.out.println("num�� ����� abc : "+ Arrays.copyOf(num, num.length));
		
		// num �� abc�� ������ ���ϱ� Arrays.equals(num, abc);
		boolean same = Arrays.equals(num, abc);
		System.out.println("num�� abc�� �Ȱ����� : " + same);
		
		// int[] ä��� = new int[3];
		// Arrays.fill�� �̿��ؼ� ���� 6���� ��� ä���
		int [] ä��� = new int[3];
		Arrays.fill(ä���, 6);
	
		// ä���� ä��� ������ ���
		System.out.println("���� 6���� ��� ä���" + Arrays.toString(ä���));
	}
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
	}
}

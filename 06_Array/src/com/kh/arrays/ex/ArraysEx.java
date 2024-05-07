package com.kh.arrays.ex;

import java.util.Arrays;

/*
 Arrays
 	�迭�� ���õ� �پ��� �۾��� ���� ó���� �� �ֵ��� ������
 	����, ����, ��
�޼ҵ�
sort() : �迭�� ����
 copyOf() : �迭�� �����ؼ� �Ȱ��� �迭�� �������
 equals () : �� �迭�� �Ȱ����� ��
 fill() : �迭�� ��� ������ ������ ä���
 toSteing() " �迭�� ���ڿ��� �����ؼ� ������
 
 asList() : �迭�� ����Ʈ�� ��ȯ�ؼ� �߰� �迭�� �������� �ʰ� �迭�� ������ ���μ� ������
 
 String[] : �迭 = {"���", "�ٳ���"};
 
 List �迭�� �߰��� ��
 ArrayList<String> ����Ʈ = Arrays.as:ist(�迭);
 ArrayList<String> ����Ʈ = Arrays.as:ist{"���", "�ٳ���"};
 * */
public class ArraysEx {
	
	// ���� �޼���
	public static void main(String[] args) {
		//���� �迭�� ����
		//index  0  1  2  3  4 		length : 5
	int[] num = {5, 8, 2, 4, 3};
	
	//�����ϱ�
	Arrays.sort(num);
	
	//�迭�� ��ġ�� �ּҸ� ���
	System.out.println(num);
	
	//�迭�� ������������ �����Ѱ��� ���ڿ��� �����ؼ� ���
	System.out.println(Arrays.toString(num));
	
	
	// �迭�� ����
	// �迭�� �� ������ ���� ����
	// int �迭�̸� int �迭�� ����
		//		���� �ٿ��ֱ�	����ɺ���	������ ������ ���ΰ�		
	int[] abc = Arrays.copyOf(num, num.length);
	// num ������ abc�� �� ���簡 �ƴ��� Ȯ���ϱ�
	System.out.println("num�� ����� abc : " + Arrays.toString(abc));
	
	//�� �迭�� �Ȱ��� ������� Ȯ���ϱ�
		// num�� abc�� �Ȱ��� ������� Ȯ�θ� �ϴ� ��
	boolean same = Arrays.equals(num, abc);// ���� �������
	System.out.println("num�� abc�� �Ȱ����� : " + same);
	
	// 0~ 4�� �ڸ����� ��� �Ȱ��� ������ �����ؼ� ���
	int[] �Ȱ������ڵ� = new int[5];
	Arrays.fill(�Ȱ������ڵ�, 3);
	
	System.out.println("���� 3 ���� ��� ä��� : " + Arrays.toString(�Ȱ������ڵ�));
	} 

}












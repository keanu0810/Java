package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
StringTokenizer
Token = ���� �ּ� ���� ������ ���� ������ ������ ��ü
*/
public class StringTokenizerEx {
	public static void main(String[] args) {
		//									�Ұ�ȣ �ȿ� "" ���� �־���� ��
		//			�����ڸ� ���� ������ �⺻���� ���� �������� ����
		StringTokenizer ��ū = new StringTokenizer("�ڹٴ� ��ſ�");
		//haMoerTokns ���࿡ ��ū���� �ȿ� ���ڰ� �����̶� ����ִٸ� true
		while(��ū.hasMoreTokens());
		//nextToken: ���� ��ū�� ���°� ���� ��ū ������ �غ��� ~~
		// �⺻���� ���� �������� ����
		System.out.println(��ū.nextToken());
	
	// �����ڸ� , ���� ��ũ�������� ����
		
		StringTokenizer ��ū2�� = new StringTokenizer("������,���,����", "," );
		while(��ū2��.hasMoreTokens()) {
			System.out.println(��ū2��.nextToken());
		}
	}
}
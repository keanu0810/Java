package com.kh.practice.token.controller;

public class TokenController {
	public TokenController() {
		
	}
	//�Էµ� ���ڿ��� ù ���ڸ� �빮�ڷ� ��ȯ �� ��ȯ
	// ���� ��� "java"��� ���ڿ��� �ԷµǸ� �ڵ����� Java�� ����ǰ� �������
	//subString(ó�������ϴ��ε�����,�������ε�����)
	//subString(ó�������ϴ��ε�����) -> ���� ���ϴ� ���ں��� ����������
	//toUpperCase = ���ڸ� ��� �빮�ڷ� �����ϴ� ��
	
	public String firstCap(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(1);
	}
	/*
	public int findChar(String input , char one) {
		
	}
*/

}
package com.kh.interfaceEx;

public class ���л������ implements ����, ��� {
	
	public int ��(int a, int b) {
		return a + b;
	}
	public int ��(int a, int b) {
		return a - b;
	}	
	public int ��(int a, int b) {
		return a * b;
	}		
	public double ��(int a, int b) {
		return a / b;
	}			
	public int ������(int a, int b) {
		return a % b;
	}
	@Override
	public void �����ѱ�() {
		System.out.println("���л��� ���⸦ ŵ�ϴ�");
	}
	@Override
	public void ��������() {
		System.out.println("���л��� ���⸦ ���ϴ�");
	}
}

package com.kh.ThrowEx;
/*
 Ŭ���� �̸� ��ġ�� �ۼ��� �ѹ��� ���༭ try catch �ۼ��� ������
try - catch ���� �ۼ��ϰų� throws �� ����ؼ� ���� ó���� ����
*/
public class ThrowEx {

	public ThrowEx() {
		
	}
	public void �޼���() throws Exception {
		System.out.println("���ܰ� �߻��߽��ϴ�.");
	}
	
	public static void main(String[] args) throws Exception {
		ThrowEx ���ο쿹�� = new ThrowEx();
		���ο쿹��.�޼���();
	}
}

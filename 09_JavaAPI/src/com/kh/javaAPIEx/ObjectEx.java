package com.kh.javaAPIEx;
/*
 Object : ��� �ڹ� Ŭ������ �ֻ��� Ŭ����
 		��� Ŭ������ �⺻���� ��ӹ޴� Ŭ����
	Obegect Ŭ������ �⺻���� ����Ѵٶ�� ������ �ֱ� ������
			���� new Obgect�� ����ؼ� ������� ����
			�⺻���� ��� Ŭ������ Object�� �⺻���� �� �� �ְ� �������
	��ǥ �޼��� : equals toSting
 Ob Old  Boy
 Yb yong Boy
 
 ject : �л��ϴ� ������
 		�� ���� ��
 		�� ���� ��
 		
*/
public class ObjectEx {
	
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Object���� ���� �������� �޼��� �Դϴ�.";
	}
	public static void main(String[] args) {
		// Object�� �⺻�̱� ������ ���� new�� ����ؼ� ��������x
		// �׷��ٰ��ؼ� ���� �� ���� ���� �ƴ�
		
		//Objext ���� ���콺�� �ø��� ����� ȭ�� ���� @ ���� �ִ� �������� ������
		//Objext ���Ϸ� �̵��ؼ� �� �� ����
		Object ������Ʈ = new Object();
		
		System.out.println(������Ʈ);

	}

}

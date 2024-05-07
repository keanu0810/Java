package com.kh.javaAPI.wrapper.Ex;
/*
 wrapper = ���δ�
 �⺻������ Ÿ�� primitive types
 	�⺻ �ڷ��� Ÿ���� ��ü�� ���μ� ����� �� �ִ� Ŭ����
 	�⺻���� �������ִ� int, double char, short, long, boolean, float, byte
 	ArrayList �θ� �� ��� ������
 	Byte      = byte
 	Short     = short
 	Integer   = int
 	Long      = long
 	Float     = float
 	Double    = double
 	Character = char
 	Boolean   = boolean
 * */
public class wrapperEx {
	public static void main(String[] args) {
		//Byte
		Byte ����Ʈ�� = 10;
		//Byte ��ü�� �� ���� ��ü�� �ƴ� �⺻ byte������ ����� ��
		byte �⺻����Ʈ�� = ����Ʈ��.byteValue();
		System.out.println("����Ʈ �� : " + ����Ʈ��);
		System.out.println("�⺻����Ʈ �� : " + �⺻����Ʈ��);
		
		//Short
		Short ��Ʈ�� = 20;
		short �⺻��Ʈ�� = ��Ʈ��.byteValue();
		System.out.println("��Ʈ�� : " + ��Ʈ��);
		System.out.println("�⺻��Ʈ�� : " + �⺻��Ʈ��);
		
		//Integer
		Integer �������� = 30;
		//Integer -> int �⺻��������
		int �⺻�������� = ��������.intValue();
		System.out.println("�������� : " + ��������);
		System.out.println("�⺻�������� : " + �⺻��������);
		
		
		//Long
		Long �հ� = 40L;
		//Long -> long �⺻�հ�
		long �⺻�հ� = �հ�.longValue();
		System.out.println("�հ� : " + �հ�);
		System.out.println("�⺻�հ� : " + �⺻�հ�);
		
		//Float
		Float �÷԰� = 50.5f;
		//Float -> float �⺻ �÷԰�
		float �⺻�÷԰� = �÷԰�.floatValue();
		System.out.println("�÷԰� : " + �÷԰�);
		System.out.println("�⺻�÷԰� : " + �⺻�÷԰�);
		
		//Double
		Double ���� = 60.6;
		//Double -> double �⺻����
		double �⺻���� = ����.doubleValue();
		System.out.println("���� : " + ����);
		System.out.println("�⺻���� : " + �⺻����);
		
		Character ĳ���Ͱ� = 'A';
		//Character -> char
		char �⺻ĳ���Ͱ� = ĳ���Ͱ�.charValue();
		System.out.println("���� : " + ����);
		System.out.println("�⺻ĳ���Ͱ� : " + �⺻ĳ���Ͱ�);
		
		//Boolean
		Boolean �Ҹ��� = true;
		//Boolean -> boolean 
		boolean �⺻�Ҹ��� = �Ҹ���.booleanValue();
		System.out.println("�Ҹ��� : " + �Ҹ���);
		System.out.println("�⺻�Ҹ��� : " + �⺻�Ҹ���);
		
				
	}
}

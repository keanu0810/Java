package com.kh.operatorPre;

public class ControlSwitch {
	/*
	 switch / case
	 	if���� ��������� ������ �����ϰ� �ִ� ���� �Ǵܹ�
	 	
	 	�����
	 	switch(�Էº���) {
	 		case �Է°� :
	 			������ ����
	 			break; // case�� ���������� ���� ������ġ
	 			
	 	case �Է°�2 :
	 		������ ����
	 		break; // ���࿡ breaj�� ���ٸ� ���� case�� ������ ��
	 		
	 		
	 	...
	 	
	 	default : // �Էº����� ��ġ�ϴ� ���� ���� �� ����Ǵ� �ɼ�
	 		     // ���û����̸� �ʿ信 ���� ������ �� ����
	 	        // else �� ����� ������ ������
	 	     ������ ����
	 * */
	public static void main(String[] args) {
		int day = 3;
		String dayString;
		
		switch (day) {
			//���ǿ� �ش��ϴ� case�� �ۼ�
		case 1:
			dayString = "�Ͽ���";
		case 2:
			dayString = "������";
		case 3:
			dayString = "ȭ����";
			//break;
		case 4:
			dayString = "������";
		default:
			dayString = "�߸��� �Է�";
		}
		System.out.println("�Է��� ���ڴ�" + dayString + "�Դϴ�.");

	}

}
	
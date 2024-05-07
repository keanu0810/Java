package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {

	public static void practice8() {
		// �ֹι�ȣ�� �̿��ؼ� �������� �������� �����ؼ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� - �����ؼ� �Է����ּ��� : ");
		String idNumber = sc.next();
		// charAt 7��° �ڸ��� �ִ� ���� ������ �ͼ� �������� �������� �����ؼ� ���
		// 01234567
		// 990101-1234567
		// 990101-2345678
		// 000101-3456789
		// 000101-4567890
		// �ֹι�ȣ ���ڸ��� ù ���� ���ڸ� ������ �ɴϴ�.
		// �ֹι�ȣ�� - �����ϰ� ���ڸ� �Է��Ѵٸ� 6��° �ڸ��� �ִ� ���� ������ �;� ��
		char genderCode = idNumber.charAt(7);// - �����ؼ� 7�ڸ�
		
		// �ֹι�ȣ ���ڸ� ù ��° ���ڷ� ������ �Ǻ�
		String gender; // ���߿� �������� �������� Ȯ�����ִ� ��� �����ֱ�
		//���࿡ 1�̳� 3�� ���´ٸ� ����
		//""String'' char char�� ����ؼ� ���ڰ��� �������� ������ '' ���
		if(genderCode == '1'|| genderCode == '3') {
			gender = "����";
		} else if(genderCode == '2' || genderCode =='4') {
			gender = "����";
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
			//1. gender == "�ùٸ� �ֹι�ȣ�� �ƴմϴ�.
			//2. else���� ���������� return
			return;
		}
		System.out.println("�Է��� �ֹι�ȣ��" + gender + "�Դϴ�.");
		//���࿡ 2�̳� 4�� ���´ٸ� ����
	}
	
	public static void castingPrectice1() {
		//Ű����� ���� �ϳ��� �Է� �޾� �� ������ �����ڵ带 ����ϼ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		char inputChar = sc.next() .charAt(0);
		
		// �����ڵ� ���
		// �� ������ ��� ���ڳ� ���ڸ� ��ǻ�Ϳ��� �ϰ��ǰ� ǥ���ϱ� ���� ���
		// ���ڿ� ���ڸ� �ٿ��� ��ǻ�Ͱ� ���� �� �ֵ��� ���ִ� ���
		int unicode = inputChar; //char 2byte int 4byte
		System.out.println("�Է��� ���� " + inputChar + "�� �����ڵ��" + unicode + "�Դϴ�,");
	}
	
	public static void castingPrectice3() {
		//�־��� �ڵ忡�� ��į�� ä��� ��� ����� �������� ���� ��
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;// �⺻���� double �̳� ������ float���� �������ִ� f �ٿ���
		double dNum = 2.5;
		char ch ='A';
		System.out.println(iNum1 / iNum2); // 2 �� 2�� �������ٸ�?
		System.out.println((int)dNum); // 2 
		//double �Ǽ��� �Ǿ��ִ� ���� ������ ����
		//double 8byte int 4byte ���� ����Ȳ�� (int) �����ϰڴٴ� ǥ�ø� �ۼ� �� ������ ��
		System.out.println((double)iNum2 * dNum); // 10.0
		//���� ���� ū ���� ������ �ڵ����� ū ������ ����Ǳ� ������ (double) �ʼ��� �ƴ�
		System.out.println((double)iNum1); //10.0
		System.out.println((double)iNum1 / iNum2); //2.5 ���� -> �Ǽ���
		System.out.println(dNum); //2.5
		
		System.out.println((int) fNum); //3 �Ǽ� -> ������
		System.out.println((int) (iNum1 / fNum) ); // 3 //�����⸦ �ؼ� ���� 3
		// int�� float �� ���� ũ���� byte �������� �Ǽ����� ǥ��
		//float �Ҽ��� ���� 6�ڸ� ������ ������ �⺻����
		System.out.println((double)iNum1 / fNum); //3.3333333
		
		System.out.println((double) iNum1 / fNum); //3.333333333333335		
		System.out.println(ch); //'A'
		System.out.println((int)ch); //65
		System.out.println(ch + iNum1); //75
		System.out.println(iNum1); //'k'
		//'A' ���� (int)ch�� ���� 65
		// ū byte�� ���� byte�� ������ �ڵ����� ū byte �����
		// 65 + (int iNum1 = 10) = 75
		System.out.println( (char)(ch + iNum1) );//'K'
	
	}
	
	public static void controlPrectice1() {
		//Ű����� �Է¹ް� �Է� ���� ��ȸ ���� ���� ��ư������ �����ϱ�
		Scanner sc = new Scanner(System.in);
		
		//�޴� ����ϱ�
		System.out.println("1 �Է�");
		System.out.println("2 ����");
		System.out.println("3 ��ȸ");
		System.out.println("4 ����");
		System.out.println("7 ����");
		
		//�޴� ��ȣ �Է� �ޱ�
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menuNumber = sc.nextInt();
		
		//���õ� �޴��� ���� ���� ����
		switch(menuNumber) {
		case 1:
			System.out.println("�Է� �޴� �Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴� �Դϴ�.");
		case 3:
			System.out.println("��ȸ �޴� �Դϴ�.");
		case 4:
			System.out.println("���� �޴� �Դϴ�.");
		case 7:
			System.out.println("���� �޴� �Դϴ�.");
		default:
			System.out.println("�߸��� �޴� �̴ϴ�.");
		}
	}
	
	public static void controlPrectice10() {
		/*
		 	������ ����� �����ϼ���
		 	1.�޴����
		 	2.¦�� / Ȧ��
		 	3.�հ�/���հ�
		 	4.����
		 	5.�α���
		 	6.
		 	���� Ȯ��
		 	7. BMI
		 	8.����
		 	9.P/F
		 * */
		
		/* System.out.print���� ����� ������ �������
		 \n �� �ٲ����� ���� �ۼ��ϰ� �ʹٸ� �̿��ؼ� �ٹٲ��ؼ� ����ϰڴٴ�
		 ��ȭ ǥ�� ������ = \ ǥ��� ���
		 \n = ���η� �ٹٲ��ؼ� ���
		 \r = Ű���� �Է��ϴ� ��ġ�� ���� ���� ó������ �̵�
		 System.out.print();
		 +�� ); ������ �ʴ� �� ���� �ٲ㼭 ��� �̾ �ۼ��� �� ����
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("������ ����� �����ϼ���\r\n"
				+ "		 	1.�޴����\r\n"
				+ "		 	2.¦�� / Ȧ��\r\n"
				+ "		 	3.�հ�/���հ�\r\n"
				+ "		 	4.����\r\n"
				+ "		 	5.�α���\r\n"
				+ "		 	6.\r\n"
				+ "		 	���� Ȯ��\r\n"
				+ "		 	7. BMI\r\n"
				+ "		 	8.����\r\n"
				+ "		 	9.P/F ");
		System.out.print("������ ����� �����ϼ��� : ");
	int menuNumber = sc.nextInt();
	switch(menuNumber) {
	case 1:
	System.out.println("�޴�");
		break;
	case 2:
	System.out.println("¦��/ȫ��");
	break;
	case 3:
	System.out.println("�հ�/���հ�");
	break;
	case 4:
	System.out.println("����");
	break;
	case 5:
	System.out.println("�α���");
	break;
	case 6:
	System.out.println("����Ȯ��");
	break;
	case 7:
		System.out.println("BMI");
		break;
	case 8:
		System.out.println("����");
		break;
	case 9:
		System.out.println("P/N");
		break;
	
	default:
		System.out.println("���α׷��� �����մϴ�.");

		}
	}

	public static void controlPractice5() {
		/*���̵� ��й�ȣ ���� �� ���̵� �����ȣ�� ��ġ�ϴ��� Ȯ��*/
		 //����ڰ� ������ ���̵� ��й�ȣ
		String userID = "myid";
		String userPW = "mypassword";
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է����ּ���");
		String inputID = sc.next();
		System.out.println("��й�ȣ�� �Է����ּ���");
		String inputPW = sc.next();
		
		// �Է¹��� ���� ����� ���̵� ��й�ȣ�� ��ġ�ϴ��� Ȯ��
		if(inputID.equals(userID) && inputPW.equals(userPW)) {
			System.out.println("�α��� �Ǿ����ϴ�");
			//���̵� Ʋ�ȴ��� // ��й�ȣ�� Ʋ�ȴ��� �����ؼ� ���
			
		/*
			// ! Ư�� ������ �����ϴµ� ���
			inputID.equals(userID) : inputID�� userID�� ��ġ�ϴ��� Ȯ�� ��ġ�ϸ� ��
			!inputID.equals(userID) : inputID�� userID�� ���� ��ġ���� ����
										! �� ������ ���̵� Ʋ���� �� ���� �ȴ�.
		*/
		} else if(!inputID.equals(userID)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			
			
		} else if (!inputPW.equals(userPW))
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
	}

	public static void controlPractice6() {
			//����ڷκ��� ȸ�� ��� �Է� �ޱ�
			Scanner sc = new Scanner(System.in);
			System.out.print("������ Ȯ�ν����ְ���");
			//�����̳� ��Ģ�� ������ �� ���� ����ϴ� ������ :Role
			String userRole = sc.next();
			//���� ���
			System.out.println("�ش� ȸ�� ����� ����");
			
			switch(userRole) {
			case "������" :
				System.out.println("-ȸ������ \n"
						+ "-�Խñ� ���� \n"
						+ "-�Խñ� �ۼ� \n"
						+ "-�Խñ� ��ȸ \n"
						+ "-��� �ۼ� \n");
				break;
			case "ȸ��"	:
				System.out.println("-�Խñ� �ۼ� \n"
						+"-�Խñ� ��ȸ \n"
						+"��� �ۼ�");
			break;
			default	:
			System.out.println("�߸��� ȸ���Դϴ�.");
			
			}
		}
	
	public static void controlPractice8() {
		/*
		 Ű����� �ΰ��� ������ ���� ��ȣ�� �Է¹޾� ���� ��ȣ�� ����
		 ���� ��� ���
		 (�� ���� ���� ��� ����ϋ��� �۵��ϸ� ���� ���� ��ȣ�� �Է����� ���
		 "�߸� �Է��߽��ϴ�. "���
		  */
		Scanner sc= new Scanner(System.in);
		System.out.println("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.println("���� 2 : ");
		int num2 = sc.nextInt();
		System.out.println("�����ڸ� �Է�(+, *, *, /, %): ");
		int num3 = sc.nextInt();
		String operator = sc.next(); 
		double result;
		switch(operator) {
	case "+" :
		result = num1 - num2;
		break;
	case "-" :
		result = num1 - num2;
		break;
	case "*" :
		result = num1 - num2;
		/* / % 0���� ���� �� ���� ������ if������ ���� 0�̵� ��� ó���� ������� */
		break;
	case "/" :
		result = num1 - num2;
			System.out.println("0���� ������ �����ϴ�, ���α׷��� �����մϴ�.");
			return;
			//break;
	case "%" :
		result = num1 - num2;
		System.out.println("0���� ������ �����ϴ�, ���α׷��� �����մϴ�.");
			return;		
	default :
		System.out.println("�߸� �Է��߽��ϴ�, ���α׷��� �����մϴ�");
			return;
	
			}
		}
		
	
	
	
	public static void main(String[] args) {
		 //practice8();
		 //castingPrectice3();
		//controlPrectice1();
		//controlPrectice10();
		//controlPractice5();
		//controlPractice6();
		controlPractice8();
		 
	/* ǥ���
	 	�ڵ带 �ۼ��� �� ������ ���̿� �ڵ带 ���� ���ϰ� �ϱ� ���� ǥ���
	 	ī�����̽�
	 	�߰����ڸ� �빮�ڷ� �����ؼ� ǥ���ϴ� ���
	 	cameCase
	 	genderCode
	 	������ũ ���̽�
	 	������ ����ٰ� ����ִ� ǥ�� ����� ��ó�� ����� �ؼ� �ٿ��� �̸�
	 	snake_case
	 	one_two_three
	 	gender_code
	 	
	 	�Ľ�Į ���̽�
	 	ù���ڿ� �߰� ���ڵ��� �빮�ڷ� ����ϴ� ǥ�����
	 	PascalCase
	 	OneTwoThree
	 	GenderCode.
	 	
	 �ɹ� ǥ���
	 �߰��� ���(-)�� �����ؼ� �������� �ۼ����ִ� ǥ�� ���
	 kebab-case
	 one-two-three
	 gender-cade
	 
	 * */
	
	}

}

package com.kh.operatorPre;
// ��Ű�� : ���� ���� Ŭ������ ����ִ� ���� ��ġ

import java.util.Scanner;

//Ŭ���� : �����ϰ��� �ϴ� �ڵ带 �ۼ��ϴ� ����
public class OperatorPre {
	// �⺻ ��� �޼���
	// �������� ����ϴ� �޼��尡 �ƴ����� ��Ȳ�� ����
	// ���� �޼��忡�� ȣ���� ����� �� �ִ� �޼��� �� �ϳ�
	// static : �޸𸮿��� ���� 
	public static void practice1() {// ��� ����� ������ ���� ��������
		// ��ĳ�� �̿��ؼ� Ű����� �Է¹��� ������ ��ǻ�Ϳ� ����
		// Ststem.in Ű����� �Է� ���� �� �ְ� ���ִ� ��� �ý���
		// Scanner : Ű����� �Է¹��� ������ ��ǻ�ͷ� ���
		// �⺻���� �������ֱ�� ������ ���̺귯������ �����;��ϱ� ������
		// import�� �̿��ؼ� ������ ��
		Scanner sc = new Scanner(System.in);
		// ��ĳ�ʸ� �ҷ��� ������ �ٷ� sc �� ��ĳ�� ����� �ҷ��͵� �Ǳ� ������
		// System.out.print �� �̿��ؼ� � �ൿ�� �����ϰ� �ִ���
		// Ȯ���ϴ� �۾��� ������ ��
		// �ο� �� �Է� �ޱ�
		System.out.print("�ο� ���� �Է��ϼ��� : ");
		int people = sc.nextInt();
		// ���� ���� �Է¹ޱ�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int candies = sc.nextInt();
		
		//1�δ� ������ ���� ���� ���
		int getCnadies = candies / people;
		
		//�����ְ� ���� ���� ���� ���
		int reMain = candies % people;
		
		//��� ���
		System.out.println("���� �ο� : " + people);
		System.out.println("ĵ�� �� ���� : " + candies);
		System.out.println("�����ϰ� �������� ĵ�� ���� : " + candies);
		System.out.println("���� ĵ�� ���� : " + reMain);
		
	}
	
	/* *  �̸� : �г�(���ڸ�) ��(���ڸ�) ��ȣ(���ڸ�) ����(M/F) ����(�Ҽ��� �Ʒ� �Ѥ� �ڸ�����*/
	public static void practice2() { //Ű����� ���� �Է¹ޱ� + �� �� Ȯ��
		//Scanner Ȱ���ؼ� Ű���� �Է¹޴� â ������ֱ�
		Scanner sc = new Scanner(System.in);
		//�̸� �Է� �ޱ�
		System.out.println("�л��������α׷� : ");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		//�г� �Է� �ޱ�
		System.out.print("�г�(���ڸ�) : ");
		//�г� �Է¹ޱ�
		int grade = sc.nextInt();
		System.out.println();
		int classNum = sc.nextInt();
		// ��ȣ �Է� �ޱ�
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		// ���� �Է� �ޱ� String -> char
		// ��ĳ�ʷ� char ���� �Է¹ް��� �� ��쿡��
		//charAt �� ����ؼ� ���ڿ� ��ġ�� �о���� �۾��� �����ؾ�
		//�ý������� ���� ���
		//System - out - print()
		//Scanner - next - charAt()
		//                 ���� ������ �ϴ� ���� ��ġ
		// T      A      B      L       E  = 5����
		// ���࿡ �� �ձ��ڸ� ���� �ʹٸ�
		// charAt(0) : �� �� ���ڸ� ����
		// charAt(1) : �ι��� ���ڸ� ����
		// charAt(2) : ������ ���ڸ� ����
		// charAt(3) : �׹��� ���ڸ� ����
		// charAt(4) : �ټ����� ���ڸ� ����
		// TABLE�� ��� �� 5�����̱� ������
		// chatAt ������ 4������ �ۼ��� �� ����
		
		System.out.print("����(M/F) : ");
		//String gender = sc.next();
		char gender = sc.next().charAt(0);
		//� ���ڰ� ������ ������� �� �տ� �ִ� ���ڸ�
		//�ʿ��ϱ� ������ 0���� �ۼ�
		//���� �Է� �ޱ� (�Ҽ��� ��° �ڸ� ������ �Է¹���)
		
		// ���� �Է� �ޱ� �Ҽ��� �Ѥ� �ڸ� ������ �Է¹���
		
		
		System.out.println("����");
		double score = sc.nextDouble(); // ��ü�ڸ� �Է¹���
		//������ ���� ��� ���ڿ� ����
		//���� ������ ��� ���ڿ� ����
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println(" �� : " + classNum);
		System.out.println("��ȣ : " + num);
		System.out.println("���� : " + gender);
		//System.out.println("���� : " + score);
		//printf + ,
		//printf �� %f �� ��� �� ���� �Ҽ��� �ڸ��� �������൵ �ǰ�
		// ���������� �ʳ��� �ȴ�.
		// �ٸ� ���࿡ �Ҽ��� �ڸ� ��ġ�� �����ؼ� ����ϱ� ���Ѵٸ�
		// % . ����� ����ϴ� �Ҽ��� ��ġ�ڸ� �� f
		//���� ��� �Ҽ��� 4��° �ڸ����� ����ϱ� ���� : %.4f
		// ���� ��� �Ҽ��� 5��° �ڸ����� ����ϱ� ���� : %.5f
		
		// �Ҽ��� 2��° �ڸ����� ����ϱ� ���Ѵٸ� %. 2f
		System.out.printf("���� :  %.2f" , score); //
		/*Syetem. out. print("�ٹٲ� ���� ���η� ���")
		 			   println("�� ����� ������ �����ٿ��� �ۼ��ϱ� Enter")
		 			   printf("������ ������ ���ڿ��� ����� �� ���")
		 			   		%d ��   ��
		 			   		%f �Ҽ��� ��
		 			   		%s ���ڿ� ���
		 			   		%c���� �ϳ� ���
		 			   		%b true
		 			   		%x 16������ ����
		 			   		%o 8������ ����
		 			   		
		 */
	}

	
	/*
	 ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է¹ް�
	 �� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���
	 (���� + ���� + ���� ) 3.0
	 * */
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		//���� ���� �Է�
		System.out.println("���� ������ �Է��ϼ���");
		int korean = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int english = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int math = sc.nextInt();
		//�Է� ���� ������ �հ� ���
		//���� ���� = �������� + �������� + ��������;
		int total = korean + english + math;
		// �� ���� ������ 3 �� �ؼ� ��� ���� ����ϱ�
		// ������ ������ �Ҽ��� �̿� ������ ���´ٴ� ������ ���� ������
		// �̼�(�Ҽ����ڸ��� �ִ� ��) �� ���´ٴ� ������ ����
		double average = (double) total / 3.0;
		System.out.println("�������� : " + korean);
		System.out.println("�������� : " + english);
		System.out.println("�������� : " + math);
		System.out.println("���� + ���� + ���� : " + total);
		System.out.println("���� ���� ���� ������ : " + average);
		}
	

		
	// 2���� ���� Ű���带 �Է� �޾� �Է� ���� ���� ��� ������ 
	// true �ƴϸ� false ���
		
	public static void method4() {
		Scanner sc = new Scanner(System.in);
	//ù���� �� �Է¹ޱ�
	System.out.println("ù ���� ���� �Է��ϼ���");
	int num1 = sc.nextInt();
	System.out.println("�� ���� ���� �Է��ϼ���");
	int num2 = sc.nextInt();
	
	// == true == ���ʿ� �ִ� ���� ������ true
	// 3 == 5 false ��� ǥ��
	// 3 == 5 true ��� ǥ��
	// ! = ���ʿ� �ִ� ���� �ٸ����� �ٸ��� �¾�! true
	// ! == ���ʿ� �ִ°��� �ٸ����� �ٸ��� �¾�! true
	//true false ǥ���� �� �� ���� true false�� ǥ���ޱ� ���ؼ���
	// boolean�� ����ؼ� ǥ���� ��
	// ���� ���� ��� ���� = true or false;
	// = equal
		boolean result = num1 == num2 ;
		System.out.println("num1 �� num2�� ��� : " + result);
	/* �ǽ����� 4�� ����
	 	2���� ���� Ű����� �Է� ���� ���� ��� �ٸ���
	 								true ��� ������ false ���
	 * */
	}
	public static void practice4() {
		//��ĳ�� �̿��ؼ� num1 num2 �� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 �� ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();// ������ num1 ���� ����
		System.out.println("num2 �� ���� ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		// ��� �ٸ��� !=
		//boolean �� ����
		boolean result = num1 != num2 ; // �μ� ���� �ٸ��� ��
		System.out.println("num1 �� ��" + num1);
		System.out.println("num2 �� ��" + num2);
		System.out.println("num1 != num2 : " + result);
		System.out.println("num1 �� num2�� ��� : " + result);
	}
	//
	// 3���� ���� Ű����� �Է� �޾�
	// �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ���
	public static void practice5() {
		//��ĳ�� ����ؼ� int�� ������ 3�� �����
		Scanner sc = new Scanner(System.in);
		//int �� ������ 3�� �����
		System.out.println("num1 �� ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.println("num2 �� ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.println("num3 �� ���� �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		// ampersand && and
		// (����1) && (����2) = true
		// (true) && (true) = true
		// (true) && (false) = false
		// (false) && (true) = false
		// (false) && (false) = false
		//                        �� + ����
		//						��  true ��
		//		num1�̶� num2�� ���� �� && num2�� num3�� ���� ��
		boolean result = (num1 == num2) && (num2 == num3);
		// || vertical bar or
		// ���� 1  or  ����2
		// (true) or (false) = true
		// (false) or (true) = true
		// (true) or (false) = true
		// (false) or (false) = false
		// Enter ���� 
		// ��ȭ()ǥ�ø� shft + �����ָ� |
		boolean isOR = (num1 == num2) || (num1 == num2);
				
				
		System.out.println("num1 : " + num1 + ", num2 : " + num2 + ", num3 : ");
		System.out.println("result : " + result);
		System.out.println("isOR : " + isOR);
		
		
	} 
	// ���� �޼��� : �������� �����ϴ� �޼���
	public static void main(String[] args) {
		//�ۼ����� �޼��� �߿��� �����̳� ����ϰ��� �ϴ� �޼��� �ۼ�
		//practice1();
		//practice2();
		//practice3();
		//method4();
		//practice4();
		practice5();
		

	}

}

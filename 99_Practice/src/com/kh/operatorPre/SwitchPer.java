package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPer {

	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int day = sc.nextInt(); // Ű����� ���� ���� �Է�
		
		switch (day) {
		case 1:
			System.out.println("�������Դϴ�.");
			
		case 2 :
			System.out.println("�������Դϴ�.");
			
		default :
			System.out.println("�ƹ� ���ϵ� �ƴմϴ�.");
		}
	}
	
	/* public static void method
	  Scanner sc = new Scanner(System.in);
	  int menuNumber = sc.nextInt();
	  
	 	switch
	 		case 1 = �Ƹ޸�ī�� ���Խ��ϴ�.
	 		case 2 = ī��� ���Խ��ϴ�.
	 		case 3 = ������Ƽ ���Խ��ϴ�.
	 		default = �߸� �Է��߽��ϴ�. �ٽ� �̿����ּ���
	 * */
	
	public static void method2() {
	  Scanner sc = new Scanner(System.in);
	  	int menuNumber = sc.nextInt();
		switch (menuNumber) {
		case 1:
			System.out.println("�Ƹ޸�ī�� ���Խ��ϴ�.");
		case 2:
			System.out.println("ī��� ���Խ��ϴ�.");
		case 3:
			System.out.println("������Ƽ ���Խ��ϴ�.");
		default:
			System.out.println("�߸� �Է��߽��ϴ�, �ٽ� �̿����ּ���.");
	
		}
	}
	/* public static void method3()
	  String city = sc.nextLine();
	  switch (city) :
	  	  case "����" :
	  	  	  Systeme.out.println("���ѹα�");
	*/
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ø� �Է��ϼ��� : ");
		String city = sc.nextLine();
		switch (city) {
	  	case "����" :
	  	  	  System.out.println("���ѹα�");
	  	  	  break;
	  	case "����" :
	  	  	  System.out.println("�Ϻ�");
	  	  	  break;
	  	case "����¡" :
	  	  	  System.out.println("�߱�");
	  	  	  break;
	  	default : 
	  		System.out.println("�ش��ϴ� ���ð� �����ϴ�.");
	  		System.out.println("������ �̿����ֽñ� �ٶ��ϴ�.");
	}
}
	
	/* public static void method4()
	 	month ���� �Է¹޾Ƽ� �� ���� ���� �ܿ�
	 	
	 ����� 2
	 	case�� ��� �ٸ� ��ȣ�� ������ ����� ���� ���Ѵٸ�
	 	case�� �̾ �ۼ��Ҽ� ����
	 		case 1 : case2 : case3 :
	 			System.out.println("���̽� 1 2 3 �� ���� ���");
	 		default :
	 			System.out.println("1 2 3 �̿��� ���");
	 			
	 	break; ���ϴ� case�� ������ case�� �´� ������ ������ ��
	 		���α׷��� �����ϱ� ���� �� ���
	 		case�� ���õ� ����� �����ϱ� ���� break�� ȣ���ϸ�
	 		������ �߻���
	 		
	 */
	public static void method4() {
		Scanner sc  = new Scanner(System.in);
		System.out.print("1���� 12���� ���� �߿� �ϳ��� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 12 : case 1 : case 2 :
			System.out.println("�ܿ�");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("��");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("����");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("����");
			break;
		default :
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
	}
}
	
	//��޿� ���� ������ ����ϴ� �ڵ�
	public static void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A, B, C, D, E, F �߿� �ϳ��� ����� �Է��ϼ���.");
		//charAt �� ȣ���ؼ� �ۼ��� ���ڿ� �߿� 0��° ���ڸ� ����ϰڴٴ� �ǹ�
		char grade = sc.next().charAt(0);
		switch (grade) {
		case 'A' : case'a' :
			System.out.println("4.0");
			break;
		case 'B' : case'b' :
			System.out.println("3.0");
			break;
		case 'C' : case'c' :
			System.out.println("2.0");
			break;
		case 'D' : case'd' :
			System.out.println("1.0");
			break;
		default :
			System.out.println("�Է��� ������ �����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		//method5();

	}

}

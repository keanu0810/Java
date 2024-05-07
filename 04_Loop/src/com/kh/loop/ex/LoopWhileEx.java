package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEx {
	
	/*
	 	 while���� ����ؼ�
		 4���� ������ ���α׷��� �����ϴ� �ڵ带 �ۼ��ϱ�
		 public static void method1() {
			 Scanner sc = new Scanner(System.in);
			 1. �������� 2, �����ϱ� 3. ���ڱ� 4. ���α׷� ����
			 int menu
			 while(true) {
			 	System.out.println("~~ ���α׷� �ۼ�")
			 	System.out.println("���ϴ� ���α׷� ��ȣ�� �Է����ּ��� : ")
			 	switch(menu) {
			 		case 1:
			 		
			 		case 4 :
	 			}
	 		}
	 		
	 	}
	 
	 * */
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("=======================================");
			System.out.println("1. �����ϱ� 2. �����ϱ� 3. ���ڱ� 4. ���α׷� ����");
			System.out.print("���ϴ� ���α׷� ��ȣ�� �Է����ּ��� : "); 
			
			 int menu = sc.nextInt();
			 
			 switch(menu) {
			 	case 1:
			 		System.out.println("�����ϱ�");
			 		break;
			 	case 2:
			 		System.out.println("�����ϱ�");
			 		break;
			 	case 3:
			 		System.out.println("���ڱ�");
			 		break;
			 	case 4 :
			 		System.out.println("���α׷� ����");
			 		break;
			 	default :
			 		System.out.println("��ȣ�� �߸� �Է��߽��ϴ�,");
	 			}
	 		}
	 		
	 	}

	public static void khī��() {
		/*public static void khī��() {
		Scanner sc = new Scanner(System.in);
		System.out.println("khī�信 ���Ű� ȯ���մϴ�. ^^*" \n""
				+ "���ϴ� �޴��� �Է����ּ���. \n"
				+ "1 �Ƹ޸�ī�� 2. ī��� 3. ���� 4. ������Ƽ 5. �ֹ����");
		
		String menu = sc.next();
		
		switch (menu) {
			case "1" : case "�Ƹ޸�ī��" :
				System.out.println("�Ƹ޸�ī�� �ֹ� �߰��Ǿ����ϴ�.");
				break;
				
			case "5" : case "�ֹ����" :
				System.out.println("�Ƹ޸�ī�� �ֹ� �߰��Ǿ����ϴ�.");
				return;
			
			default :
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
				*/
		Scanner sc = new Scanner(System.in);
		System.out.println("khī�信 ���Ű� ȯ���մϴ�. ^^* \n" 
				+ "���ϴ� �޴��� �Է����ּ���. \n"
				+ "1 �Ƹ޸�ī�� 2. ī��� 3. ���� 4. ������Ƽ 5. �ֹ����");
		
		String menu = sc.next();
		
		switch (menu) {
			case "1" : case "�Ƹ޸�ī��" :
				System.out.println("�Ƹ޸�ī�� �ֹ� �߰��Ǿ����ϴ�.");
				break;
				
			case "2" : case "ī���" :
				System.out.println("ī��� �ֹ� �߰��Ǿ����ϴ�.");
				break;
				
			case "3" : case "����" :
				System.out.println("���� �ֹ� �߰��Ǿ����ϴ�.");
				break;
				
			case "4" : case "������Ƽ" :
				System.out.println("������Ƽ �ֹ� �߰��Ǿ����ϴ�.");
				break;
				
			case "5" : case "�ֹ����" :
				System.out.println("�Ƹ޸�ī�� �ֹ� �߰��Ǿ����ϴ�.");
				return;
			
			default :
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
				
		}
	}
	
	public static void getMoeny() {
		//Ŀ�ǰ� 100�� ���� �� 300��
		int coffee = 100;
		int money = 300;
		
		//���࿡ ���� 0���� ���ٸ� Ŀ�Ǹ� �����ϰ�
		//Ŀ�ǰ� �� �����Ǹ� �ǸŸ� �����Ѵ�.
		
		while(money >0) {
			System.out.println("���� �޾����� Ŀ�Ǹ� ����");
			//Ŀ�ǰ� 10���ε� 1�� �����ߴٸ� -1
			coffee--;
			System.out.println("���� Ŀ���� ����" + coffee + "�� �Դϴ�.");
			//Ŀ�ǰ� ��� �����ƴٸ� �ǸŸ� ��������
			if(coffee == 0) {
				System.out.println("Ŀ�ǰ� �� �����ƽ��ϴ�, �ǸŸ� �����մϴ�.");
				return;
			}
		}
		
	}
	
	// 1���� 5���� ���ڸ� ���
	public static void allnumber() {
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++; //num = num + 1;
		}
	}
	
	//10�� �� �� �Ѿ�� ���� �����ϴ�.~!
	//������ 10�� ������ ���� �ѱ��
	public static void tree() {
		//������ ��� ���̱� ������ ���� 0
		int hit = 0;
		
		while(hit < 10) {
			//������ ��� ������� Ȯ��
			hit++; // ���� 1�� ���� ������ hit =hit +1;
			System.out.println("������" + hit + " �� ������ϴ�.");
			//���࿡ ������ ������ ���� 10���� �Ǹ� ���� �Ѿ�ϴ� ǥ��
			if(hit == 10) {
				System.out.println("������ �Ѿ�ϴ� ~~!!!!! ����~!!!");
	
	
			}
		}
	}
	
	public static void method2() {
		

		/*
		����ڷκ��� 1���� ���� �Է¹޾� 1���� �� ���ڱ����� ���ڸ� ��� ���
		�� �Է��� ���� 1���� ũ�ų� ���ƾ� ��
		���࿡ 1 �̸��� ���ڰ� �Էµƴٸ� 1 �̻��� ���ڸ� �Էư��ּ��� ����ϱ�
		
		public static void method2(){
		int num = sc.nextInt();
		
		if (num <1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		} clse
			System.out.println("1���� "num + "�Է����ּ���");
			int abc =1;
			// while���� ����ؼ� abc ���� num���� ��� ����ϱ�
		 */		
		Scanner sc = new Scanner(System.in);
		System.out.println("0���� ū ���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		if (num < 1) {
		System.out.println("1�̻��� ���ڸ� �Է����ּ���");
	} else {
		System.out.println("1����" +num + "�Է����ּ���");
		int abc = 1;
		while(abc <= num) {
			System.out.println(abc);
			abc++; //abc = abc+1;
			
			}
	
		}
		
	}
		//Ŀ�ǰ� 100�� ���� ������ Ŀ�Ǹ� �������� ���ϴ� ���
	public static void getcoffee() {
		Scanner sc = new Scanner(System.in);

		
		
		
		System.out.println("ī�信 ���Ű� ȯ���մϴ�.");
		System.out.println("���� ���� ���� �Է����ּ���");
		//Ŀ�ǰ��� coffeePrice
		int coffeePrice = 100;
		//���� ������ �ִ� �ݾ� �Է�
		int money = sc.nextInt();
		
		//���࿡ ������ �ִ� ���� ���ǰ� ���� ����
		while(money < coffeePrice) {
			/*
			 ���� �����մϴ�, Ŀ�Ǹ� �����ϱ� ���� �� ���� ���� �־��ּ���.
			 ���� ���� ���� �Է����ּ���.
			 ���� ���� �� �Է�
			 nextInt();
			 * */
			System.out.println(" ���� �����մϴ�. \n"
					+ "Ŀ�Ǹ� �����ϱ� ���� �� ���� ���� �־��ּ���.");
			System.out.println("���� ���� ���� �Է����ּ���.");
			money = sc.nextInt();
			
			//Ŀ�Ǹ� �����ߴٸ� �����߽��ϴ�, �Ž����� �Է��ϱ�
			System.out.println("Ŀ�Ǹ� �����߽��ϴ�, �Ž�������"
					+ (money + coffeePrice) + "�Դϴ�.");
		}
		
		
	}

	// 10000�� �̻� ���� ���� ��� �������� ��Ű�� ���ϴ� ����
	public static void iLovePork() {
		//1. Scanner�� �̿��ؼ� ���� �����ϰ� �ִ� �ݾ� �Է��ϱ�
		//�����ϰ� �ִ� �ݾ��� tangsuyuk ���� ������ �ܾ��� �����մϴ�.
		//�ٽ� �Ա����ּ���.
		// nextInt �ٽ� �Ա��� �ݾ��� �Է�
		//���� 10000�� �̻��̸� �ֹ��� �Ϸ�Ǿ����ϴ�.
		// ���� �ܾ��� 00 �Դϴ�.
		System.out.println("�ȳ��ϼ��� ���������Դϴ�.");
		Scanner sc = new Scanner(System.in);
		int tangsuyuk = 10000;
		System.out.println("���� ������ �ִ� ���� �Է��ϼ���.");
		int mymoney = sc.nextInt();
		
		while(mymoney < tangsuyuk) {	
			System.out.println(" �ܾ��� �����մϴ�. \n"
					+ "�������� �����ϱ� ���� �� ���� ���� �־��ּ���.");
			mymoney = sc.nextInt();}
			System.out.println("���� ���� ���� �Է����ּ���.");
		
			System.out.println("�������� �����߽��ϴ�, �Ž�������"
					+ (mymoney - tangsuyuk) + "�Դϴ�.");
			
			
		}

	
	public static void main(String[] args) {
		//method1();
		//khī��();
		//getMoeny();
		//allnumber();
		//tree();
		//method2();
		//getcoffee();
		iLovePork();
	}

}

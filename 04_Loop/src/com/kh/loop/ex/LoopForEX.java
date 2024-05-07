package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEX {
	//�⺻ �޼���
	
	// LoopForEX ���� ����ϱ� ���Ѵٸ�
	// public static void guguDan ���� static�� �߰����� ������
	// public static void main(String[] args {
	// guguDan();
	// }
	// static �� ������ �ʰ� ����ϱ� ���Ѵٸ�
	// ��¿� Ŭ������ ���� ����ϱ� LoopForRun
	// ���Ḧ �ϱ� ������ �ݺ��ؼ� ���
	public void guguDan() {
		//����ڷκ��� ���ڸ� �Է¹ް� ���ڿ� �ش��ϴ� �������� �����ϱ�
		Scanner sc =  new Scanner(System.in);
		System.out.println("������ ���·� ���� ���� ȯ���մϴ�.");
		
		// �������� 0�� �Է��ϱ� ������ �ݺ��ؼ� ����ϱ�
		// �ݺ��ϱ� ���ؼ� while�� ���
		while(true) {
			System.out.println("���Ḧ ���ϸ� 0 �Է��� �ּ���");
			System.out.println("���ϴ� ���� �Է��� �ּ���");
			int dan = sc.nextInt();
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + "�� *" + i + " = " + (dan*i));
			}
			// ���࿡ ���� 0�� ������ ���α׷� �����ϱ�
			if (dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			//���� ���� for �� �̿��ؼ� ���
		}
	}

	//������ �Է� �޾� �Ųٷ� ����ϱ�
	public void guguDan2() {
		// 1. ��ĳ�ʷ� ������ �� �Է¹ޱ�
		// 2. int dan = sc.intInt();
		// 3. for ���� Ȱ���ؼ� 9������ 1������ ����ϱ�
		//	for (int a = 1; ���� ; a--) {
		//	System.out.println(�Ųٷ� ����ϱ�);
		// }
		
		// 4 ���Ḧ ���Ұ�� 0�� �Է����ָ� �����ϱ� while�� �߰��ϱ�. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ųٷ� ���·� ���� ���� ȯ���մϴ�.");
		while(true) {
			System.out.println("���ϴ� ���� �Է��� �ּ���");
			System.out.println("���Ḧ ���ϸ� 0 �Է��� �ּ���");
			int dan = sc.nextInt();
			if (dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break; // for while switch ��� if �ܵ�x
			}
			// contiue ���� ������ ����
			// if 1 ~ 9������ �Է� �����ϵ��� ����
			if(dan < 1 || dan >9) {
				System.out.println("1���� 9������ ���ڸ� �Է����ּ���.");
			   	continue;
			}
			for (int a = 9;  a >= 1; a--) {
				System.out.println(dan + " * " + a + " = " + (dan * a));

			}
		}	
}
	
	public void practice1() {
		//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڸ� ��� ����ϼ���
		// ��, �Է��� ���� 1 ���� ũ�ų� ���ƾ� �մϴ�.
		//���� 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���" �� ����ϼ���
		
	}
	
	//�������� 1�ܺ��� 9�ܱ��� ��� ���
	public void guguDan3() {
		// int dan = ���ϴ� �ܸ� �����ؼ� ���
		
		//1�� ���� 9�ܱ��� ���
		for (int dan = 1; dan <= 9; dan++) {
			System.out.println("***** "+dan+ "*****");
			//1�ܿ��� ���� 1~9 �� ������ ���� ���
			for(int num = 1;num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + (dan*num));
		}
			
			
		}
	}
	
	//2�� ���� 9�ܱ��� ���
	public void guguDan4() {
		for (int �� = 2; �� <= 9; ��++) {
			System.out.println("***** "+��+ "*****");
			for(int ���� = 2;����<= 9; ����++) {
				System.out.println(�� + "*" + ���� + "=" + (��*����));
		}
			
			
		}
	}
	
	public void randomNumber() {
		//Random �ҷ��� ���� ������ �������� ���ڸ� �������� ����ϱ�
		Random ���� = new Random(); //�ζ� ��ȣ ����
		//nextInt() �ȿ� ���ڸ� �־ ��𼭺��� ������ ���� �������� ���ڰ� ���;� �ϴ���
		// ������ �����Ҽ� ����
		int �������� = ����.nextInt(5);// 0~4���̿� ���ڰ� ����
		// ���ڸ� �� �� �ڵ� �ȿ����� -1~ ���� ��� 0 ���� ����
		// �������� ������ ���� -1
		System.out.println("�������� : " + ��������);
	}
	
	// �������� ���� 3�� ����ϱ� 1 ~ 10 ������ ����
	public void randomfor() {
		//Random ȣ���ϱ�
		Random ran = new Random();
		
		// �������� 3�� ��� 1 ~ 10 ������ ����
		
		for(int num = 1; num <=3; num++) {
			//�������� ���ڸ� ������ֱ�
			//								10�� �����ָ� 0~9
			//								10+ 1		1~10
			int randomNumber = ran.nextInt(10) +1;
			System.out.println("�������� " + num + ":" +randomNumber);
		}
	}
	
	public void randomfor2() {
		
		// �������� 1 ~ 45 ��ȣ 6�ڸ� for �� ���
		Random ran = new Random();
		//���ڰ� 6�ڸ��� ��µ� �� �ֵ��� for���� 6�������� ���
		for(int num = 1; num <=6; num++) {
			int lottoNumber = ran.nextInt(45) +1;
			//if ���� ���ڰ� ���ٸ� ��ȣ�� �����ϰ� ����ϱ�
			System.out.println("�ζǹ�ȣ" + num + ": " +lottoNumber);
		}
		}
	// 1���� 10������ ���� �߿��� Ȧ���� ����ϱ�
	//Ȧ�� = odd
	public void OddNum() {
		for (int num = 1; num <= 10; num++) {
			//���࿡ ���ڰ� Ȧ����� ����ϱ�
			if (num % 2 != 0 ) {
				System.out.println(num);
			}
		}
	}
	
	//¦���� 1 ~ 10 ����ϱ�
	public void evenNum() {
		for (int even = 1; even <= 10; even++) {
			//���࿡ ���ڰ� ¦����� ����ϱ�
			if (even % 2 != 1 ) {
				System.out.println(even);
			}
		}
	}
	
	//���簢�� ����� �� ���
	public void squarseStar() {
		int star = 3;
		for (int i = 0; i < star; i++) { //������� 0 1 2
			
			for (int j = 0; j < star; j++) {
				System.out.println("* ");
			}
			
			System.out.println(); //���η� ���� ����� ���� �ٹٲ�
		}
		
	}

	//���簢�� ����� �� ��� ���η� 5���� ���
	public void fiveStar() {
		int star = 5;
		//for (int = 0; i < 	5; i++)
		for (int i = 0; 1 < star; i++) {
			for(int j = 0; j < star; j++) {
				System.out.println("* ");
			}
		}
	}

	public void numberGame() {
		//���� ���߱� ����
		Scanner sc = new Scanner(System.in);
		
		//�������� ���� �����
		Random random = new Random();
		int randomNumber = random.nextInt(3) + 1; //1 ~ 3
		System.out.println("���ڸ� ���� ������ : ");
				
		int guest = sc.nextInt(); //�Խ�Ʈ�� �Է��� ���� ��������
		//���࿡ ���ڸ� ����ٸ� ���ڸ� ������ϴ�.
		if(guest == randomNumber) {
			System.out.println("�����մϴ�. !! ���ڸ� ������ϴ�.");
		} else {
			System.out.println("���ڸ� Ʋ�Ƚ��ϴ�.");
			System.out.println("������ : " + randomNumber + "�Դϴ�.");
			
		}
	}

	// ���ڸ� ���� ������ ��� ������ Ǯ���� �ϱ� while(true)
	// for ��ȸ 2�� �ֱ�
	// if �� �����ؼ� ���ڰ��� ���亸�� ������ ���ڰ� �۽��ϴ�.
	// hint ���ڰ��� ���亸�� ������ ���ڰ� �ʹ� Ů�ϴ�.
	
	//���ڸ� ���� ������ ��� ������ Ǯ���� �ϱ� while(true)   
		//for ��ȸ 2�� �ֱ�
		// if �� �����ؼ� ���ڰ��� ���亸�� ������ ���ڰ� �۽��ϴ�. 
		// hint ���ڰ��� ���亸�� ������ ���ڰ� �ʹ� Ů�ϴ�.
	
		public void numberGame2() {
			// �������� ������� ���ڰ� �������� Ű����� ���ߴ� ����
			Scanner sc = new Scanner(System.in);
			
			//�������� ���� �����
			Random random = new Random();
			while(true) {
				int randomNumber = random.nextInt(3) + 1; //1 ~ 3
				System.out.println("���ڸ� ���纸����!!!! ");
				//for �� �ȿ� ������ �� ������ ����� ���ΰ�? ������ 2���� ����ϰڴ�.
				for(int attack = 1; attack <= 2; attack++) {
					System.out.print("������ " + attack + " ȸ �õ��մϴ� (��������) :");
					int guest = sc.nextInt(); //�Խ�Ʈ�� �Է��� ���� ��������
				
					//���࿡ ���ڸ� ����ٸ� ���ڸ� ������ϴ�. if else if
					if(guest == randomNumber) {
						System.out.println("�����մϴ�.!! ���ڸ� ������ϴ�.!");
						break;
					//Ʋ���� �� ���亸�� ���ڸ� �۰� �ۼ��ߴ��� ���ڸ� ���亸�� ���� �ۼ��ߴ��� ��Ʈ�� �� �� ����
					} else if (guest < randomNumber) {
						System.out.println("���亸�� �Է��� ���ڰ� �۽��ϴ�."); //
						//System.out.println("������ " + randomNumber + "�Դϴ�.");
					} else if (guest > randomNumber) {
						System.out.println("���亸�� �Է��� ���ڰ� Ů�ϴ�.");
					}
				}
			}
		}
	}
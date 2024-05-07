package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
		
	public void Greeting() {
		System.out.println("�ȳ��ϼ���.");
		// Greeting : �ȳ��ϼ���. �λ縦 ����ϴ� �ż���
	}
	
	public void  Greeting2() {
		System.out.println("�ݰ����ϴ�.");
		// Greeting : �ް����ϴ�, �λ縦 ����ϴ� �ż���
	}
	
	public void practice1() {
		//����ڷκ��� �� ���� ���� �Է¹پ� 1 ���� �� ���ڱ����� ���ڵ��� ��� ���
		//��, �Է��� ���� 1���� ũ�ų� ���ƾ��ϰ� ���� 1 �̸��� ���ڸ� �Է��ߴٸ�
		// 1 �̻��� ���ڸ� �Է����ּ��� ����ϱ�
		Scanner sc =new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		// �Է¹��� ���ڰ� 1 �̸��� ��� ������ֱ�
		if(num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			return;
		}
		
		//�Է¹��� ���ڰ� 1 �̻��̸� 1���� �Է¹��� ���ڱ��� ��� ����ϱ�
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			//System.out.println(i + "<==" + num);
		}
		//�������� �ٹٲ��� ���ֱ� ���Ѵٸ�
		System.out.println();// �ٹٲ� �ϼ�
	}
	
	public void practice2() {
		//1�̸��� ���ڰ� �Էµƴٸ�
		//1�̻��� ���ڸ� �Է����ּ��䰡 ��µǸ鼭
		// �ٽ� ����ڰ� �Է��ϵ����ϱ�
		//�Է¹ޱ� ���ؼ��� ��ĳ�ʸ� ���ؼ� �Է¹ޱ�
		Scanner sc= new Scanner(System.in);
		int num;
		while(true) {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num = sc.nextInt();
		
		
		if ( num < 1) {
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		} else {
			break;
		}
	}
		//1���� ~ ������ ���ڵ��� ���Դ��� ����� ����ʹٸ�
		System.out.println("1���� " +num + "������ ���ڵ�");
		int i = 1;
		while( i <= num) {
			System.out.println(i + "1");
			++i;
		}
		System.out.println();
		}

	public void practice3() {
		//����ڷκ��� �� ���� ���� �Է¹޾�
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("****practice 3 ���� ****");
		while(true) {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ���");
			num = sc.nextInt();
			
		if (num < 1) {
				System.out.println("1 �̻��� ���ڸ� �ٽ� �Է����ּ���");
		} else {
			
			System.out.println(num + " ���� 1������ ���ڵ��� �����մϴ�.");
			break;
		}
		//1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϱ�
		while(num > -1) {
			System.out.println(num + " ");
			num --; // Ű����� �Է¹��� ���ڿ��� -1�� �ϸ鼭 1�� �� �� ���� ���
		}
			//System.out.println();
		}
		//�� �Է��� ���� 1���� ũ�ų� ���ƾ� ��
	}
	
	public void practice4() {
		//1 �̸��� ���ڰ� �ԷµǸ� 1�̻��� ���ڸ� �Է����ּ��� ��µǸ鼭
		// ����ڰ� ���� �Է��ϵ��� �ϱ�
		//���ڸ� �Է¹��� ���ں��� 1������ ���ϱ�
		Scanner sc= new Scanner(System.in);
		// �λ���
		int num; // pratice4 �ȿ��� ��𿡼��� num�� �� �� �ֵ��� �ٱ����� ȣ������
		// do - while
		// do - while : ������ ���� �ƴϾ ������ �ַ� 1ȸ�� ����
		
		do {
			System.out.println("���ڸ� �Է����ּ���");
			num = sc.nextInt();
			//1 �̸��� ���ڰ� ������ !
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			// ���ǿ� ������� do�� ���� ������ 1ȸ ����Ǵ� ���̱� ������ return�̳� bkeak��
			// �ۼ������� �ʾƵ� �� ��찡 ����
			}
		}while(num >1);
		
		//���࿡ 1���� Ŀ�� ������ �����´ٸ�
		//num ���� 1���� �Ųٷ� ������ִ� for�� �ۼ����ֱ�
		for(int i = num; 1 >= 1; i--) {
			System.out.println(i + " ");
		}
		
	}
	
	public void practice5() {
		//1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϱ�
		//es. ������ �ϳ� �Է��ϼ��� : 8
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 =36 
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		//�Է� ���� ���� �� ���� �� �ٱ���\
		int result = 0;
		
		//���ڰ� ������ �� 1���� �Է¹��� ���ڱ��� ���ؼ� ���� ���ϱ�
		for(int i = 1; i <= num; i++) {
			result += i;
		
		System.out.println(result);
		
		// �������� ���� ����ϱ�
		if(i <num) {
			System.out.println(i + "+");
		} else { // i > num
			System.out.println(i + "=");
		}
	}
		System.out.println(result);
}
	
	public void practice7() {
		/*
		 ����ڷκ��� �ΰ��� ���� �Է� �޾� �� ������ ���� ����ϱ�
		 ���� 1 �̸��� ���ڰ� �Էµƴٸ� 1 �̻��� ���ڸ� �Է����ּ��� ����ϱ�
		 �ٽ� ����ڰ� ���� �Է��ؼ� ����ϱ�
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ù���� ���� : ");
			int firstNum = sc.nextInt();
			
			System.out.println("�ι��� ���� : ");
			int secondNum = sc.nextInt();
			
			//���࿡ ù���� ���ڿ� �ι��� ���� ��� 1 ���� ũ�ų� ���� ���
			if(firstNum >= 1 && secondNum >= 1) {
				// �� ���� ���ؼ�
				// �ּҰ� �ִ밪 ���ϱ�
				int �ּҰ� = Math.min(firstNum, secondNum);
				//Math(���� ���Ͽ���) ���� ���� ���� ã�� min�� Ȱ���ؼ�
				//�˾Ƽ� ���ϰ� ���� ���� ���ϰ� �ϱ�
				//(   ,   )��ȣ �ȿ� ���ڸ� ���� �� ���� ������ ��� ����
				// Math���� random �� �ִ���?!
				//Random ����		Math.random ����
				// Math�� �ִ� random���� Random�� �ִ� ���� ����� ��
				//������ �� �� ����ϴµ� ū ���̴� ����
				
				int �ִ밪 =Math.max(firstNum, secondNum);
				
				for(int i = �ּҰ�; i <= �ִ밪; i++) {
					System.out.println(i + " ");
			}
				
				break;
			} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}

		}
		
		
		
		
	}
		
	
	public void practice12() {

		Scanner sc = new Scanner(System.in);
		//�� ������ �����ȣ�� ���޾Ƽ� ����ϴ� �޼ҵ�
		//������ ��� + / * - %
		String operator; // char operator charAt
		
		while(true) {
			System.out.println("���α׷� ���Ḧ ���� ��� exit �Է��� ��");
			System.out.print("�����Է�(+ - * / %) : ");
			
			operator = sc.next();
			
			//���࿡ exit�� �Է��ؼ� ���α׷� ���Ḧ ���� ���
			//���ڿ� (String)���� �񱳸� �� ��� equals ==
			if(operator.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			//���� 1�� ����2�� �Է� �޾Ƽ� ����ϱ�
			System.out.println("���� : ");
			int ����1 = sc.nextInt();
			System.out.println("����2 "
					+ ": ");
			int ����2 = sc.nextInt();
			
			//����1�� ����2 ��꿡 ��� ��� (=result)
			int ���;
			
			//switch case "+"
			if (operator.equals("+")) {
				��� = ����1 + ����2;
			} else if (operator.equals("-")) {
				��� = ����1 - ����2;
			} else if (operator.equals("*")) {
				��� = ����1 * ����2;
			} else if (operator.equals("/")) {
				if(����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				��� = ����1 / ����2;
			} else if (operator.equals("%")) {
				//������ ��� 0���� ���� �� ���� ������ ����2�� 0�� �ɼ� ����
				if(����2 == 0)
				System.out.println("0���� ������ �����ϴ�");
			
			��� = ����1 % ����2;
		} else {
			System.out.println("�߸��Է��߽��ϴ�");
			continue;
		}
		System.out.println(����1 + " " + operator + " " + ����2 + "=" + ���);
		
		}
	}

	/*
	 13�� 14�� ���� ���� for�� ����
	 * */
	public void practice13() {
		//Ű����� ���ڸ� �Է¹ް� ����⸦ �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//�Է¹��� ����ŭ ������ ��� ex) ���η� 2 � ĭ 
		for(int ������ = 1; ������ <= num; ������++) {
			//���پ� ���� ������ְ� ����
			// ����-�ϳ�   ����-��	����-�� num�� = num
			for(int �� = 1;�� <= ������; ��++) {
				System.out.println("*");
			}
			//�ٹٲ��� ���� enter�� ������ ���η� ��� ���
			System.out.println();
}
	}
	
	/*���� �Է��� �ؼ�
	ù��° �ַ��� ���� ���� ���� ���
	ex.
		���� �Է� 4
		****
		***
		**
		*
	*/
	public void practice14() {
		//Ű���� �Է¹��� ����
	Scanner sc = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	int num = sc.nextInt();
	
	for(int line = num; line >= 1 ;   line--){//; �� for�� �ȿ��� 2���� ��밡��
 		for(int star = num; star <= line; star++) {
 		System.out.println("*");
 		}
 		System.out.println();
 		}
	
	}
	
	/*���� ���� 
	 	for(int line = num; ���ǽ� ; ������;){
	 		for(int star = 1; line <= star; star++) {
	 		System.out.println(*);
	 		}
	 		System.out.println();
	 		}
	 */
	/*
	 ****
	  ***
	   **
	   	*
	 * */
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int size = sc.nextInt();
		// line�� ���η� �� ���� ��ȣ�� ��Ÿ��
		for(int line = 0; line < size; line++) {
			//blank ������ ����ϱ� ���� for��
			// line ���� �ٿ����� line���� ������ ����ϰڴ�
			System.out.println("===line " + line+ "===");
			
		 for(int blank = 0; blank < line; blank++) {
			 System.out.print("   ");
		 	}
		 	// start ���� ����ϱ� ���� for��
		 	//line ���� �ٿ����� size - line ���� ���� ���
		 	// ù��° �� size
		 	// �ι�° �� size - line
			 for(int star = size; star < line; star--) {
				 System.out.print("* ");
			 }
			 System.out.println();
		}
	}
	
}
	
		





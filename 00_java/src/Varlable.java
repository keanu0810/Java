
public class Varlable {

	public static void main(String[] args) {
		//  1.���� 2.���� 3.���ڿ� 4.�Ǽ� 5.����
		//1. ���� byte short int iong
		// byte = 1byte
		byte ����Ʈ = 1;
		System.out.println(����Ʈ);
		System.out.println("����Ʈ");
		// ������ ������ �� Ű���忡 ctel + S �� �����ָ� �����
		byte bt = 2;
		System.out.println(bt);

		short ��Ʈ = 3;
		System.out.println(��Ʈ);
		
		int ��Ʈ =1;
		System.out.println(��Ʈ);
		
		// byte �ڷ��� ���� �����̸� bte bte �ȿ� ���� 2 �ְ� ����ϱ�
			byte bte = 2;
			System.out.println(bte);
		// shrt �ڷ��� ���� �����̸� shrt shrt �ȿ� ���� 2 �ְ� ����ϱ�
			short shrt = 2;
			System.out.println(shrt);
		// int �ڷ��� ���� �����̸� int int �ȿ� ���� 2 �ְ� ����ϱ�
			int nt = 2;
			System.out.println(nt);
		// iong �ڷ��� ���� �����̸� iong iong �ȿ� ���� 2 �ְ� ����ϱ�
		   long lng = 2;
		   System.out.println(lng);
		   
	    // 2. ����
		   // ���ڿ��� char�� String�� ����
		   		// ���ڸ� ��Ÿ���� char�� '' ���� ����ǥ�� ����ؼ� ǥ��
		   		// "" ū ����ǥ�� String ���ڿ��� ��Ÿ���� ǥ��
		   
		    	char myChar = 'A';
		    	System.out.println(myChar);
		    	
		    	// char ���� �ϳ��� ���ڸ� ���� �� �ֱ� ������
		    	// A�� B �� �� �ϳ��� �ۼ� ����
		    	/*
		    	 * char myChar3 = 'AB';
		    	 * char myChar4 = 'ABC';
		    	 * char myChar5 = '������';
		    	 * ��� ���ڰ� �ϳ��� �ƴϱ� ������ ����� �� ����
		    	 * */

		    	//String
		    	String str1 = "�� ���� ���ڴ�~~";
		        System.out.println(str1);
		    	// String �� ����ؼ� ������ �̸� ����ϱ�
		    	//String name = "������ �̸�";
		    	//Ststem.out.println(name);
		    	
		    	String name = "���뼺";
		    	System.out.print("����� �̸��� ");
		    	System.out.println(name + "�Դϴ�");
		    	
		    	//���࿡ ���� ���ڳ� ������ ���ٷ� ����ϰ� �ʹٸ�
		    	// + �� ����ؼ� �̾ ����� �� ����
		    	System.out.println("����� �̸���"+name+"�Դϴ�");
		    	
		    	// ���ϴ� �� ����� �̸��� ������ �Դϴ�.
		    	System.out.println("����� �̸���"+ name +"�Դϴ�.");
		    	System.out.println("����� �̸��� "+name+" �Դϴ�.");
		    	System.out.println("�� �� �� �� �� �� "+name+ " �� �� ��.");
		    	// ���⸦ �ְ� ���� ��� "" ū ����ǥ ���ο� ���⸦ �־�� ��
		    	
		    	//���� + ���� + ���ڿ� ����ϱ�
		    	/*
		    	 * �ȳ��ϼ���. ���¿�. ���￡ ��� ������ �Դϴ�.
		    	 * �� ��ȭ��ȣ�� 111-2222-3333 �Դϴ�.
		    	 * �� �ֹι�ȣ�� ����Դϴ�.
		    	 * �� �������� A�� �Դϴ�.
		    	 * */
		    	String greeting = "�ȳ��ϼ���";
		    	String introduction = "���¿�. ���￡ ��� �������Դϵ�.";
		    	String number = "111-2222-3333";
		    	char dash = '_';
		    	String secret = "���";
		    	String bloodType = "A��";
		    	
		    	System.out.print(greeting);//�ȳ��ϼ���
		    	System.out.println(introduction);
		    	System.out.print("�� ��ȭ��ȣ�� ");
		    	System.out.print(number);
		    	System.out.println(" �Դϴ�.");
		    	System.out.println("�� �ֹι�ȣ�� "+secret+" �Դϴ�.");
		    	// �� �������� A�� �Դϴ�.
		    	System.out.println("�� �������� "+bloodType+" �Դϴ�.");
		    	
		    	// 4.�Ǽ�
		    	// �Ǽ��� float �� double �� ����
		    	// �Ǽ��� �⺻���� double �������� �Ǿ�����
		    	// filat = 4byte double = 8byte
		    	// float�� �Ǽ��� ��� ���ؼ��� f�� �ٿ���� ��
		    	// �Ǽ� �ڿ� f�� ���� �� �� �ҹ��� ���� ���� ��� ����
		    	float ff1 = 3.14f;
		    	float ff2 = 3.14F;
		    	System.out.println("ff1 �� : "+ ff1 +" �̴�.");
		    	System.out.println("ff2 �� : "+ ff2 + " �̴�.");
		    	//double�� ũ�Ⱑ float ���� ũ�� ���ʿ� double�� ������ �߱� ������
		    	// �ڿ� �ٸ� ������ ������ �ʾƵ� ����� �� �ִ�
		    	double dd1 = 3.14;
		    	System.out.println("double dd1 : "+ dd1);
		    	
		    	//5.����
		    	//boolean�� ����ؼ� true���� false���� ǥ���� �� ����
		    	// ���߿� �˰����̳� if for while ���� ����� �� ���� ���
		    	boolean isTrue = true;
		    	boolean isFalse = false;
		    	System.out.println("���� ������ "+isTrue);
		    	System.out.println("���� ������ "+isFalse + "?");
		    	
		    	// ���� ���� ���ڿ� �Ǽ� ����
		    	int num = 10;
		    	System.out.println("���� num�� �� "+ num);
		    	
		    	char ch = 'Z';
		    	System.out.println("���� ch �� �� = " + ch);
		    	String text = "Hello, World!";
		    	System.out.println("���ڿ��� text = " + text);
		    	
		    	double db1 = 3.14;
		    	System.out.println(db1);
		    	
		    	boolean isTrue2 = true;
		    	System.out.println("isTrue2 = " + isTrue2);
		    	
		    	System.out.println("num = " + num);
		    	
		    	// num ���ٰ� 10 ��� 20�� �ְ� �ʹٸ�?
		    	int ���� = 10;
		    	System.out.println("���� num�� �� = "+ ����);
		    	//�������� ó�� 1ȸ�� ����� ��
		    	// ������ �ٸ� ���ڳ� ���� ���� ����
		    	// �������� �����Ѵ�
		    	���� = 20;
		    	System.out.println("20���� ������ ������ �� : " +����);
		    	
		    	/*
		    	 * ö���� 19���̾���.
		    	 * �׷��� 24���� �Ǹ鼭 20���� �Ǿ���.
		    	 * */
		    	String name1 = "ö��";
		    	String age = "19";
		    	System.out.println(name1 + "�� "+ age + "���̾���.");
		    	age = "20"; // age ���� 20���� ����
		    	System.out.println("�׷��� 24���� �Ǹ鼭 " + age + "���� �Ǿ���.");
		    	
		    	
		    	
	}
}

package com.kh.javaAPIEx;

public class StringPre {
	public static void main(String[] args) {
		// substring �޼��带 ����ؼ� Today ����
		String ����1 = "Today os a beautiful day.";
		String ����1 = ����1.substring(0,5);
		System.out.println(����1);
		
		// toUpperCase �޼��带 ����ؼ� ��� �빮�ڷ� ��ȯ
		String ����2 = "Programming is fun and challennging";//���α׷����� ����� �������̴�
		String �빮�� = ����2.toUpperCase();
		System.out.println("�빮�� �³���? " + �빮��);
		
		// toLowerCase �޼��带 ����ؼ� ��� �ҹ��ڷ� ��ȯ
		String ����3 = "Learning new things is exciting";//���ο� ���� ���� ���� ��̷ο� ���̴�.
		String �ҹ��� = ����3.toLowerCase();
		System.out.println("�ҹ��� �³���? " + �ҹ���);
		
		// split Ȱ���ؼ� ���ڿ� " " �� �����ϱ�
		String ����4 = "A good medicine tastes bitter";// ���� ���� ����.
		String[] ����4 = ����4.split(" ");
		for(String a : ����4) {
			System.out.println(a);
		}
		
		// replace Ȱ���ؼ� more �� less �� ��ü
		String ����5 = "The more, the better"; // �� ������ �������� ����
		String ���� = ����5.replace("more", "less");
		System.out.println(����);
		
		// charAt ����ؼ� 6���� ���ڸ� ��������
		String ����6 = "Walls have ears";// ������ �Ͱ� �ִ�.
		char ch = ����6.charAt(6);
		System.out.println(ch);
		
		//substring �޼��带 ����ؼ� his���� ������ ����
		String ����7 = "Evary dog has his day";// ������ �����Ե� ���� �����ִ�.
		String ����7 = ����7.substring(14);
		System.out.println(����7);
		
		
		
	}
}

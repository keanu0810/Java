package com.kh.arrayList.pre;

public class BookArray {
	// main ��¸޼���
	public static void main(String[] args) {
		//��ü
		Book[] å�� = new Book[3];
		å��[0] = new Book("�Ƹ��","�տ���");
		å��[1] = new Book("�Һ��ǹ�Ģ", "��� �Ͽ�ö");
		å��[2] = new Book("���� �а� ���� ������", "�տ���");
			
		System.out.println(å��);//��ǻ�Ϳ��� å�� �迭�� �ּ�
		//for ���� ��� ���� å�� �߿��� 1�Ǹ� ������ ���� ������
		//�� �տ� �ڷ����� �迭�� �ٿ����� ����
		for(Book å : å��) {
			System.out.println(å); //å�鿡�� �� �Ǿ� ���� �ּ�
			System.out.println(å.getBookName());
			System.out.println(å.getAuthor());

		}
		System.out.println("======================");
		for (int i = 0; i < å��.length; i++) {
			å��[i].showBook();
		}
	}
}

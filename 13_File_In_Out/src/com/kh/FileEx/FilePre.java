package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {

	public FilePre() {

	}

	public void �޼���1() {
		File �ؽ�Ʈ���� = new File("c:/Users/user1/Desktop/newFFF/���ϻ���.txt");

		if (�ؽ�Ʈ����.exists()) {
			System.out.println("������ �����մϴ�.");
		} else { // �������� �ʴ´ٸ�
			// ���࿡ ���� ����� ����!
			try {

				�ؽ�Ʈ����.createNewFile();
				System.out.println(�ؽ�Ʈ����.getName() + "������ �����Ǿ����ϴ�.");

			} catch (IOException e) {
				System.out.println("���ϸ���� �����߽��ϴ�.");
				e.printStackTrace();
			}
		}
	}

	public void �޼���2() {
		// ������
		// ����ȭ�鿡 ��������� ���� �����ϰ� ������ �ȿ� ���ϻ���.txt ���� �����
		//String ������� = "c:/Users/user1/Desktop/������";
		//File ��������� = new File(�������)
		
		
		File ������ = new File("c:/Users/user1/Desktop/������");
		File ������1 = new File("c:/Users/user1/Desktop/������/���ϻ���.txt");
		
		//����ȭ�� ��� �����ϴ� ���
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		//File ������1 = new File(�������);
		if (������.exists()) {
			System.out.println("������ �����մϴ�.");
		} else {
			������.mkdir();
			try {
				������1.createNewFile();
				System.out.println(������1.getName() + "������ �����Ǿ����ϴ�.");

			} catch (IOException e) {
				System.out.println("���ϸ���� �����߽��ϴ�.");
				e.printStackTrace();
			}

		}
	}
	
	public void �޼���3() {
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		
		//��� ���� ����
		File ������ = new File(����ȭ���� + "��1/��2/��3");
		������.mkdir();
		
		//���� ����
		File ���� = new File(������ + "/���ο�����.txt");
		
		try {
			
			boolean ���ϻ���Ȯ�� = ����.createNewFile();
			System.out.println("������ ���� �Ǿ����ϱ�? " + ���ϻ���Ȯ��);
			
			//���� ũ�� Ȯ��
			System.out.println(����.length());
			
			//���� ������ ������ Ȯ��
			System.out.println(����.lastModified());
			//���� ����
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void �޼���4() {
		//���� �̸� �����ϱ�
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		File �ؽ�Ʈ���� = new File(����ȭ���� + "/newFFF/���ϻ����̸��ٲٱ�.txt");
		try {
			�ؽ�Ʈ����.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void �޼���5() {
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		File �ؽ�Ʈ���� = new File(����ȭ���� + "/newFFF/���ϻ����̸��ٲٱ�.txt");
		File ���ο��̸� = new File(����ȭ���� + "/newFFF/������̸�.txt");
		
		//���� �̸� �����ϱ�
		//���࿡ ������ ������ ��� -> ���� �̸� ���� �������� ������ ����x
		if(�ؽ�Ʈ����.exists()) {
			//���࿡ ���� �̸��� ���������� �����ߴٸ�
			if(�ؽ�Ʈ����.renameTo(���ο��̸�) ) {
				System.out.println("���� �̸��� ���������� ����Ǿ����ϴ�.");
			} else {
				System.out.println("���� �̸� ���濡 �����߽��ϴ�.");
			}
		} else {
			System.out.println("���� �̸��� �������� �ʽ��ϴ�. ������ּ��� ^^");
		}
	}

	// main �޼��� �ϳ� �����
	public static void main(String[] args) {
		FilePre ���� = new FilePre();
		// ����.�޼���1();
		//����.�޼���2();
		//����.�޼���4();
		����.�޼���5();
	}
}
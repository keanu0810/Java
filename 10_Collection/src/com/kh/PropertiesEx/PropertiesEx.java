package com.kh.PropertiesEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
Properties = �Ӽ�, ���� ���� �־���ϴ� ���� �ۼ�

	Map�̶� ����� ������ �����͸� �����ϴµ� ���
	
	key(Ű) �� Value(��) ���� �̷���� ����
	
	Ű�� ���� ���ڰ� �ƴ϶� ���ڿ� �� ���·� ������ ����

�޼���
	setProperty(String key, String value) : ������ Ű�� �������� �ۿ� �׸��� �߰�
	getProperty(String key) : �־��� Ű�� ���� ���� ��ȯ
	getProperty(String key, String value) : �־��� Ű�� ���� ���� ����������, �ش� Ű�� ���� ���
											�⺻���� ��ȯ
	loac(InputStream in)				  : �Է� ��Ʈ������ �Ӽ� ����� �о��
	Store(OutputStream out, String comment : ��� ��Ʈ������ �Ӽ� ����� ����

Properties �� ��쿡�� ���α׷��̳� �ڵ带 ������ �� �ʼ��� ����������ϴ� ������ �ۼ��� ��
�ڵ尡 �ƴ϶� ���Ϸ� �ַ� ����

map �� �ַ� �����͸� �ٷ����� properties �� ��� ����Ű�� ȸ�� ������ȣ�� ������ ���ؼ�
������ ���� �ʿ��� ������ �ۼ��س��� �����̴�.

 * */
public class PropertiesEx {
	public static void main(String[] args) {
		// properties ��ü����
		Properties ���� = new Properties();

		// �������� �����
		try {
			// File
			File ��¥���ϸ���� = new File("����.properties");
			// ���࿡ ������ �������� �����ٸ� ���� ������ֱ�
			if (��¥���ϸ����.exists()) {
				System.out.println("������ �����մϴ�.");
			} else {
				System.out.println("���� ������ �����ϴ�. ���ο� ������ �������ּ���.");
				��¥���ϸ����.createNewFile();
			}

			// ���� ����� ���࿡ ������� ���� �� ���ٸ� ���ο� ������ ������ ��
			FileInputStream ���Ϻҷ����� = new FileInputStream("����.properties");
			����.load(���Ϻҷ�����); // ���ϸ���� ���
			���Ϻҷ�����.close(); // ���� ���۱� ��

			// �������̸� �����ȣ ������ ��
			// ���� �������̸��� ������ ����� ���ٸ� null������ �����Ǿ� ���� ��
			String �������̸� = ����.getProperty("�������̸�");
			String �����ں�� = ����.getProperty("�����ں��");

			System.out.println("������ �̸� : " + �������̸�);
			System.out.println("������ ��� : " + �����ں��);

			// ���� null ������ �ƹ��� ���� ���� ���� �ȴٸ� �������� �������� �� ����
			����.setProperty("Name", "�Ŵ���");
			����.setProperty("Password", "1234");

			// ����� ������ ���Ͽ� ����

			FileOutputStream �������� = new FileOutputStream("����.properties");
			// ���ο� ���� ����� ������ �� � ������ �����ϰų� �����ϰų� �߰��ߴ��� �ۼ�)
			����.store(��������, "���� �̸��� ��� ����");

			// ���� ���� ����
			��������.close();

			System.out.println("�����ڰ� ���������� ����Ǿ����ϴ�.");

		} catch (Exception e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		}

	}

}
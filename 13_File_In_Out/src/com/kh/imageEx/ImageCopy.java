package com.kh.imageEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 �̹����� �����ϱ� ���ؼ��� ���� �̹��� ���� ��ο�
 �ű�� ���� �̹��� ���� ��θ� ����
 
 File : ������ �а� ���� �������� ����ϴµ� ���̴� ��ü
 
 FileInPutStream  :������ �����͸� �̾���µ� ���
 
 	read() : �����͸� �о��
 
 FileOutPutStream : ������ �����͸� �������µ� ���
 
 	write() : �����͸� ���
 	
 */
public class ImageCopy {
	public static void main(String[] args) {
		// healing �̸� ����
		// �������� ������ ��ġ�ϰ� �ִ� ��Ҹ� �ۼ�
		// �ڹ��ڵ忡�� ���� ������ �ۼ��� ���� / �� �ۼ�
		// ��� ������ ������ src�� ���� ������ ��
		// ���� ��θ� ��� ���� ����/�� �� �� �����̸�.Ȯ���� �ۼ�
		String �����̹��� = "src/com/kh/imageEx/healing.jpg";// ctrl art ȭ��ǥ �Ʒ���
		String �����̹��� = "src/com/kh/imageEx/healing_cute.jpg";

		// fileInputStream OutputStream�� ����ؼ� �а� ���� �սô�!
		try {
			FileInputStream �����б� = new FileInputStream(�����̹���);
			FileOutputStream ���Ͼ��� = new FileOutputStream(�����̹���);

			// ���۸� ���� �����͸� �а� �������� �迭 ����
			byte[] buffer = new byte[1024];

			int ����;

			// ��ٱ��Ϸ� �㸥 ���۸� ���ؼ� ���� ���Ϸκ��� �����͸� �о�� ������ ���Ͽ� ���
			// while���� ����ؼ� �̹��� 0 ���� ������ ��������
			while ((���� = �����б�.read(buffer)) > 0) {
				���Ͼ���.write(buffer, 0, ����);
			}
			// ���� �а� ���ٸ� �����ϱ�!
			�����б�.close();
			���Ͼ���.close();

			System.out.println("�̹��� ����Ϸ� �Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("�̹��� ���� �� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
	}

}
package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

/*
 FileWriter : ���Ͽ� ���ڸ� ���� ���� ��ü
  ������ ���ٸ� ������ �����ϰ� ���Ͽ� �����͸� �ٷ� �� �� ����
  
 �޼��� 
 
 write() : �ۼ��ϰ� ���� ������ ���Ͼȿ� �ۼ�
 flush() : ��Ʈ���� ���� ��� �����͸� ��� (��� �ۼ��� ������)
 close() : �����ִ� ������ ����
 
 
 * */
public class FileWriteEx {
	public static void main(String[] args) {
			
		try {
			//	�����̸� �տ� �ּҰ� ������ ���� �ڹ� �ڵ带 �ۼ��ϴ� ���� �ٷ� �ؿ� �����˴ϴ�.
			//		  	  "���ϸ�.Ȯ����" , true �� ���̸� �̾ �ۼ� ��
			FileWriter �۾��� = new FileWriter("��������.txt"/*,true*/);
			
			
			//���Ͽ� ���ھ���
			�۾���.write("�ȳ��ϼ���. ȯ���մϴ�.");
			
			�۾���.close();
			System.out.println("�۾���Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

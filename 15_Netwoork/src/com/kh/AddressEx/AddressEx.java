package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
IP �ּ� : ��ǻ�Ϳ��� ��Ʈ��ũ�� Ư�� ��ġ�� Ȯ���ϴµ� ����ϴ� ����

 
���� �⺻ �ּ� 
�츮���ּ� = 192.168.0.1 localhost 127.0.01

���߿� �� ��ǻ�� ���� �ּҸ� �˰� �ʹٸ� ���̹� �˻�â�� ip�ּ� Ȯ��
 
port = ��Ʈ��ũ ���� �����͸� �ְ� ���� �� �ִ� ���
Ÿ���� ��ǻ�ͳ� ������, �Ǵ� Ư����ġ�� ���� �ִ� ��ȣ 2�ڸ��� 4�ڸ�


InetAddress : Java���� IP �ּҸ� ��Ÿ���µ� ���
	ȣ��Ʈ��� IP�ּҰ��� �Ӻ�ȯ, �����ο� ���� ���� �˻� ���� �����ϰ� ����
 
 �޼���� :
 getByName(String host) : host �� ���� ������ ��ȯ
 
 getHostName() : ȣ��Ʈ ���� ������
 
 getGostAddress() : IP�ּҸ� ������
 * */

/*
ȣ��Ʈ�� : www.google.com
IP�ּ� : 172.217.25.4

����� �� �̸� �ּҿ� ���ڷ� �� �ּҰ� �ٸ������ �Ӱ˻����� ���� ���� �˻����� �� �����ּҰ�
�ٸ��� ������ ���� ����� �� �̸��ּ� ������ ��¥ ������ ���� ���� �ּҸ� ��ȣ�ϱ� ����
�ӽ÷� �����ִ� ���� �ּ��̱� ������ ������ �ٸ��� �������� ����
 * */
public class AddressEx {
	// ���� ���� main �޼���
	public static void main(String[] args) {
		// 1. naver �� ���� �˾ƺ���
		try {// ������ �������� �𸣳� �ϴ� �õ��غ��� ���� try

			InetAddress �ּ� = InetAddress.getByName("www.naver.com");
			System.out.println("ȣ��Ʈ�� : " + �ּ�.getHostName());
			System.out.println("IP�ּ� : " + �ּ�.getHostAddress());

		} catch (UnknownHostException e) { // �õ����� �� ���ܰ� �߻��ϸ� ���� ����
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2. daum �� ���� �˾ƺ���
		try {
			InetAddress �����ּ� = InetAddress.getByName("www.daum.net");
			System.out.println("ȣ��Ʈ�� : " + �����ּ�.getHostName());
			System.out.println("IP�ּ� : " + �����ּ�.getHostAddress());

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3, IP�ּҷ� daum.net �˻��ϱ�

		InetAddress ����IP;
		try {
			����IP = InetAddress.getByName("121.53.105.193");
			System.out.println("ȣ��Ʈ�� : " + ����IP.getHostName());
			System.out.println("IP�ּ� : " + ����IP.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}

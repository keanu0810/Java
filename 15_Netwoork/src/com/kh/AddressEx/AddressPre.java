package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	public static void main(String[] args) {
		// www.google.com ȣ��Ʈ���� IP �ּ� ��������

		try {
			InetAddress �ּ� = InetAddress.getByName("www.google.com");
			System.out.println("ȣ��Ʈ�� : " + �ּ�.getHostName());
			System.out.println("IP�ּ� : " + �ּ�.getHostAddress());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

		// ���� ��ǻ�� �̸��� �ڸ���ȣ Ȯ���ϱ�
		// get localhost
		
		try {
			InetAddress ���� = InetAddress.getLocalHost();
			System.out.println("���� �̸� : " + ����.getLocalHost());
			System.out.println("���� �ڸ� : " + ����.getLoopbackAddress());
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//www.facebook.com ���̽��� ȣ��Ʈ�̸� ȣ��Ʈ �ּ�
		try {
			InetAddress ����ּ� = InetAddress.getByName("www.facebook.com");
			System.out.println("ȣ��Ʈ�� : " + ����ּ�.getHostName());
			System.out.println("ȣ��Ʈ�ּ� : " + ����ּ�.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//www.instagram.com �ν�Ÿ�׷� ȣ��Ʈ�̸� ȣ��Ʈ�ּ� �˻�
		try {
			InetAddress �κ��ּ� = InetAddress.getByName("www.instagram.com");
			System.out.println("ȣ��Ʈ�� : " + �κ��ּ�.getHostName() );
			System.out.println("ȣ��Ʈ�ּ� : " + �κ��ּ�.getHostAddress() );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
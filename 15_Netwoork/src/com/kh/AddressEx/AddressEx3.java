package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx3 {
	public static void main(String[] args) {
		try {
			InetAddress �ּ��̸� = InetAddress.getByName("www.google.com");

			// getByName �����ּҿ� �����ּҸ� �� ���� ������
			System.out.println("getbyName���� ������ ������ �̸� : " + �ּ��̸�);

			// getLocalHost�� �̿��ؼ� �� ���ּҸ� �������� ���ּҿ� ���� �� ���� Ȯ��
			// �� ���ּҿ� ���� �����ּ��̸� �� ��ǻ�� �����ּ�
			InetAddress �����ּ� = InetAddress.getLocalHost();
			System.out.println("���� �� �ּ� : " + �����ּ�);

			// ��Ƽĳ��Ʈ �ּ� ���� Ȯ��
			
			//�� ��ǻ�Ϳ��� 2�� �̻��� ��ǻ�Ϳ� ���÷� ���� �����ϴ� ���
			// byte[] �ּҸ� Ȱ���� ��ü ��������
			// ������ �ּ� ���� ��ǻ�� ��ü�� ����Ű�� �ܺ� ������ ���� �ʰ� �� ��ǻ�� ���
			byte[] ipAddress = { 127, 0, 0, 1 };
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);

			System.out.println(�����ּ�);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
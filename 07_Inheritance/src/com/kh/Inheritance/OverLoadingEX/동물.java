package com.kh.Inheritance.OverLoadingEX;

public class ���� {
//�ʵ�
	String �̸�; // Alt + Shift + S
//�޼���
	//Setter
	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}
	
	//getter
	public String get�̸�() {
		return �̸�;
	}
	//������
	public ����() {
		
	}
	//������ : �ʼ�
	public ����(String �̸�) {
		this.�̸� = �̸�;
	}
	
	//void : ��ȯ�ϴ� ������ ��¸�
	public void �Ҹ� () {
		System.out.println("������ �Ҹ��� ���ϴ�.");
	}
}

package com.kh.inheritance.ex;

//�ڽ�Ŭ����
public class ������ extends ����Ʈ�� {

	//�ʵ�
	private int IOS; // ������ �ü��
	//�޼���
	
	//Setter
	public void setIOS(int iOS) {
		IOS = iOS;
	}

	//Getter
	public int getIOS() {
		return IOS;
	}
	//������ : �⺻
	public ������() {
		// TODO Auto-generated constructor stub
	}
	//������ : �ʼ�

	public ������(String ȭ��, String ��Ż�, String ����, int iOS) {
		super(ȭ��, ��Ż�, ����);
		this.IOS = iOS;
	}
	
	//toString
	public String toString() {
		return "������ ���� : " + IOS + " / " + super.toString();
	}
	
	
	
}

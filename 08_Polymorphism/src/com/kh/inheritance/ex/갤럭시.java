package com.kh.inheritance.ex;

// extends ����Ʈ�� ��ӹޱ�
public class ������ extends ����Ʈ��{
	
//�ʵ�
	private int �ȵ���̵�;

	//�޼���
	//Setter
	public void set�ȵ���̵�(int �ȵ���̵�) {
		this.�ȵ���̵� = �ȵ���̵�;
	}
	//Getter
	public int get�ȵ���̵�() {
		return �ȵ���̵�;
	}
	//������ : �⺻ ctrl = space enter
	public ������() {
		// TODO Auto-generated constructor stub
	}
	//������ : �ʼ� alt + shift + s o
	public ������(String ȭ��, String ��Ż�, String ����, int �ȵ���̵�) {
		super(ȭ��, ��Ż�, ����);
		this.�ȵ���̵� = �ȵ���̵�;
	}

	
	//@Override toString alt shift s s
@Override
public String toString() {
	return "������ ���� : " +�ȵ���̵� + " / " + super.toString() + "]";
	}

	

}

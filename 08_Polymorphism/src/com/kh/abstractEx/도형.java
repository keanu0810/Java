package com.kh.abstractEx;

/*
 absteact class (�߻�Ŭ����)
 �߻� �޼��带 �����ϰ� �ִ� �ɷ���
 �̿ϼ� Ŭ�����̱� ������ 
 ��ǻ�Ϳ� �߻�Ŭ������ ���� ������ ��ü������ ����� ���� �Ұ���
 
 ��� ���� :
 [����������] = public protected default private 
 [����������] abstract class ���ϸ� {
 	//�ʵ� & �޼���(�ʼ��� �ƴ�)
 	 [����������] abstract �ڷ��� ������();
 
 
 }
 * */
public abstract class ���� {// �߻�Ŭ����
// �߻� : ���� ���� �� �� ��
//�ʵ�
	private String ����;

//�޼���
	// Getter
	public String get����() {
		return ����;
	}

	// Setter
	public void set����(String ����) {
		this.���� = ����;
	}

	// ������ : �⺻
	public ����() {

	}

	// ������ : �ʼ�
	public ����(String ����) {
		this.���� = ����;
	}

	// abstract ���߿� ���赵�� �ϼ��� ���Ͽ��� �ʼ��� �ҷ����� �ϼ��ؾ��ϴ� �޼����
	// abstract �޼���� �̿ϼ� �޼����̱� ������ �ڽ� Ŭ�������� �̿ϼ��� �θ�Ŭ������
	// �ϼ������ֱ� ���ؼ� �ڽ��� �θ� �ҷ��� �� abctract ���� ��쿡��
	// �ڽĿ��� �ʼ��� �ҷ��� ���� �޼��� ����� �ϼ��ؾ���
	public abstract double ��������();

	public abstract double �����ѷ�();

	public void �������() {
		System.out.println("�� ������ ���̰�" + ��������() + "�̰� �ѷ��� " + �����ѷ�() + "�Դϴ�.");
	}

}

package com.kh.abstractEx;

//�������� ����� �޼��带 ����ρٴ�. extends ����

public class �ﰢ�� extends ���� {
//�ʵ�
	private double �غ�;
	private double ����;

//������ : �ʼ�
	public �ﰢ��(String ����, double �غ�, double ����) {
		super(����);
		this.�غ� = �غ�;
		this.���� = ����;
	}

	@Override
	public double ��������() {
		return 0.5 * �غ� * ����;
	}
	/*
	 * Math = ���� sqrt = �������� ����ϴ� �޼��� ������ : � ���� ���ؼ� ���� ����� ������ ���� �ǵ��� �ϴ� �� pow =
	 * �־��� ���� �ŵ� �����ϴ� �޼��� �ŵ� ����: �Ȱ��� ���� ���� ����
	 */

	@Override
	public double �����ѷ�() {
		double ���� = Math.sqrt(Math.pow(�غ�, 2) + Math.pow(����, 2));

		return �غ� + ���� + ����;
	}
}

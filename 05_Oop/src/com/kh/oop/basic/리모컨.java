package com.kh.oop.basic;

public class ������ {

	//1. �ʵ�
	public boolean powerOn;   // ��������
	public int volume;
	
	
	//2. ������ (����, ������, �ʼ� ������)
	public ������() {
		
	}
	public ������(int vol) {
		this.volume = vol;
	}
	
	//3. �޼���
	public void ����(){
		System.out.println("���� :" +volume);
		
		
	}
	public static void main(String[] args) {
	//������ ��ü �����ϱ�
	������ rmc = new ������();
	rmc.powerOn = true;
	rmc.volume = 100;
	System.out.println("�������� ������ " + rmc.powerOn + "�̰�."
						+ "������" + rmc.volume + "�Դϴ�,");				
// ������ ������ 200���� ���� ������ 200�� �´��� Ȯ���ϱ�
						
	������ orderRmc = new ������(200);//������ ������ �ʼ��̱� ������
	orderRmc.����();
	
	//���� ����� ���� �޼��带 ����
	//������ ������ 200���� ���� 200�� �´��� Ȯ���ϱ�
	}

}
package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	//���� �޼��� �������� �����ϰų� ����ϴ� �ż���
	public static void main(String[] args) {
		//����� ������ �ۼ��� �� �ִ� ������ �����
		//������ ����� ���� ������ �ۼ��� �� �ִ�
		//Member ��ü ����
		Member member1 = new Member();
		
		//�̸� ����
		member1.changeName("���׶��");
		
		//����� �̸� ���
		member1.printName();
		// nu11 �ȿ� ��� ���� ������� ���� �� n11��
	}
}

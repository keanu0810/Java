package com.kh.oop.basic;
// ����
public class Nation {
	/* �Ӽ� ��*/
	// �̸�; String name;
	// ����; String age;
	// ����; String gender;
	// �ֹι�ȣ; String jumin;

		public String name;
		public int age;
		public char gender;
		public String jumin;
	
	/* �޼��� ����*/
	public void speakkorean() {
		System.out.println("�����ٶ� �ѱ��� ����");
	}
		
	public void welfare() {
			System.out.println("���ѹα� ���� ������ !");
	}
	
	public void �������ǹ�() {
		// �� 19�� �̻� ���θ� ������ ���� ���
		if(age >= 19) {
			System.out.println(name + "���� ���� ���� ������Դϴ�.");
		}else {
			System.out.println();
		}
	}
	
}

package com.kh.oop.constructor;
//1. ȸ������
public class Join {
	//�ʵ� ȸ����ȣ ���̵� �̸� ����ó
	public int memberNo; //ȸ�������� ����
	public String memberId; // ȸ���� �ۼ��� ���̵� nimName
	public String memberName;
	public String phonNumber;
	
	// ������ �⺻ �ʼ�
	public Join() { //�ʼ� X
		
		
	}
	public Join(int memberNo, String memberId, String memberName, String phonNumber) { // �ʼ� O ���� ȸ�翡�� �ʿ��� ������ ��� ���� ��
	// �̰��� �ʵ忡 �ִ�  memberNo �� = ���߿� �ۼ��� memberNo�� �ְڽ��ϴ�	
					this.memberNo = memberNo;
					this.memberId = memberId;
					this.memberName = memberName;
					this.phonNumber = phonNumber;
		
	}
	//�޼��� = Ŭ���� �ȿ� �����ϰ�, Ư�� ����� �� �� �ֵ��� ������� �ڵ� ����
		//void �޼��� : ����� �������� ����
	public void memberInfo() {
		System.out.println("��� ��ȣ : " + memberNo);
		System.out.println("��� ID : " + memberId);
		System.out.println("��� �̸� : " + memberName);
		System.out.println("��� ��ȣ : " + phonNumber);
		System.out.println("--------------");
	}
	
	public static void main(String[] args) {
		System.out.println("===kh ���� ȸ�� ���� Ȯ�� ===");
		
		// ȸ��1�� ���� ���� Ȯ��
		// ȸ������ ��ü ����
		Join member1 = new Join();
		
		// �ʼ��� ����
		member1.memberId = "������";
		member1.memberName = "���׶��";
		member1.phonNumber = "010-1111-2222";
		member1.memberInfo();
		
		Join member2 = new Join();
		//�ʼ��� ����
		member2.memberId = "�л��޸�";
		member2.memberName = "ȫ�浿";
		member2.memberInfo();
		//ȸ�������� �� �ʼ��� �ۼ��ؾ��ϴ� �ʼ� �ۼ��� ����
		//ȸ����ȣ ���̵� �̸� �ڵ�����ȣ
		
		Join member3 = new Join(3,"�Ŀ�����", "�ڿ���","010-1111-2222");
		member3.memberInfo();
		
		
		//member4	member5 ȸ������ ��Ŵ
		//member4 �⺻ ������ ������ ȸ������ ��Ű��
		//�����ȣ ��� �̸� memberInfo() member4
		// 4		���ƴ�
		Join member4 = new Join();
		member4.memberId = "4";
		member4.memberName = "���ƴ�";
		member4.memberInfo();
		
		//member5 �ʼ� ������ ������ ȸ������ ��Ű��
		//member5 info()
		// 5 "���۸�" "�� ����" "010-1938-1932"
		Join member5 = new Join(5, "���۸�", "�� ����", "010-1938-1932");
		member5.memberInfo();

}
	
}

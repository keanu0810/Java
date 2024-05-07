package com.kh.oop.constructor;

public class ConstructorEx {
	/* ������
	 ������ ���ϴ� ������ �ʱ�ȭ�� �� ����
	 
	 �ʱⰪ�� = 0; ���� �Ǿ����� �� �ʱⰪ�� 1�� �־��ָ�
	 �ʱⰪ�� 1�� �ʱ�ȭ��
	 
	 1. ��ȯ���� ����(return ��� x, void x �� �� �ΰ��� ���������� ����
	 2. ��ü(Ŭ����)�� �ʱ�ȭ �ϴ� ����� ���� ��� ��� ��� ����
	 	
	 	������
	 		1. �⺻ ������ - �ʼ��� ����
	 			public Ŭ�����̸�() {
	 			
	 			}
	 		2. �ʼ� ������ - �ʼ��� �޾ƾ��ϴ� ���� ������
	 					- �ʼ��� �޾ƾ��ϴ� ���� �ʵ忡 ���� ���� ����
	 			public Ŭ�����̸�(String ����, int ����, char ����){
	 				(���⼭ ������� �ʵ尪�� ����)
	 				this. ������1 = ����;
	 				this. �ʵ尪2 = ����;
	 				this. �ʵ尪3 = ����;
	 			}
	 		3. ���� ������ ������
	 			�ʵ峪 �����ڿ��� ���� �������� ������
	 			
	 			
	 * */
	// �ʵ� ������ ����
	public String name;
	public String phone;
	public 	  int idNo;
	public 	  int money; //�������
	
	//������ �⺻  / �ʼ� / ���� ������ ������
	// �⺻ ������ : �ʼ��� �ƹ��͵� �������� ������
	public ConstructorEx() {
		
	}
	// �ʼ������� ��ȣ �ȿ� �Ű������� �ʼ��� ���� �ϴ� ������
	// �� ��(�߸�) ˿ ��(����) ܨ ��(���ϴ�) �(���ڰ�)
	//				(��ȣ�ȿ� ���� ���� �Ű� ����)
	//              �ʼ��� �̸�
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	// 				�ʼ��� �̸� �ڵ�����ȣ
	public ConstructorEx(String inputName, String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
	}
	// 				�ʼ��� �̸� �ڵ�����ȣ ���̵��ȣ
	public ConstructorEx(String inputName, String inputNumber, int inputId) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
	}
	// 				�ʼ��� �̸� �ڵ�����ȣ ���̵��ȣ �ݾ�
	public ConstructorEx(String inputName, String inputNumber, int inputId, int inputMoney) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
		this.money = inputMoney;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// ���� ������ ������
	/* ���� ������ �����ڴ� �ʱ��� ���� �������ֱ� ������
	   �ް������� �ʼ��� �־����� �ʾƵ� ������
	   �⺻ �����ڿ� ������� �Ȱ��Ƽ� �������� ���� ������
	   ����� ���Ƿ� �Ű������� �־���
	   ������ public ConstructorEx() {} ����� �� ����
	   ��� ���� ���� ���� 
	 */
	public ConstructorEx(int a) {
		//�⺻���� ���� �����ؼ� �����ϴ� ������
		//������ ������ ���� �������ְ� ���� ���� ������ �� �ֵ��� ����
		
		name = "�̸��� �Է����ּ���"; //String �̱� ������ ���ڿ��� �־�� ��
		phone = "��ȣ�� �Է����ּ���"; //String �̱� ������ ���ڿ��� �־�� ��
		idNo = 				  1; //int �̱� ������ ���ڰ��� �־�� ��
		money =  			  1;//int �̱� ������ ���ڰ��� �־�� ��
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	}
}

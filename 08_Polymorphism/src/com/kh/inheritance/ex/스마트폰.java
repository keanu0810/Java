package com.kh.inheritance.ex;

//�θ�Ŭ����
public class ����Ʈ�� {
//�ʵ�
	private String ȭ��;
	private String ��Ż�;
	private String ����;

	//�޼���
	//Swtter
	public void setȭ��(String ȭ��) {
	this.ȭ�� = ȭ��;
}
	public void set��Ż�(String ��Ż�) {
		this.��Ż� = ��Ż�;
}
	public void set����(String ����) {
		this.���� = ����;
}
	//Getter
	public String getȭ��() {
		return ȭ��;
	}
	public String get��Ż�() {
		return ��Ż�;
	}
	public String get����() {
		return ����;
	}
	//������ : �⺻ ctrl + space -> enter
	public ����Ʈ��() {
	
}
	//������ : �ʼ� alt + shift + s -> o
	public ����Ʈ��(String ȭ��, String ��Ż�, String ����) {
		super();
		this.ȭ�� = ȭ��;
		this.��Ż� = ��Ż�;
		this.���� = ����;
	}
	
	
	//void �Ǵ� return
	
	//toString String �ؿ� ������� method
	@Override
	
	public String toString() {
		return "����Ʈ�� [ȭ��=" + ȭ�� +  ",����=" + ��Ż� + ", ����=" + ���� + "]";
	}

}

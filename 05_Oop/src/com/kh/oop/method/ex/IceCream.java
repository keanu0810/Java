package com.kh.oop.method.ex;

public class IceCream {
	//�ʵ�
	//private String name;
	//private boolean milk;
	private String name;
	private boolean milk;
	private int sugar;

public void setName(String name) {
		this.name = name;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
public String getName() {
		return name;
	}
	public boolean isMilk() {
		return milk;
	}
	public int getSugar() {
		return sugar;
	}
	//�޼���
	//������ : �⺻
	public IceCream() {
		
	}
	//������ : �ʼ� �̸� ���� ���� ����
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
		
	//void makeIceCream(){
	void makeIceCream(){
		System.out.println("���̽�ũ���� �����մϴ�.");
		System.out.println(" ���� : " + name);
		System.out.println("���� ���� : " + milk);
		if(milk) {
			System.out.println("�����߰�");
		} else { //���� ����
			System.out.println("���� ���߰�");
		}
		System.out.println("���̽�ũ���� �غ�Ǿ����ϴ�.");
	}
	//���̽��� �����
	//�̸� ���� ���� ���� ���
	//���� �߰� �ϸ� ���� �߰�
	//���� ���߰��ϸ� ���� ���߰�
//IceCreamRun -> ���θ޼���
	
	
	
}

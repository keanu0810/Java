package com.kh.oop.method;

public class Animal {
	//�ʵ� 
	public String name;
	public int age;
	
	
	//�޼���
	//������
	//�⺻ ������
	public Animal() {
		
	}
	//�ʼ� name age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//return
	public String getName() {
		return name;
	}
	
	// return ���� ���� �ޱ�
	public int getAge() {
		return  age;
	}
	
	// void �� ����Ʈ ����ϱ�
	public void info() {
		System.out.println("���� �̸� :" + name);
		System.out.println("���� ���� : " + age);
	}
	
	
	//���θ޼���
	public static void main(String[] args) {
	
		//���� ������ = dog ("������",1);
		Animal dog = new Animal("������", 1);
		Animal cat = new Animal("�����", 1);
		dog.info();
		cat.info();
		
		

	}
}

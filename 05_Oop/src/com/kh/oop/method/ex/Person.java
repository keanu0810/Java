package com.kh.oop.method.ex;

//@Getter @Setter
public class Person {
	
	//�ʵ� �̸� ����
	private String name;
	private 	int age;
	
	// ����� ���� ������
	public Person() {
		
	}
	//�ʵ� ��� ���� �����ϰ� �������� setter getter ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//���� �޼���
	// ����Ű main�� ����  ctrl + space
	public static void main(String[] args) {
		Person person1 = new Person();
		
		//Setter�� Ȱ���ؼ� �Ӽ� �� ����
		person1.setName("ȫ�浿");
		person1.setAge(20);
		
		//Getter�� Ȱ���ؼ� �Ӽ��� �б�
		System.out.println("�̸� : " + person1.getName());
		System.out.println("���� : " + person1.getAge());
	}
	
	
	
}

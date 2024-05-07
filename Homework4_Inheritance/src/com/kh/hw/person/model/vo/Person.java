package com.kh.hw.person.model.vo;

public class Person {
	// �̸� ���� Ű ������
//�ʵ�
	private String name;
	private int age;
	private double height;
	private double weight;
//�޼���

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// Getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	// ������ : �⺻
	public Person() {

	}

	// ������ : �ʼ�
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// @Override ǥ���ϰ� toString �ۼ�
	@Override
	public String toString() {
		return "���[neme=" + name + ", age =" + age + ", height=" + height + ", weight=" + weight + "]";

	}
}

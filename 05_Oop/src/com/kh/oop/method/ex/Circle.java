package com.kh.oop.method.ex;

public class Circle {
	//�ʵ�
	private double pi = 3.14;
	private int radius = 1; //radius = ������
	
	//Setter Getter
	public double getPi() {
		return pi;

	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}

	public int getRadius() {
		return radius;
	}
		//������ : �⺻
	public Circle() {
			
		}
	
	//�޼���
	public void incrementRadius() {//increment ���� Radius ������
		//�������� 1�� �����ϱ�
		radius++;
	}
	public void getAreaOfCircle() { //Circle �� Area ����
		//�Ҽ��ڸ�
		double area = pi * radius * radius;
		System.out.println("���� ���� : " + area);
	}
	public void getSizeOfCircle() {
		//3.14 �Ҽ��ڸ�
		double size = 2 * pi *radius;
		
	}
	//���� �޼��� ctel + space
	public static void main(String[] args) {
		//�� ��ü ���� ��
		Circle �� = new Circle();
		
		// 1�� �����ϱ� ���� ���� �ѷ��� ���� ����ϱ�
		System.out.println("���� �ʱ� �ѷ��� ����");
		��.getSizeOfCircle();
		��.getAreaOfCircle();
		
		//������ ���� 1�� �����Ѵٸ� ?!
		��.incrementRadius(); //1�� ���� ũ�⸦ ������Ų��
		
		//������ �������� ���� �ѷ� �� ���� ���
		System.out.println("������ 1 ���� �� ���� �ѷ��� ����");
		��.getSizeOfCircle();
		��.getAreaOfCircle();
		
		}
	}

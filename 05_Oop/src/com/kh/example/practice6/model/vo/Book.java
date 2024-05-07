package com.kh.example.practice6.model.vo;

public class Book {
	public String title;
	public String publisher;
	public int price;
	public String author;
	public double discountRate;
	
	//������
	//1. �⺻������
	public Book() {
		
	}
	// 2. �ʼ������� �ʼ��� �Ű������� �־���� �ϴ� ������
	public Book(String title, String publisher, String author, double discountRate ) {
		this.title	= title;
		this.publisher = publisher;
		this.author = author;
	}
	public Book(String title, String publisher, String author, int price, double discount) {
		this.title	= title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discount;
	}
	
	public void inform() {
		System.out.println("å�̸� : " + title);
		System.out.println("���ǻ� : " + publisher);
		System.out.println("������ : " + author);
		System.out.println("å���� : " + price);
		System.out.println("������ : " + discountRate);
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
	

		
		
		//book1 å���� �Է� �� ���
		//book1 å���� �Է� �� ���
		Book book1 = new Book();
		book1.title = "�װ��� �˰�ʹ�.";
		book1.author = "������";
		book1.publisher = "SBS";
		book1.inform();
		//book2 å�������� �ʼ������� String title, String publisher, String author ���
		Book book2 = new Book("5�� 32��", "kh T��" , "T�� ��ü�ϵ�", 0.11);
		book2.inform();
		//book3 ��� �ԷµǾ��ִ� �ʼ������� �̿��ؼ� ���
		//String title, String publisher, String author, int price, double discountRate
		Book book3 = new Book("Do it! �ڹ� ���α׷��� �Թ�", "�������ۺ���","������",16500,0.34);
		book3.inform();
	}

}
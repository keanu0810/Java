package com.kh.arrayList.pre;

public class Book {
	//å�̸�
	private String bookName;
	//����
	private String author;
	//�޼���
	
	//Setter
public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	//Getter
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	
	//������ : �⺻
	public Book() {
		
	}
	//������ : �ʼ�
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//void å ������ ����ϴ� �޼���
	public void showBook() {
		System.out.println(bookName + ", " + author);
	}
}

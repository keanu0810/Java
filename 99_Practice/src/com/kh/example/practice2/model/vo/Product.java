package com.kh.example.practice2.model.vo;

public class Product {
	//�ʵ�
	private String pName;
	private int price;
	private String brand; // ark + shift + S
	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	//�޼��� ���� : ������ : �⺻ 
	public Product() {
		
	}
	//setter setter
	
	//�޼��� : void
	public void information() {
		// �̸� ���� �귣��
		System.out.println("��ǰ : " + pName);
		System.out.println("���� : " + price);
		System.out.println("�귣��" + brand); 
	 }





	
		
	}


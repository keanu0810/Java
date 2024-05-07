package com.kh.example.practice2.model.vo;

public class Product {
	//필드
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


	//메서드 시작 : 생성자 : 기본 
	public Product() {
		
	}
	//setter setter
	
	//메서드 : void
	public void information() {
		// 이름 가격 브랜드
		System.out.println("상품 : " + pName);
		System.out.println("가격 : " + price);
		System.out.println("브랜드" + brand); 
	 }





	
		
	}


package com.kh.example.practice2.run;
// Product �� �����ͼ� �����ϴ� Ŭ����
import com.kh.example.practice2.model.vo.Product;
	
public class Run {
	//���� �޼���
	public static void main(String[] args) {
		// Product ��ü ����
		Product Product1 = new Product();
		
		// ���� ���� : ��� ����� ����귣��
		Product1.setpName("���");
		Product1.setPrice(2000);
		Product1.setBrand("����� ����");
		
		
		Product1.information();
		
		System.out.println("=== get �ҷ����� ===");
		System.out.println("�̸� : " + Product1.getpName());
		System.out.println("���� : " + Product1.getPrice());
		System.out.println("�귣�� : " + Product1.getBrand());
		

	}
}

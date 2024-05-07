package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
	//�޼���
		//�⺻ ������
		public ArrayListEx2  (){
			
		}
		
		public void method1() {
			// ���� �ٳ��� ���
			ArrayList<String> list = new ArrayList<>();
			
			// add�� ����ؼ� ���� �ٳ��� ��� �߰�
			list.add("����");
			list.add("�ٳ���");
			list.add("���");
			
			//get 0 1 2 ����ؼ� �� index �ڸ��� �� ����ϱ�
			System.out.println("list.get(0) : " + list.get(0)); //����
			System.out.println("list.get(1) : " + list.get(1)); //�ٳ���
			System.out.println("list.get(2) : " + list.get(2)); //���
			
			// set �ٳ��� -> Ű�� ����
			list.set(1, "Ű��");
			
			// size �� �̿��ؼ� ũ�� Ȯ��
			//size() ���ڸ� ���� ���� size() ���
			System.out.println("�ٱ��� ũ�� : " +list.size());
			// remove Ű�� ����
			list.remove(1);
			//isEmpty() ����ִ��� Ȯ��
			System.out.println("��ٱ��� ��� �ֳ��� ? : "+list.isEmpty());
			
			//��ٱ��� ���� �� �ִ��� Ȯ��!
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("==============");
			//������ ����� for ��
			for (String ���� : list ) {
				
				System.out.println(����);
				
			}
	}

	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		// ����Ű ���� �����ؼ� �ؿ� �پ���� ctrl + alt + ��
		//add ���� ȣ���� ����� ������
		animal.add("����"); 
		animal.add("ȣ����");
		animal.add("�����");
		animal.add("������");
		

		//size() ������ ��� �ִ��� Ȯ��
		System.out.println(animal.size());
		// get ���� ���� Ȯ��
		System.out.println("���� 0 : " + animal.get(0));
		System.out.println("���� 1 : " + animal.get(1)); 
		System.out.println("���� 2 : " + animal.get(2));
		System.out.println("���� 3 : " + animal.get(3));
		//����� -> �䳢�� ����
		animal.set(2, "�䳢");
		//remove ������ ����
		animal.remove("������"); //���� ���� �̸��� �ᵵ ���� ��
		//for���� Ȱ���ؼ� get ���
		for (String ���� : animal) {
			System.out.println("���� : " + ����);
		}
		//clear(); ����ؼ� ��� ����
		animal.clear();
		//isEmpty(); ��� ������ �ƴ��� Ȯ��
		System.out.println("��� �̻��մϴ�.");
		System.out.println("�������� ��� ����ֳ���? " + animal.isEmpty());
	}	
	
	public void method3() {
		//���� ����
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("===���ڸ޴�===");
		// add ���� �������� ����δ�
		pizza.add("���� ����");
		pizza.add("�������� ����");
		pizza.add("����δ� ����");
		//pizza �������� �������� ���� ����δ�

		//��� ����
		System.out.println("��� �޴� ���� : "+ pizza);
	
		// get �� Ȱ���ؼ� ���
		System.out.println("�޴��� : " + pizza.get(0));
		System.out.println("�޴��� : " + pizza.get(1));
		System.out.println("�޴��� : " + pizza.get(2));
		
		// set �� Ȱ���ؼ� ����δ� -> ���ξ���
		pizza.set(2, "���ξ��� ����");
	
		//remove ���ξ���
		pizza.remove("���ξ��� ����");
		
		//for �� Ȱ���ؼ� ���
		for (String ���� : pizza) {
			System.out.println("�޴��� : " + ����);
		}
		System.out.println("���ڰ��԰� ����� �����Դϴ�.");
		//�޴� ��� ���� clear()
		pizza.clear();
		//�޴� ��� �����ƴ��� Ȯ�� isEmpty
		System.out.println("����߽��ϴ� : " + pizza.isEmpty());
		
	}
	
	// ���� �������� ����� �޼���
	public static void main(String[] args) {
		ArrayListEx2 ae = new ArrayListEx2();
		//ae.method1();
		//ae.method2();
		ae.method3();

	}

}

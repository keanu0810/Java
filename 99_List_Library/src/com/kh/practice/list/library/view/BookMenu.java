package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.contoller.BookController;
import com.kh.practice.list.library.mode.Book;

public class BookMenu {
	// Ű���� �� �Է� ���� Scanner
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	// Book�� �������ڸ��� ���̴� ���θ޴� �����
	public void mainMenu() {
		//���࿡ true ��� ��� ����
		while(true) {
			System.out.println("---�������� ���α׷� ===");
			System.out.println("1. �����߰�");
			System.out.println("2. ������ü ��� ��ȸ");
			System.out.println("6. ����");
			System.out.print("�޴�����: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				insertBook();
				break;

			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
			}
		}
	}

	public void selectList() {
		bc.selectList();
	}

	// �� Ǫ���ϱ� ���� Ű����� �ۼ��ϴ� InsertBook void �����
	public void insertBook() {
		System.out.println("���� : ");
		String title = sc.nextLine();

		System.out.println("���� : ");
		String author = sc.nextLine();

		System.out.println("ī�װ� : ");
		String category = sc.nextLine();

		System.out.println("���� : ");
		int price = sc.nextInt();
		sc.nextLine();

		// å ���� �����ϴ� Book ��ü ��ȯ

		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("���� �߰��� �Ϸ� �Ǿ����ϴ�.");
	}

	// ��������
	public void deleteBook() {
		System.out.println("������ ���� ��� : ");
		String title = sc.nextLine();
		System.out.println("������ ���� ���� : ");
		String author = sc.nextLine();

		// BookController ���� �����ϴ� ��� �߰�
		bc.deleteBook(title, author);

	}
	
	// ���� �˻�
		public void searchBook() {
			System.out.print("�˻��� Ű���� �Է� : ");
			String keyword = sc.nextLine();
			bc.searchBook(keyword);
		}

	// ��������� ������������ �����ϱ�
	// ascending ��������
	public void ascBook() {
		// BookController ���� ������������ �����ϴ� ��
		bc.ascBook();
	}
}

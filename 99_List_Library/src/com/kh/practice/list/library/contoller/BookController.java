package com.kh.practice.list.library.contoller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.kh.practice.list.library.mode.Book;

public class BookController {
	ArrayList<Book> list = new ArrayList<>();

	// ������ ctrl space enter
	public BookController() {

	}

	public void insertBook(Book bk) {
		list.add(bk);
	}

	// å ��ü����
	public void selectList() {
		// å�� ���ٸ� ��ϵ� ������ �����ϴ�

		if (list.isEmpty()) {
			System.out.println("��ϵ� ������ �����ϴ�.");
		} else { // ���࿡ å�� �ִٸ� å ����� ��������
			// for - each Ȱ���ؼ� ��ü����
			for (Book b : list) {
				System.out.println(b.toString());
			}
		}

	}

	public void searchBook(String keyword) {
		
	}
	
	
	//���� ���� ��� �߰�
	public void deleteBook(String title, String author) {
		//true false �� ���� ������ �ƴ��� �� �ƴ��� Ȯ���� �� �ֵ��� ��
		boolean removed = false; //boolean false ���� �⺻�̱� ������  removed = false;
		//å ����� ���ڸ� �˻��ؼ� ������ å ã��
		//��ü��� for-each
		for(Book bbb : list) {
			//���࿡ ���� �����ϰ����ϴ� å����� å���ڰ� �����Ѵٸ�
			//  å ���� ��������.���ϱ�(���������ϰ����ϴ�å����)      å���ڵ� �����������ϱ�
			if(bbb.getTitle().equals(title)        &&          bbb.getAuthor().equals(author)) {
				list.remove(bbb);
				//������ ������ true
				removed = true;
				break;
			}
		}
	//���࿡ ������ ������ �����ƴٸ� true false �̿��ؼ� ǥ���ϱ�
	if(removed) {
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
	} else {
		System.out.println("�ش��ϴ� ������ ã�� �� �����ϴ�.");
		}
	}

	// �������� ����
	public void ascBook() {
		// for while short �������� ������ ���ָ� ��
		// sort ����� �������� �����ϴ�
							//�����ϴ� ���� 		å���� å����
								// :: Book ������ getTitle â���ؼ� ����ϰڴ�
									//comparing ���ϴ�
		Collections.sort(list, Comparator.comparing(Book::getTitle));
	}

}

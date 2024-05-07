package com.kh.practice.list.music.view;

import java.util.*;

import com.kh.practice.list.music.controller.MusicController;

public class MusicView {
	//��ĳ�ʷ� ����ϴ� ���� ���� ��ȣ�� �Է��սô�
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===���� ���� ���α׷�===");
			System.out.println("1. ���� �߰�");
			System.out.println("2. ù��° ��ġ�� ���� �߰�");
			System.out.println("3. ��ü����߰�");
			System.out.println("4. ���� �˻�");
			System.out.println("5. ���� ����");
			System.out.println("6. ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ���� �������� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴����� : ");
			//��ȣ �Է��Ҽ� �ִ� ��ȣ �Է� ���� ������ֱ�
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				//��ü����߰�
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				//����
				break;
			case 7:
				//���ǻ���
				break;
			case 8:
				//���ǻ���
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �޴� �����Դϴ�.");
			}
		}
	}
	
	//���� �߰�
	public void addList() {
		System.out.println("��� �Է� : ");
		String title = sc.nextLine();
		
		System.out.println("������ �Է� : ");
		String singer = sc.nextLine();
		
		//��� ���� �����ϱ�
		mc.addList(title, singer);
		
	}
	//ù ��° ��ġ�� �ٷ� ���� �߰��ϱ�
	public void addAtZero() {
		System.out.println("��� �Է� : ");
		String title = sc.nextLine();
		
		System.out.println("������ �Է� : ");
		String singer = sc.nextLine();
		
		//������ �߰��ϴµ� �� �տ� �߰�
		mc.addAtZero(title,singer);
		
	}
	
	public void PrintAll() {
		System.out.println(mc.printAll());
		
	}
	//���ǰ˻�
	//public void searchMusic(){}
	public void searchMusic(){
		System.out.println("�˻��� ��� �Է� ; ");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title));
	}
	//���ǻ���
	public void removeMusic(){
		System.out.println("������ ������ �Է��ϼ���!");
		String title = sc.nextLine();
		mc.removeMusic(title);
		System.out.println();
	}
	
	//���Ǽ���
	public void setMusic() {
		System.out.println("������ ��� �Է� : ");
		String title = sc.nextLine();
		System.out.println("������ ������ �Է� : ");
		String singer = sc.nextLine();
		System.out.println(mc.setMusic(title, singer));
	}
	
	
	//�������� ����
	public void ascTitle() {
		mc.ascTitle();
		System.out.println("����� ������������ �����Ͽ����ϴ�.");
	}
	//�������� ����
	public void dscTitle() {
		mc.dscTitle();
		System.out.println("�������� ���������� �����߽��ϴ�.");
	}
}
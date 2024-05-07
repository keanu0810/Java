package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String input = sc.nextLine();

		CharacterController controller = new CharacterController();
		
		try {
			int count = controller.countAlpha(input);
			
			System.out.println("'" + input + "' �� ���Ե� �������� ���� : " + count);
			
		} catch (CharCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//�������� �־ Scanner �� �ݾ��� 
			sc.close();
		}

	}
}

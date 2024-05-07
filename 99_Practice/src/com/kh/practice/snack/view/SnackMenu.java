package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.snack.controller.SnackController;

public class SnackMenu {
	//고객이 메뉴를 입력하고 보는 창
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요");
		System.out.println("종류 : ");
		String kind = sc.next();
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("맛 : ");
		String flavor = sc.next();
		System.out.println("개수 : ");
		int numOf = sc.nextInt();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		
		System.out.println("저장한 내용을 확인하시겠습니까? ( y / n)");
		String a = sc.next();
		//만약에 y를 누르면 저장한 내용 출력
		//equalsIgnoreCase 대소문자 차이를 무시하면서 두 문자열을 비교하는데 사용
		
		if(a.equalsIgnoreCase("Y")){
			System.out.println("저장하시겠습니까?");
		} else {
			System.out.println("종료 합니다.");
		}
		//저장 내용 잘 들어갔는지 확인
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		//저장 내용 잘 들어갔는지 확인
		System.out.println(scr.comfirmData());
				
		
	}
}

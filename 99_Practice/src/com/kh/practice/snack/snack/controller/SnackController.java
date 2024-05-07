package com.kh.practice.snack.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	//객체 생성
	private Snack s = new Snack();
	//기본 생성자
	public SnackController() {
		
	}
	//return 메소드 saveData
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장되었습니다.";
	}
	
	public String comfirmData() {
		return s.information();
	}
	//return 메소드 contirData
}

package com.kh.practice.snack.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	//��ü ����
	private Snack s = new Snack();
	//�⺻ ������
	public SnackController() {
		
	}
	//return �޼ҵ� saveData
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "����Ǿ����ϴ�.";
	}
	
	public String comfirmData() {
		return s.information();
	}
	//return �޼ҵ� contirData
}

package com.kh.practice.Audition.view;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionMenu {
	private AuditiontController ssm = new AuditiontController();
	
	public AuditionMenu() {
		
	}
	public void print AuditionMenu() {
		System.out.println("�̸� \�о�\f����");
		System.out.println("-------------");
		
		for(Audition Audition : ssm.pintAudition() ) {
			System.out.println(Audition.information(););
		}
		System.out.println("-----------------");
		System.out.println("���� : " ssm.avgScore()[1]);
		System.out.println("�հݿ��� : " + (ssm.avgScore()[1] >= AuditiontController.CUT_LINE));
		
		ssm.printPass();
	}
}

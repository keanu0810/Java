package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;
import com.kh.practice.Employee.model.vo.Employee;

public class AuditionController {

	
	
	private Audition[] sArr = new Audition[5];
	public static final int CUT_LINE = 60;
	
	public AuditionController() {
		sArr[0] = new Audition("�迵��", "�߶��", 100);
		sArr[1] = new Audition("�ڿ���", "����", 50);
		sArr[2] = new Audition("�̿���", "������", 85);
		sArr[3] = new Audition("������", "��", 60);
		sArr[4] = new Audition("ȫ����", "��", 20);
	}i
	public Audition[]printAudition(){
		return sArr;
	}
	public int sumScore() {
		int sum = 0;
		for(Audition a : sArr) {
			sum += a.getScore();
		}
		return sum;
	}
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length;
		return avgArr;
	}
	public double avgScore2() {
		double avgArr = sumScore() / sArr.length;
		return avgArr;
	}
	public void printPass() {
		for (Audition e : sArr) {
			a.setPassde(a.getScore() <= CUT_LINE);
		System.out.println();
}

package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	// 키보드로 입력받을 Scanner 작성
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 점수저장");
			System.out.println("2. 점수열기");
			System.out.println("0. 종   료");
			System.out.println("메뉴 선택 : ");

			int choice = sc.nextInt();
			sc.nextLine(); // 남아있는 엔터 지우기

			switch (choice) {
			case 1:
				saveScore();
				break;
			case 2:
				// 점수보기
				break;
			case 0:
				System.out.println("프로그램을 종료 합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}
	}

	public void saveScore() {
			System.out.println("이름 입력 : ");
			String name = sc.nextLine();
			System.out.println("국어 점수 입력 : ");
			int kor = sc.nextInt();
			System.out.println("영어 점수 입력 : ");
			int eng = sc.nextInt();
			System.out.println("수학 점수 입력 : ");
			int math = sc.nextInt();
			
			//국어
			int sum = kor + eng +math;
			
			double avg = sum / 3.0;
			
			
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			//System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 합계 %d, 평균: %.2fn"
					//, name,kor,eng,math,sum,avg);
		}

	// 점수 읽기
	public void readScore() throws Exception {
		DataInputStream dis = scr.readScore();
		while (dis.available() > 0) {
			String name = dis.readUTF();
			int     kor = dis.readInt();
			int     eng = dis.readInt();
			int    math = dis.readInt();
			int     sum = dis.readInt();
			double  avg = dis.readDouble();
			System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 합계 %d, 평균: %.2fn"
					, name,kor,eng,math,sum,avg);
		}
	}
}



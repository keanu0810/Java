package com.kh.practice.Audition.model.vo;

public class Audition {
	//�ʵ�
		//�޼���
		private String name;
		private String vlaue;
		private int score;
		private boolean passed;
		
		//setter
		public void setName(String name) {
			this.name = name;
		}
		public void setVlaue(String vlaue) {
			this.vlaue = vlaue;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public void setPassed(boolean passed) {
			this.passed = passed;
		}
		
		//getter
		public String getName() {
			return name;
		}
		public String getVlaue() {
			return vlaue;
		}
		public int getScore() {
			return score;
		}
		public boolean isPassed() {
			return passed;
		}

		//������ : �⺻
		public Audition() {
			
		}
			//������ : �ʼ�
		public Audition(String name, String vlaue, int score, boolean passed) {
			
		}
			//void
		public void information() {
			System.out.println("�̸� : " + name);
			System.out.println("�о� : " + vlaue);
			System.out.println("���� : " + score);
			System.out.println("�հ����� : " + passed);
		}
	}


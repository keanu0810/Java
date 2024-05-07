package com.kh.practice.Audition.model.vo;

public class Audition {
	//필드
		//메서드
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

		//생성자 : 기본
		public Audition() {
			
		}
			//생성자 : 필수
		public Audition(String name, String vlaue, int score, boolean passed) {
			
		}
			//void
		public void information() {
			System.out.println("이름 : " + name);
			System.out.println("분야 : " + vlaue);
			System.out.println("점수 : " + score);
			System.out.println("합격유무 : " + passed);
		}
	}


package com.kh.ThreadEx;

//Thread 클래스 가져오는 작업 진행
public class ThreadEx2 extends Thread {
//필드
	int 초;

//메서드
	// 생성자 : 필수
	public ThreadEx2(int ch) {
		this.초 = 초;
	}

	// void run
	public void run() {
		System.out.println(this.초 + "스레드 시작중~~");
		
		try {
			 // 1초 대기이긴 하지만 사이에 문제가 발생할 수 있기 떄문에 1초 대기에 예외를 걸어줌
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(this.초 + "스레드 종료중");
	}
}

package com.kh.RunnbleEx;
					//implements Runnable
public class 러너블연습 implements Runnable{
//필드 int 초 ;
	int 초 ;

//메서드
	//필수생성자
	public 러너블연습(int 초) {
		super();
		this.초 = 초;	
	}
	//void run() sleep 1000 초 try catch this.초 +"스레드 시작"
	@Override	//Runnable 인터페이스 run() 은 반드시 작성해줘야 하는 메서드
	public void run() {
		System.out.println(this.초 +"스레드 시작");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(this.초 + "스레드종료");
	}
	//this.ch + 스레드 종료
}
	


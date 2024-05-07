package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEX {
	//기본 메서드
	
	// LoopForEX 에서 출력하길 원한다면
	// public static void guguDan 으로 static을 추가해준 다음에
	// public static void main(String[] args {
	// guguDan();
	// }
	// static 을 붙이지 않고 출력하길 원한다면
	// 출력용 클래스를 만들어서 출력하기 LoopForRun
	// 종료를 하기 전까지 반복해서 출력
	public void guguDan() {
		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 츌력하기
		Scanner sc =  new Scanner(System.in);
		System.out.println("구구단 세걔로 오신 것을 환영합니다.");
		
		// 구구단을 0을 입력하기 전까지 반복해서 출력하기
		// 반복하기 위해서 while문 사용
		while(true) {
			System.out.println("종료를 원하면 0 입력해 주세요");
			System.out.println("원하는 수를 입력해 주세요");
			int dan = sc.nextInt();
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + "단 *" + i + " = " + (dan*i));
			}
			// 만약에 숫자 0이 들어오면 프로그램 종료하기
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//받은 수를 for 문 이용해서 출력
		}
	}

	//구구단 입력 받아 거꾸로 출력하기
	public void guguDan2() {
		// 1. 스캐너로 구구단 값 입력받기
		// 2. int dan = sc.intInt();
		// 3. for 문을 활용해서 9번부터 1번까지 출력하기
		//	for (int a = 1; 조건 ; a--) {
		//	System.out.println(거꾸로 출력하기);
		// }
		
		// 4 종료를 원할경우 0을 입력해주면 종료하기 while문 추가하기. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("거꾸로 세걔로 오신 것을 환영합니다.");
		while(true) {
			System.out.println("원하는 수를 입력해 주세요");
			System.out.println("종료를 원하면 0 입력해 주세요");
			int dan = sc.nextInt();
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // for while switch 사용 if 단독x
			}
			// contiue 자주 사용되지 않음
			// if 1 ~ 9까지만 입력 가능하도록 조건
			if(dan < 1 || dan >9) {
				System.out.println("1부터 9까지의 숫자를 입력해주세요.");
			   	continue;
			}
			for (int a = 9;  a >= 1; a--) {
				System.out.println(dan + " * " + a + " = " + (dan * a));

			}
		}	
}
	
	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자를 모두 출력하세요
		// 단, 입력한 수는 1 보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요" 를 출력하세요
		
	}
	
	//구구단을 1단부터 9단까지 모두 출력
	public void guguDan3() {
		// int dan = 원하는 단만 지정해서 출력
		
		//1단 부터 9단까지 출력
		for (int dan = 1; dan <= 9; dan++) {
			System.out.println("***** "+dan+ "*****");
			//1단에서 부터 1~9 를 곱해준 값을 출력
			for(int num = 1;num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + (dan*num));
		}
			
			
		}
	}
	
	//2단 부터 9단까지 출력
	public void guguDan4() {
		for (int 단 = 2; 단 <= 9; 단++) {
			System.out.println("***** "+단+ "*****");
			for(int 숫자 = 2;숫자<= 9; 숫자++) {
				System.out.println(단 + "*" + 숫자 + "=" + (단*숫자));
		}
			
			
		}
	}
	
	public void randomNumber() {
		//Random 불러와 내가 지정한 범위에서 숫자를 램덤으로 출력하기
		Random 램덤 = new Random(); //로또 번호 생성
		//nextInt() 안에 숫자를 넣어서 어디서부터 어디사이 에서 램덤으로 숫자가 나와야 하는지
		// 범위를 지정할수 있음
		int 램덤숫자 = 램덤.nextInt(5);// 0~4사이에 숫자가 나옴
		// 숫자를 셀 때 코드 안에서는 -1~ 정수 양수 0 부터 시작
		// 램덤으로 지정한 숫자 -1
		System.out.println("램덤숫자 : " + 램덤숫자);
	}
	
	// 램덤으로 숫자 3개 출력하기 1 ~ 10 사이의 숫자
	public void randomfor() {
		//Random 호출하기
		Random ran = new Random();
		
		// 램덤숫자 3개 출력 1 ~ 10 사이의 숫자
		
		for(int num = 1; num <=3; num++) {
			//램덤으로 숫자를 만들어주기
			//								10을 적어주면 0~9
			//								10+ 1		1~10
			int randomNumber = ran.nextInt(10) +1;
			System.out.println("램덤숫자 " + num + ":" +randomNumber);
		}
	}
	
	public void randomfor2() {
		
		// 램덤으로 1 ~ 45 번호 6자리 for 문 출력
		Random ran = new Random();
		//숫자가 6자리만 출력될 수 있도록 for문을 6개까지만 허용
		for(int num = 1; num <=6; num++) {
			int lottoNumber = ran.nextInt(45) +1;
			//if 램덤 숫자가 같다면 번호를 제외하고 출력하기
			System.out.println("로또번호" + num + ": " +lottoNumber);
		}
		}
	// 1부터 10까지의 숫자 중에서 홀수만 출력하기
	//홀수 = odd
	public void OddNum() {
		for (int num = 1; num <= 10; num++) {
			//만약에 숫자가 홀수라면 출력하기
			if (num % 2 != 0 ) {
				System.out.println(num);
			}
		}
	}
	
	//짝수만 1 ~ 10 출력하기
	public void evenNum() {
		for (int even = 1; even <= 10; even++) {
			//만약에 숫자가 짝수라면 출력하기
			if (even % 2 != 1 ) {
				System.out.println(even);
			}
		}
	}
	
	//정사각형 모양의 별 출력
	public void squarseStar() {
		int star = 3;
		for (int i = 0; i < star; i++) { //한줄출력 0 1 2
			
			for (int j = 0; j < star; j++) {
				System.out.println("* ");
			}
			
			System.out.println(); //가로로 별을 출력한 다음 줄바꿈
		}
		
	}

	//정사각형 모양의 별 출력 가로로 5개씩 출력
	public void fiveStar() {
		int star = 5;
		//for (int = 0; i < 	5; i++)
		for (int i = 0; 1 < star; i++) {
			for(int j = 0; j < star; j++) {
				System.out.println("* ");
			}
		}
	}

	public void numberGame() {
		//숫자 맞추기 게임
		Scanner sc = new Scanner(System.in);
		
		//램덤으로 숫자 만들기
		Random random = new Random();
		int randomNumber = random.nextInt(3) + 1; //1 ~ 3
		System.out.println("숫자를 맞춰 보세요 : ");
				
		int guest = sc.nextInt(); //게스트가 입력한 숫자 가져오기
		//만약에 숫자를 맞췄다면 숫자를 맞췄습니다.
		if(guest == randomNumber) {
			System.out.println("축하합니다. !! 숫자를 맞췄습니다.");
		} else {
			System.out.println("숫자를 틀렸습니다.");
			System.out.println("정답은 : " + randomNumber + "입니다.");
			
		}
	}

	// 숫자를 맞출 떄까지 계속 문제를 풀도록 하기 while(true)
	// for 기회 2번 주기
	// if 문 수정해서 숫자값이 정답보다 작으면 숫자가 작습니다.
	// hint 숫자값이 정답보다 높으면 숫자가 너무 큽니다.
	
	//숫자를 맞출 때까지 계속 문제를 풀도록 하기 while(true)   
		//for 기회 2번 주기
		// if 문 수정해서 숫자값이 정답보다 작으면 숫자가 작습니다. 
		// hint 숫자값이 정답보다 높으면 숫자가 너무 큽니다.
	
		public void numberGame2() {
			// 랜덤으로 만들어진 숫자가 무엇인지 키보드로 맞추는 게임
			Scanner sc = new Scanner(System.in);
			
			//랜덤으로 숫자 만들기
			Random random = new Random();
			while(true) {
				int randomNumber = random.nextInt(3) + 1; //1 ~ 3
				System.out.println("숫자를 맞춰보세요!!!! ");
				//for 문 안에 공격을 몇 번까지 허용할 것인가? 공격을 2번만 허용하겠다.
				for(int attack = 1; attack <= 2; attack++) {
					System.out.print("공격을 " + attack + " 회 시도합니다 (숫자적기) :");
					int guest = sc.nextInt(); //게스트가 입력한 숫자 가져오기
				
					//만약에 숫자를 맞췄다면 숫자를 맞췄습니다. if else if
					if(guest == randomNumber) {
						System.out.println("축하합니다.!! 숫자를 맞췄습니다.!");
						break;
					//틀렸을 때 정답보다 숫자를 작게 작성했는지 숫자를 정답보다 높게 작성했는지 힌트를 줄 수 있음
					} else if (guest < randomNumber) {
						System.out.println("정답보다 입력한 숫자가 작습니다."); //
						//System.out.println("정답은 " + randomNumber + "입니다.");
					} else if (guest > randomNumber) {
						System.out.println("정답보다 입력한 숫자가 큽니다.");
					}
				}
			}
		}
	}
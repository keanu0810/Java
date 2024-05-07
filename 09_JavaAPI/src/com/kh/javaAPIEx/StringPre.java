package com.kh.javaAPIEx;

public class StringPre {
	public static void main(String[] args) {
		// substring 메서드를 사용해서 Today 추출
		String 문제1 = "Today os a beautiful day.";
		String 정답1 = 문제1.substring(0,5);
		System.out.println(정답1);
		
		// toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fun and challennging";//프로그래밍은 재믺고 도전적이다
		String 대문자 = 문제2.toUpperCase();
		System.out.println("대문자 맞나요? " + 대문자);
		
		// toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";//새로운 것을 배우는 것은 흥미로운 일이다.
		String 소문자 = 문제3.toLowerCase();
		System.out.println("소문자 맞나요? " + 소문자);
		
		// split 활용해서 문자열 " " 로 구분하기
		String 문제4 = "A good medicine tastes bitter";// 좋은 약은 쓰다.
		String[] 정답4 = 문제4.split(" ");
		for(String a : 정답4) {
			System.out.println(a);
		}
		
		// replace 활용해서 more 을 less 로 대체
		String 문제5 = "The more, the better"; // 이 문제는 많을수록 좋다
		String 변경 = 문제5.replace("more", "less");
		System.out.println(변경);
		
		// charAt 사용해서 6번쨰 글자를 가져오기
		String 문제6 = "Walls have ears";// 벽에도 귀가 있다.
		char ch = 문제6.charAt(6);
		System.out.println(ch);
		
		//substring 메서드를 사용해서 his부터 끝까지 추출
		String 문제7 = "Evary dog has his day";// 하찮은 개에게도 그의 날이있다.
		String 정답7 = 문제7.substring(14);
		System.out.println(정답7);
		
		
		
	}
}

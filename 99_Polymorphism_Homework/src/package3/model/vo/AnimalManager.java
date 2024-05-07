package package3.model.vo;

import java.util.Random;

public class AnimalManager {
	public static void main(String[] args) {
		// 사이즈 5짜리 Animal 타입의 객체 배열생성하여 각
		Animal[] animals = new Animal[5];
		// 무작위로
		Random random = new Random();

		for (int i = 0; i < animals.length; i++) {
			// 만약에 랜덤으로 true false 를 가져오게 한 다음 true 면 강아지
			// 멍멍이 이름을 지어줄 떄는 멍멍이1 멍멍이2 "멍멍이" + 뒤에오는 숫자
			// 강아지 종은 개 강강잊 몸무게는 1~30kg 까지 측정
			if (random.nextBoolean()) {
				animals[i] = new Dog("멍멍이" + i, "개", random.nextInt(30) + 1);
			} else {
				animals[i] = new Cat("야옹이" + i, "고양이;", "집", "검은색");
			}
			// System.out.println(animals[0]);

			// false 면 고양이 를 칸에 넣을 예정
		}
		for (Animal a : animals) {
			a.speak();
		}
		/*
		 * 인덱스별로 무작위로 Dog, Cat 클래스를 이용하여 객체 생성하고 반복문으로 각 인덱스별 객체의 speak() 메소드 실행
		 */
	}
}

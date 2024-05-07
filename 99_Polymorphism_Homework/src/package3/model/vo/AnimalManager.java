package package3.model.vo;

import java.util.Random;

public class AnimalManager {
	public static void main(String[] args) {
		// ������ 5¥�� Animal Ÿ���� ��ü �迭�����Ͽ� ��
		Animal[] animals = new Animal[5];
		// ��������
		Random random = new Random();

		for (int i = 0; i < animals.length; i++) {
			// ���࿡ �������� true false �� �������� �� ���� true �� ������
			// �۸��� �̸��� ������ ���� �۸���1 �۸���2 "�۸���" + �ڿ����� ����
			// ������ ���� �� ������ �����Դ� 1~30kg ���� ����
			if (random.nextBoolean()) {
				animals[i] = new Dog("�۸���" + i, "��", random.nextInt(30) + 1);
			} else {
				animals[i] = new Cat("�߿���" + i, "�����;", "��", "������");
			}
			// System.out.println(animals[0]);

			// false �� ����� �� ĭ�� ���� ����
		}
		for (Animal a : animals) {
			a.speak();
		}
		/*
		 * �ε������� �������� Dog, Cat Ŭ������ �̿��Ͽ� ��ü �����ϰ� �ݺ������� �� �ε����� ��ü�� speak() �޼ҵ� ����
		 */
	}
}

package com.kh.variable.pre;

public class EnumPre {
//�ʵ�
	// enum ������ {��~��};
	enum ������ {
		��, ��, ��, ��, ��, ��, ��
	};

	enum �Һ��� {
		�л�, ������, ������
	};

	enum �Ǹ��� {
		�Ҹž�, ���ž�, �߸ž�
	};
	// enum���� �Һ��� {�л�, ������, ������}
	// enum���� �Ǹ��� {�Ҹž�, ���ž�, �߸ž�}

//������ : �ʼ�
	public EnumPre() {
	}

//�޼���
	// void
	public void �޼���1() {
		// �迭�� ���
		������[] �迭 = ������.values();
		// for -each���� ����ϱ�
		for (������ �� : �迭) {
			System.out.println(��);
		}

	}

	public void �޼���2() {
		// void �޼���2 �� ���� �Һ��ڿ� �Ǹ��ڸ� for-each ����ؼ� ���� ���
		System.out.println("�Һ���");
		�Һ���[] �迭 = �Һ���.values();
		�Ǹ���[] �迭1 = �Ǹ���.values();
		for (�Һ��� �� : �迭) {
			System.out.println(��);
		}
		System.out.println("===�Ǹ���===");
		�Ǹ���[] �Ǹ��ڵ� = �Ǹ���.values();
		for(�Ǹ��� �� : �Ǹ��ڵ�) {
			System.out.println(��);

		}
		// �Һ��� �л� �Ǹ��� �Ҹž� ordinal() if�� ����ؼ� ���ϴ� ������ �޼���2 �ۼ�
		�Һ��� c = �Һ���.�л�;
		�Ǹ��� s = �Ǹ���.�Ҹž�;
		if(c.ordinal() > s.ordinal()) {
		
		System.out.println("�Һ����� ����� �� �����ϴ�.");
		}else if (c.ordinal() ==s.ordinal()) {
			System.out.println("�Һ��ڿ� �Ǹ� ����� �����ϴ�.");
		}else {
			System.out.println("�Ǹ����� ����� �� �����ϴ�.");
		}
	}

	// ���θ޼���
	public static void main(String[] args) {

	}

	// ��ٱ��� = �迭�� ���
	������[] �迭 = ������.values();
	{ // enum���� �ۼ��� ���� ������ ��
		// for-each
		for (������ �� : �迭) {
			System.out.println(��);
		}
	}
	// ��~�� ���
}
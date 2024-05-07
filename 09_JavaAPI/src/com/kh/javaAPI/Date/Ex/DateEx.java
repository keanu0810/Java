package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 Date : Ư�� ��¥�� �ð��� ��Ÿ���� Ŭ����
 Calendar : ��¥�� �ð��� �����ϴµ� ���Ǵ� �߻�Ŭ����
 GregorianCalender = �׷������� ����ؼ� ��¥�� �ð��� ���
 SimpleDateFormat = ��¥�� �ð��� �������� �����ְ� �װ��� ���
 LocalDate 
 KST = Korean Standard Time
 * */
public class DateEx {
	public static void main(String[] args) {
		// 1. Date
		Date ���絥��Ʈ = new Date();
		System.out.println(���絥��Ʈ);
		// 2. Calendar
		Calendar Ķ���� = Calendar.getInstance();
		// �� �� ��
		int �� = Ķ����.get(Calendar.YEAR);
		int �� = Ķ����.get(Calendar.MARCH);// 0���� �������� ������ +1�� ����� ��
		int �� = Ķ����.get(Calendar.DAY_OF_MONTH);
		System.out.println("���� ��¥ : " + �� + "/" + (�� + 1) + "/" + ��);
		
		/*
		�׷����� �޷��� 1�� 1�� 1���� ������ �����Ϸ� ���ǵ�����
		2024, 4, 23 �� �ϸ� �ڵ����� 2024�� 5�� 23�Ϸ� ���� ��
		2024�� 5�� 23���� �����
		 * */
		
		GregorianCalendar �׷����� = new GregorianCalendar();
		GregorianCalendar �׷�����2 = new GregorianCalendar(2024, 4, 23); // 2024�� 5�� 23��
		int ��¥ = �׷�����2.get(Calendar.DAY_OF_WEEK);//��(1) ��(2) ȭ(3) ��(4) ��(5) ��(6) ��(7)
		System.out.println("��¥ : " + ��¥);// 5�� 23���� ������̱� ������ 5��� ������ ��
		
		/* 4. SimpleDateFormat �� �� ��
		�� : y year
		�� : M Month (���̶� ù ���ڰ� m�� ���� ���� ������ ���� �빮�� M��
		�� : d day
		�� : H Hour (H : 0 ~23 ��		 h : ����(am)�� ����(pm)�� ������ ǥ��
		�� : m minute
		�� : s second
		
		
		���� : E E��� ���ڷ� ǥ������ ���� ǥ��ȭ �ⱸ���� ���
			���࿡ 0������ ���� �ʹٸ� EEEE �� ���
		*/
		SimpleDateFormat ��¥���� = new SimpleDateFormat("yyy-mm-dd");
				  String ��¥ǥ�� = ��¥����.format(new Date());
		
		/*
		 
		 * */
				  
		System.out.println("��¥���� �����ؼ� ǥ���ϱ� : "+ ��¥ǥ��);
		
		//5. LocalDate ���� ��¥��������
		LocalDate ���糯¥�� =  LocalDate.now();
		System.out.println("���糯¥�� : " + ���糯¥�� );
		
	}
}

package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatePre {

	public static void main(String[] args) {


		// 1. yyy-MM-dd
		SimpleDateFormat ��¥1 = new SimpleDateFormat("yyy-MM-dd");
		String ��¥ǥ�� = ��¥1.format(new Date());
		System.out.println("��¥ : " + ��¥ǥ��);
		// 2. HH:mm:ss
		SimpleDateFormat �ð� = new SimpleDateFormat("HH:mm:ss");
		String �ð�ǥ�� = �ð�.format(new Date());
		System.out.println("�ð� : " + �ð�ǥ��);
		// 3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat ����¥ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ����¥ǥ�� = ����¥.format(new Date());
		System.out.println(����¥ǥ��);
		
		//4.SimpleDateFormat ����¥ = E �� ����ؼ� ���� ��Ÿ����
		SimpleDateFormat ��¥�ð�2 = new SimpleDateFormat("EEEE");
		String ���ڷε����ͺ���2 = ��¥�ð�2.format(new Date());
		System.out.println(���ڷε����ͺ���2);
	}

}

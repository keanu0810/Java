package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatePre {

	public static void main(String[] args) {


		// 1. yyy-MM-dd
		SimpleDateFormat 날짜1 = new SimpleDateFormat("yyy-MM-dd");
		String 날짜표시 = 날짜1.format(new Date());
		System.out.println("날짜 : " + 날짜표시);
		// 2. HH:mm:ss
		SimpleDateFormat 시간 = new SimpleDateFormat("HH:mm:ss");
		String 시간표시 = 시간.format(new Date());
		System.out.println("시간 : " + 시간표시);
		// 3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 연날짜 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 연날짜표시 = 연날짜.format(new Date());
		System.out.println(연날짜표시);
		
		//4.SimpleDateFormat 연날짜 = E 를 사용해서 요일 나타내기
		SimpleDateFormat 날짜시간2 = new SimpleDateFormat("EEEE");
		String 글자로데이터변경2 = 날짜시간2.format(new Date());
		System.out.println(글자로데이터변경2);
	}

}

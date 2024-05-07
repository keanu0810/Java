package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	public static void main(String[] args) {
		// www.google.com 호스트명과 IP 주소 가져오기

		try {
			InetAddress 주소 = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : " + 주소.getHostName());
			System.out.println("IP주소 : " + 주소.getHostAddress());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

		// 나의 컴퓨터 이름과 자리번호 확인하기
		// get localhost
		
		try {
			InetAddress 내컴 = InetAddress.getLocalHost();
			System.out.println("내컴 이름 : " + 내컴.getLocalHost());
			System.out.println("내컴 자리 : " + 내컴.getLoopbackAddress());
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//www.facebook.com 페이스북 호스트이름 호스트 주소
		try {
			InetAddress 페북주소 = InetAddress.getByName("www.facebook.com");
			System.out.println("호스트명 : " + 페북주소.getHostName());
			System.out.println("호스트주소 : " + 페북주소.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//www.instagram.com 인스타그램 호스트이름 호스트주소 검색
		try {
			InetAddress 인별주소 = InetAddress.getByName("www.instagram.com");
			System.out.println("호스트명 : " + 인별주소.getHostName() );
			System.out.println("호스트주소 : " + 인별주소.getHostAddress() );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

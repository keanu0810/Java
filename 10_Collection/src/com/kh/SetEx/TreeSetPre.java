package com.kh.SetEx;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetPre {
//과일들 String "키위 복숭아 참외 수박 딸기"

	public static void main(String[] args) {
		String[] 과일바구니 = new String[] { "키위", "복숭아", "참외", "수박" };

		TreeSet<String> 과일들 = new TreeSet<>();
		과일들.addAll(Arrays.asList(과일바구니));
		과일들.add("딸기");

		// 복숭아 제거

		// 수박이 포함되어있는지 확인
		System.out.println(과일들.contains("수박"));
		// 과일들 이 비어있는지 확인
		System.out.println(과일들.isEmpty());
		// 과일들 개수
		System.out.println(과일들.size());
		// 가장 작은 값
		System.out.println("가장작은 값 : " + 과일들.first());
		// 가장 큰 값
		System.out.println("가장큰 값 : " + 과일들.last());
		// 모든 값 제거
		과일들.comparator();
		System.out.println("모두보기 : " + 과일들);
		// 모든값 제거 되었는지 확인
	}

}
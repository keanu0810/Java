package com.kh.SetEx;

import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
		/*
		 * String,String 으로 "apple", "사과" "banana", "바나나" "orange", "오렌지" "grape", "포도"
		 * "watermelon", "수박" [] for 문을 활용해서 추가
		 * 
		 * 전체출력 get 사용해서 banana에 해당하는 값 가져오기 size 확인 isEmpty 비어있는지 확인 containsKey 키가
		 * 존재하는지 확인 grape containsValue 값이 존재하는지 확인 포도 keySet() 모든 키 출력 Values() 모든 값 출력
		 * firstKey() 첫번쨰 키 lastKey() 마지막키 출력
		 */

		TreeMap<String, String> 과일바구니 = new TreeMap<>();

		String[] 키 = { "apple", "banana", "orange", "grape", "watermelon" };

		String[] 벨류 = { "사과", "바나나", "오렌지", "포도", "수박" };

		for (int i = 0; i < 키.length; i++) {
			과일바구니.put(키[i], 벨류[i]);

		}

		System.out.println(과일바구니);
		System.out.println(과일바구니.get("banana"));
		System.out.println(과일바구니.size());
		System.out.println(과일바구니.isEmpty());
		System.out.println(과일바구니.containsKey("grape"));
		System.out.println(과일바구니.containsValue("포도"));
		System.out.println(과일바구니.firstKey());
		System.out.println(과일바구니.lastKey());
		과일바구니.clear();
		System.out.println(과일바구니);

	}
}

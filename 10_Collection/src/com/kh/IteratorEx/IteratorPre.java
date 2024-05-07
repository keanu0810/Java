package com.kh.IteratorEx;

import java. util.*; //java 폴더 밑에 util폴더 안에 전부 가져오는 것
/*
 * 파일 위치를 가져올 때 
 * 동일한 폴더 위치에서 많은 파일을 가져올 떄는
 * * 사용해서 모두 가져오기를 해준다.
 			* 전채선택 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
*/
public class IteratorPre {
	public static void main(String[] args) {
		//100, 10, 20, 30, 50, 70
		//ArrayList<숫자> 숫자들 = new ArrayList<>();
		ArrayList<Integer> 숫자들 = new ArrayList<>(Arrays.asList(100, 10, 20, 30, 50));
		//숫자를 추가하는 방법 1탄
		
		//숫자들.add(100);
		숫자들.add(70);
			
		//Iterator 생성
		Iterator<Integer> 반복하기 = 숫자들.iterator();
		
		//while문 사용해서 hasNext()로 다음 요소가 있는지 확인하고
		while(반복하기.hasNext()) {
			//next()로 출력하기
			int 반복결과 = 반복하기.next();
			System.out.println(반복결과);
		}
		
		
	}
}

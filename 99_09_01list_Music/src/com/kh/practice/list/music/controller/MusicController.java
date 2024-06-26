package com.kh.practice.list.music.controller;

import java.util.*;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	//음악 목록
	List<Music> list = new ArrayList<>();
	
	//음악 추가 
	public int addList(String title, String singer) {
		// 		Music 객체에 넣어줘야 함
		//							DB 추가에 성공하면 1 실패하면 0
		//				만약에 추가성공이 		?		 true : false
		return list.add(new Music (title, singer)) ? 	1 : 	0;
	}
	
	public int addAtZero(String title, String singer) {
		//목록에 추가하는데 맨 앞에다가 다시 새로 자리값을 만들고
		//내가 추가하는 ㄱ밧이 무조건 0 자리가 될 수 있도록 추가
		list.add(0, new Music(title, singer));
		return 1;
	}
	//모든
	public List<Music> printAll(){
		return list;
	}
	
	
	public Music searchMusic(String title) {
		//for - each 문 사용해서
		for(Music music : list) {
			//만약에 내가 원하는 제목이 들어오면
			if( title.equals(music.getTitle())) {
				return music;			
			}
			
		}
		return null;
	}
	//음악 삭제
	public void removeMusic(String title) {
		list.remove(title);
	}
	//음악 수정
	
	public Music setMusic(String title, String singer) {
		//for-each 내가원하는 제목과 가수가 있는지 확인!
		for(Music music : list) {
			if(music.getTitle().endsWith(title) ) {
				//music.setTitle(title);
				music.setSinger(singer);
				return music;
			}
		}
		return null;
	}
	
	//오름차순
	public void ascTitle() {
		Collections.sort(list);
	}
	
	//내림차순
	
	public void dscTitle() {
		Collections.sort(list, new AscTitle());
	}
}


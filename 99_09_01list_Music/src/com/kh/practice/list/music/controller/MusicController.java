package com.kh.practice.list.music.controller;

import java.util.*;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	//���� ���
	List<Music> list = new ArrayList<>();
	
	//���� �߰� 
	public int addList(String title, String singer) {
		// 		Music ��ü�� �־���� ��
		//							DB �߰��� �����ϸ� 1 �����ϸ� 0
		//				���࿡ �߰������� 		?		 true : false
		return list.add(new Music (title, singer)) ? 	1 : 	0;
	}
	
	public int addAtZero(String title, String singer) {
		//��Ͽ� �߰��ϴµ� �� �տ��ٰ� �ٽ� ���� �ڸ����� �����
		//���� �߰��ϴ� ������ ������ 0 �ڸ��� �� �� �ֵ��� �߰�
		list.add(0, new Music(title, singer));
		return 1;
	}
	//���
	public List<Music> printAll(){
		return list;
	}
	
	
	public Music searchMusic(String title) {
		//for - each �� ����ؼ�
		for(Music music : list) {
			//���࿡ ���� ���ϴ� ������ ������
			if( title.equals(music.getTitle())) {
				return music;			
			}
			
		}
		return null;
	}
	//���� ����
	public void removeMusic(String title) {
		list.remove(title);
	}
	//���� ����
	
	public Music setMusic(String title, String singer) {
		//for-each �������ϴ� ����� ������ �ִ��� Ȯ��!
		for(Music music : list) {
			if(music.getTitle().endsWith(title) ) {
				//music.setTitle(title);
				music.setSinger(singer);
				return music;
			}
		}
		return null;
	}
	
	//��������
	public void ascTitle() {
		Collections.sort(list);
	}
	
	//��������
	
	public void dscTitle() {
		Collections.sort(list, new AscTitle());
	}
}

package com.kh.practice.list.music.model.vo;
				//�������̽� ȣ�� �� �� implements
public class Music implements  Comparable<Music>{
//�ʵ�
	private String title;
	private String singer;
//�޼���
	//Settre
	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	//Getter
	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	//������ : �⺻
	public Music() {
		
	}
	//������ : �ʼ�
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	// ����̳� ���� ������ ���� ���
	//String ���� �������ִ� ���� ���� ����
	public String toString() {
		return "���:" + title +",������ : " + singer;
	}
	
	//soet compareTo ���� ������ ���������!
	@Override //��������
	public int compareTo(Music o) {
		return this.title.compareTo(o.title);
	}

}
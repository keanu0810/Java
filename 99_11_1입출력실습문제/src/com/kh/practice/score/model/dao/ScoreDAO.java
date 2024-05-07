package com.kh.practice.score.model.dao;

import java.io.*;

public class ScoreDAO {
	private final String FILE_PATH = "score.txt";

	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		
		//try로 시작하기 전에 정의를 내리고 들어가겠다
		try {DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH));
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			
			System.out.println("점수가 성공적으로 저장되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public DataInputStream readScore() throws FileNotFoundException {
		return new DataInputStream(new FileInputStream(FILE_PATH));
	}


}

package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	//원본이미지 pigs.jpg	pigs_cute.jpg 	가로 =400 =200
	public static void main(String[] args) {
		String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
		String 사이즈조정이미지 = "src/com/kh/imageEx/pigs_cute.jpg";
		
		int 가로크기 = 400;
		int 세로크기 = 200;
		
		try {
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			
			BufferedImage 크기조정이미지 = new BufferedImage(가로크기, 세로크기, BufferedImage.TYPE_INT_RGB);
			
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로크기,세로크기, Image.SCALE_SMOOTH);
			
			크기조정이미지.createGraphics().drawImage(이미지그리기, 0, 0, null);
			
			ImageIO.write(크기조정이미지, "jpg",new File(사이즈조정이미지));
			
			System.out.println("이미지 조정 성공.");
		} catch (IOException e) {
			
			System.out.println("이미지 저장 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
		
		//e.printStackTrace(); 프린트 출력으로 오류 확인
	}
}  
package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	//�����̹��� pigs.jpg	pigs_cute.jpg 	���� =400 =200
	public static void main(String[] args) {
		String �����̹��� = "src/com/kh/imageEx/pigs.jpg";
		String �����������̹��� = "src/com/kh/imageEx/pigs_cute.jpg";
		
		int ����ũ�� = 400;
		int ����ũ�� = 200;
		
		try {
			BufferedImage �����̹��������� = ImageIO.read(new File(�����̹���));
			
			BufferedImage ũ�������̹��� = new BufferedImage(����ũ��, ����ũ��, BufferedImage.TYPE_INT_RGB);
			
			Image �̹����׸��� = �����̹���������.getScaledInstance(����ũ��,����ũ��, Image.SCALE_SMOOTH);
			
			ũ�������̹���.createGraphics().drawImage(�̹����׸���, 0, 0, null);
			
			ImageIO.write(ũ�������̹���, "jpg",new File(�����������̹���));
			
			System.out.println("�̹��� ���� ����.");
		} catch (IOException e) {
			
			System.out.println("�̹��� ���� �� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
		
		//e.printStackTrace(); ����Ʈ ������� ���� Ȯ��
	}
}  
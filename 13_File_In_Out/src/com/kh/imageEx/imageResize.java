package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 Buffereddimage : �̹��� �����͸� �����ϰ� ó���ϴµ� ���
 
 Image : �������̽��� �̹����� ǥ���Ѥ� �߻�ȭ�� ������ ����
 
 ImaageIO : �̹����� ���Ϸκ��� �а� ����ϴ� �̹��� In Out
 * */
public class imageResize {
	public static void main(String[] args) {
		//���� �̹��� ���
		String �����̹��� = "src/com/kh/imageEx/marley.jpg";
		String �����������̹��� = "src/com/kh/imageEx/marley_cute.jpg";
		
		
		//�̹��� ���� ���� ũ�� ����
		int ����ũ�� = 200;
		int ����ũ�� = 200;
		
		//�����̹����� ���ؼ� �̹��� �ҷ�����
		//java.awt.image.BufferedImage  javax.imageio.ImageIO java.io.File;
		try {
			BufferedImage �����̹��������� = ImageIO.read(new File(�����̹���));
			
			//���ο� ũ���� �̹��� ����
			BufferedImage ũ�������̹��� = new BufferedImage(����ũ��, ����ũ��, BufferedImage.TYPE_INT_RGB);
			
			//�̹��� ũ�⸦ �����ؼ� ���ο� �̹����� �׸��� ��������
			
			Image �̹����׸��� = �����̹���������.getScaledInstance(����ũ��,����ũ��, Image.SCALE_SMOOTH);
			
			ũ�������̹���.createGraphics().drawImage(�̹����׸���, 0, 0, null);
			
			//���� ���� �̹����� ���Ϸ� �����ϱ�
			ImageIO.write(ũ�������̹���, "jpg",new File(�����������̹���));
			
			System.out.println("�̹��� ���� ����.");
		} catch (IOException e) {
			
			System.out.println("�̹��� ���� �� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
	}
}
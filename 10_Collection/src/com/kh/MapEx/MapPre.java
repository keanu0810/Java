package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	//�⺻���� ctrl spae enter
	public MapPre() {
		// TODO Auto-generated constructor stub
	}
	
	//void�޼��� ����
	public void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "���׸���");
		map.put(3, "��Ƽ�����ٺ�ť��");
		map.put(1, "�����̽ý�����");
		System.out.println(map);
	}
	
	public void practice2() {
		//�ڷ��� �ֵ� �ǰ� �� �־ ��
		Map<String,String> map = new HashMap<String,String>();
		//map.put �� Ȱ���ؼ� �п�-����� ������ ���-����� ���Ǳ� �Ե�Ÿ�� �����-���ı�
		map.put("�п�", "����� ������");
		map.put("���", "����� ���Ǳ�");
		map.put("�Ե�Ÿ��", "����� ���ı�");
		
		//��ü��� System.out.println();
		System.out.println(map);
		
		//get �̿��ؼ� �Ե�Ÿ���� ��� �ִ��� ���
		System.out.println("�Ե�Ÿ��");
		
		//remove Ȱ���ؼ� ��� �����ϱ�
		map.remove("���");
		//��ü���
		System.out.println(map);
		
		//for-eact keySet() Ȱ���ؼ� 
		for(String m :map.keySet()) {
			String ��Ī = map.get(m);
			System.out.println(��Ī +" - " + m);
		}
	}
	
	public void practice3() {
		//Ư�� ���� �����ϴ��� Ȯ��
		//String Integer ���� - ����
		Map<String, Integer> map = new HashMap<>();
		map.put("���", 100);
		map.put("�ٳ���", 200);
		map.put("ü��", 300);
		
		//200�� ¥�� ������ �������ϴ°�?
		System.out.println("200�� ������ �����ϴ°�? : " + map.containsKey(200));
		//contalnsValue �� containsKey ��� true false ������ ������
		
		//ü�� ������ �����ϴ°� ?
		System.out.println("�丮�� �ֳ��� ? : " + map.containsKey("ü��"));
		
		//ũ����ȸ
		System.out.println("���� map�� ũ�� : " + map.size());
		
	}
	
	public void practice4() {
		//������ map
		Map<Integer, String> map = new HashMap<>();
		//put �� �̿��ؼ� 1-���׸��� 2-��Ƽ�����ٺ��� 3-������ũ��ġ�� 4-�����̽ý�����
		map.put(1, "���׸���");
		map.put(2, "��Ƽ�����ٺ�ť");
		map.put(3, "������ũ��ġ��");
		map.put(4, "�����̽ý�����");
	
		//get �� �̿��ؼ� 3���� ���� ����ִ��� Ȯ��
		System.out.println(map.get(3));
		//size() �� �̿��ؼ� �� �޴��� ����� Ȯ��
		System.out.println(map.size());
		//remove Ȱ���ؼ� 4���� ������
		map.remove(4);
		System.out.println(map);
		//isEmpty() map�� ����ִ��� Ȯ��
		System.out.println(map.isEmpty());//������� �ʱ� ������ false
		//keySet()�̿��ؼ� for-each ��� ����
		for(int 	num : map.keySet()) {
			String �޴��̸� = map.get(num);
			System.out.println(�޴��̸�);
			//Map.Entry Ű - ���� ���ÿ� �������� ��� �ڿ��� ������.entrySet()
			for(Map.Entry<Integer, String> 	e : map.entrySet()) {
				System.out.println(e.getKey() + " - " + e.getValue());
			}
			//clear() ��������
			map.clear();
		}
		
	}
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		//mp.practice1();
		//mp.practice2();
		mp.practice3();
	}
}

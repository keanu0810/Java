package com.kh.InOut;
/*
 ũ���� �ȿ� �̸��� �ٸ� Ŭ������ ����
 * */
public class InnerClassOutClass {
	
		private int ���� = 10;
	
		//�⺻������
		public InnerClassOutClass() {
			
		}
		
		//����Ŭ���� �����
		class InnerClass{
			void �ۿ��������ֱ�() {
				System.out.println("���ں��� : " + ����);
			}
		}
		public static void main(String[] args) {
			InnerClassOutClass �ξƿ� = new InnerClassOutClass();
			InnerClassOutClass.InnerClass �� = �ξƿ�.new InnerClass();
			��.�ۿ��������ֱ�();
		}
	}



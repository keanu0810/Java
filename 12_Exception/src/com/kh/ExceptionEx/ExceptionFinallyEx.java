package com.kh.ExceptionEx;
/*
 Exception ���� try catch finally
 
try ctrl space catch finally

try {
	//���ܰ� �߻��� �� ������ �����ϴ� �ڵ�

} catch(Exception e) {
	//���ܰ� ���ܼ� ����̳� �����ϴ� �ڵ�

} finally {
	//���� �߻��� ������� ������ �����ϴ� �ڵ�
	//���� �ݱ�, ���� ���� ��

}
 
 */
public class ExceptionFinallyEx {
	public static void main(String[] args) {
		try {
			int ��� = 10 /0 ;
			

		} catch (Exception e) {
			System.out.println("���� 0�� �ȵ˴ϴ�. ^^! ");
		} finally {
			
			System.out.println("���� �̸� ������~~!");
			}
	
		
		}
	}



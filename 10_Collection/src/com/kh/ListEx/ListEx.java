package com.kh.ListEx;

import java.util.ArrayList;
import java.util.List;

/*List : �ڷḦ ���������� ������ �ڷ� ����(�迭�� ���)
	�ε����� ������
	�ε����� ������ ���еǱ� ������ �ߺ� ������ ���� ����
	�������̽� ��ü�� ������ �Ұ����� �������� �̿��� �� ����
	
	��뿹��
		List list = new ArrayList(3); // 3ĭ ¥�� ����
		
	E(Element) : ��Ҹ� ���ϴ� ��¡���� ����(�ڷ��� X)
				== Object String Student ��
				��ü�� ������ �ʰ� ���� �� ����
	
*/
public class ListEx {
	public static void main(String[] args) {
		
		//List ��ü �����ϰ� ArrayList �ν��Ͻ� ����
		/*
		 List list = new ArrayList(3);���� List �Ѵ���
		 List<�ڷ���> list = new ArrayList(3); <>Ÿ���� ���������� �ʾ�
		 ����� ��� �߻�
		 ���࿡ ������� ���ְ� �ʹٸ� List<Object>�� �־ ����Ҽ� ����
		 Object = String Integer Boolean ��� ��� ��밡��
		 */
		List<Object> list = new ArrayList(3); // 3ĭ�� ���� �� ����
		list.add("�ƹ��ų�"); //add �� ����ؼ� �߰��� �� ����
		list.add(new Object());
		list.add(123123);
		
		list.add(false); // 3�� �ʰ��ؼ� ũ�Ⱑ �ڵ����� �þ�� ������ �����߻� X
		System.out.println(list);
	}

}

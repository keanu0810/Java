package com.kh.practce.file.model.dao;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class FileDAO {
	private Map<String, String> files = new HashMap<>();
	
	//���� �̸��� �����ϴ��� containsKey
	public boolean checkName(String file) {
		return files.containsKey(file);
		
	}
	
	//���� ���� ���� Ȯ�� put
	public void fileSave(String file, String s) {
		files.put(file, s);
		System.out.println("���� ���� �Ϸ� : " +file);
	}

	//���� ����
	public StringBuilder fileOpne(String file) {
		//������ ���� �����Ѵٸ� ����!
		if(files.containsKey(file)) {
			System.out.println("���� dufrl �Ϸ� : " +file);
			return new StringBuilder(files.get(file));
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
			return new StringBuilder();// ������ �������� ������ ������ ���� X
		}		
	}
	//���� ���� ���� 
	public void fileEdit(String file, String s) {
		if(files.containsKey(file)) {
			files.put(file,  s);
			System.out.println("����");
		}
	}

	public StringBuilder fileOpen(String file) {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.kh.practice.file.controller;

import com.kh.practce.file.model.dao.FileDAO;

public class FileController {
	// File.java FileDAO.java 
	FileDAO fd = new FileDAO();
	
	//�̸��� �����ϴ��� Ȯ���ϴ� �ڵ� �ۼ�
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	//�������� ���� �ۼ�
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
	}
	
	//���� ����
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	//���� ����
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}
}

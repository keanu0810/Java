package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//ä�� ���� ������
//port 2�ڸ� 3�ڸ� 4�ڸ� ��ǻ�Ϳ��� ������� ������ ����
public class ServerPre {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);
			
			Socket clientSocket = server.accept();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			
			String message;
			
			while((message = in.readLine()) != null) {
				System.out.println("sned : " + message);
				out.println("success : " + message);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

		public static void main(String[] args) {
			//�л� ��ü ����
			Student st = new Student();
			
			st.setName("ȫ�浿");
			st.setGrade(3);
			st.setClassroom(2);
			st.setHeight(200.5);
			st.setGender('��');
			
			//void information
			st.information();
			
		}
}

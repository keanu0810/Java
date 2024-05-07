package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

		public static void main(String[] args) {
			//切积 按眉 积己
			Student st = new Student();
			
			st.setName("全辨悼");
			st.setGrade(3);
			st.setClassroom(2);
			st.setHeight(200.5);
			st.setGender('巢');
			
			//void information
			st.information();
			
		}
}

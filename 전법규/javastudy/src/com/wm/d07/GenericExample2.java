package com.wm.d07;

public class GenericExample2 {
	public static void main(String[] args) {
		
		// ��� ����� ��û ����
		Course2.registerCourse7(new Applicant2<Person2>(new Person2()));
		Course2.registerCourse7(new Applicant2<Worker2>(new Worker2()));
		Course2.registerCourse7(new Applicant2<Student2>(new Student2()));
		Course2.registerCourse7(new Applicant2<MiddleStudent2>(new MiddleStudent2()));
		Course2.registerCourse7(new Applicant2<HighStudent2>(new HighStudent2()));			// ��� Person2 Ŭ������ ���
		System.out.println();
		
		// �л��� ��û ����
//		Course2.registerCourse8(new Applicant2<Person2>(new Person2()));	(x)		
//		Course2.registerCourse8(new Applicant2<Worker2>(new Worker2()));	(x)
		Course2.registerCourse8(new Applicant2<Student2>(new Student2()));
		Course2.registerCourse8(new Applicant2<MiddleStudent2>(new MiddleStudent2()));		// Student2 Ŭ���� ���
		Course2.registerCourse8(new Applicant2<HighStudent2>(new HighStudent2()));			// Student2 Ŭ���� ���
		System.out.println();
		
		// ������ �� �Ϲ��θ� ��û ����
		Course2.registerCourse9(new Applicant2<Person2>(new Person2()));
		Course2.registerCourse9(new Applicant2<Worker2>(new Worker2()));
//		Course2.registerCourse9(new Applicant2<Student2>(new Student2()));		(x)
//		Course2.registerCourse9(new Applicant2<MiddleStudent2>(new MiddleStudent2()));
//		Course2.registerCourse9(new Applicant2<HighStudent2>(new HighStudent2()));
		
		
		
	}	// main

}	// class

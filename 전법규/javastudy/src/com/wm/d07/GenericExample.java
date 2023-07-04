package com.wm.d07;

public class GenericExample {
	public static void main(String[] args) {
		
		// ��� ����� ��û ����
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));			// ��� Person Ŭ������ ���
		System.out.println();
		
		// �л��� ��û ����
//		Course.registerCourse2(new Applicant<Person>(new Person()));	(x)		
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));	(x)
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));		// Student Ŭ���� ���
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));			// Student Ŭ���� ���
		System.out.println();
		
		// ������ �� �Ϲ��θ� ��û ����
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));		(x)
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		
		
		
	}	// main

}	// class

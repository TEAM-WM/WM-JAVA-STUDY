package com.wm.d07;

public class Course2 {
	
	// ��� ����̸� ��� ����
	public static void registerCourse7(Applicant2<?> applicant2) {
		System.out.println(applicant2.kind2.getClass().getSimpleName() + "��(��) Course7�� �����");
	}
	
	// �л��� ��� ����
	public static void registerCourse8(Applicant2<? extends Student2> applicant2) {
		System.out.println(applicant2.kind2.getClass().getSimpleName() + "��(��) Course8�� �����");
	}
	
	// ������ �� �Ϲ��θ� ��� ����
	
	public static void registerCourse9(Applicant2<? super Worker2> applicant2) {
		System.out.println(applicant2.kind2.getClass().getSimpleName() + "��(��) Course9�� �����");
	}

}

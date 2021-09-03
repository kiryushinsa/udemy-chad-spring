package com.kiryushin.test.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		// �������� ������������ XML
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// �������� ��� ��������� �� xml id � ������ 
		/*
		 * �� ��� ���������� ���� ������������ CricketCoach
		 * ��� �������� �� ������ ������ ���������� Coach
		 * �� � CricketCoach 
		 * */
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// ����� ���������-���������� ������ ������ � ����������� ����� property
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getEmail());
		
		
		context.close();
	}

}

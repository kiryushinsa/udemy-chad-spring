package com.kiryushin.test.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		// загрузка конфигурации XML
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// получаем бин базируясь на xml id и классе 
		/*
		 * тк при извлечении бина используется CricketCoach
		 * нам доступны не только методы интерфейса Coach
		 * но и CricketCoach 
		 * */
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// вызов литералов-переменных внутри класса с назначением через property
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getEmail());
		
		
		context.close();
	}

}

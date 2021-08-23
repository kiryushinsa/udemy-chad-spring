package com.cmx.kiryushin.test.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("application.xml");
				
		// retrieve bean from spring container
		
		// формируем конечный класс на базе xml, делая ссылку на базовый интерфейс
		/*
		 * Coach.java - базовый интерфейс для всех видов тренеров
		 * myCoach - делает (делал) ссылку на TrackCoach т.о. создается связь и 
		 * при вызове методов бина вызываются методы TrackCoach.
		 * Демонстрация внедрения зависимости через XML (application.xml)
		 * */
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}








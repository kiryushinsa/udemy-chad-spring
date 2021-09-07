package com.kiryushin.test.learn.run;

import com.kiryushin.test.learn.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeRunDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeSycle-example-appcontext.xml");

        //retrieve bean from spring container
        Coach theCoach  = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}

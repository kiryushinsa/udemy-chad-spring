package com.kiryushin.test.learn.lesson60;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        //load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lesson60/applicationContext.xml");

        //retrieve bean from container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check equality
        boolean result = theCoach == alphaCoach;

        System.out.println("\n The same object ? - " + result);
        System.out.println("\n Memory location theCoach- " + theCoach);
        System.out.println("\n Memory location alphaCoach- " + alphaCoach);

        //closeContext
        context.close();
    }
}

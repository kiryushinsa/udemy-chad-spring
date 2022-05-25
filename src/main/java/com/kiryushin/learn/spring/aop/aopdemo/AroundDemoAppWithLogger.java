package com.kiryushin.learn.spring.aop.aopdemo;

import com.kiryushin.learn.spring.aop.service.TrafficDelayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundDemoAppWithLogger {

    private static Logger logger = Logger.getLogger(AroundDemoAppWithLogger.class.getName());


    public static void main(String[] args) {

        //read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        //get bean
        TrafficDelayService trafficDelayService = context.getBean(TrafficDelayService.class);

        logger.info("\n AroundDemoApp run ======>");
        logger.info("\n Calling trafficDelayService");
        boolean isThrowException = true;
        logger.info("\n Result trafficService: " + trafficDelayService.getTrafficWithException(isThrowException));

        logger.info("\n Finished\n");


        //close context
        context.close();
    }
}

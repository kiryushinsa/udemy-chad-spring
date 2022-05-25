package com.kiryushin.learn.spring.aop.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficDelayService {

    public String getTraffic() {

        // simulate delay
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Heavy traffic in TrafficDelayService";
    }

    public String getTrafficWithException(boolean isThrowException) {

        if (isThrowException) {
            throw new RuntimeException("Oooops exception in program");
        }


        return getTraffic();
    }
}

package com.kiryushin.test.learn;

import com.kiryushin.test.learn.coach.Coach;
import com.kiryushin.test.learn.coach.TrackCoach;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}

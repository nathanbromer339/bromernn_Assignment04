package main; 

import bicycle.Bicycle;
import car.Car;
import car.Corvette;
import rocket.Rocket;
import skateboard.Skateboard;

/**
 * Test main for the Vehicle class and the hierarchy beneath it
 * @author Nathan Bromer
 * Assignment: 04
 * Due Date: 02/08/2018
 * Course: IT2040C/ Section: 2/ Semester: Spring 2018
 */
public class Main {
	public static void main(String[] args) {
		int testPassed = 0, testFailed = 0;
		
		/* Test the Car class */
		Corvette myCorvette = new Corvette("Red", 400, 6, "manual");
		System.out.println(myCorvette.toString());
		Car car = new Car();
		if (!car.isGoing()) {
			System.out.println("Car is NOT going.");
			testPassed++;
		} else {testFailed++;}

		car.start();

		if (car.isGoing()) {
			System.out.println("Car is going as expected.");
			testPassed++;
		} else {testFailed++;}

		/* Test the Rocket class */
		Rocket rocket = new Rocket();
		if (!rocket.isGoing()) {
			System.out.println("Rocket is NOT going.");
			testPassed++;
		} else {testFailed++;}

		rocket.start();

		if (rocket.isGoing()) {
			System.out.println("Rocket is going as expected.");
			testPassed++;
		} else {testFailed++;}

		/* Test the Bicycle class */
		Bicycle bicycle = new Bicycle();

		if (!bicycle.isGoing()) {
			System.out.println("Bicycle is NOT going.");
			testPassed++;
		} else {testFailed++;}

		bicycle.start();

		if (bicycle.isGoing()) {
			System.out.println("Bicycle is going as expected.");
			testPassed++;
		} else {testFailed++;}

		/* Test the Skateboard class */
		Skateboard skateboard = new Skateboard();
		if (!skateboard.isGoing()) {
			System.out.println("Skateboard is NOT going.");
			testPassed++;
		} else {testFailed++;}

		skateboard.start();

		if (skateboard.isGoing()) {
			System.out.println("Skateboard is going as expected.");
			testPassed++;
		} else {testFailed++;}

		System.out.println(testPassed + " tests passed, " + testFailed + " tests failed.");
		System.out.println((testFailed > 0) ? "SOME TESTS FAILED." : "ALL TESTS PASSED");

	}
}

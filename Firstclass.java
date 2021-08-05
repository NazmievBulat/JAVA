

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.House;

public class Firstclass {

    @Test
    public void testMyFirstTest() {
        System.out.println("Hello, World");


    }

    @Test
    public void testNumbers() {
        int myNumber;
        myNumber = 5;

        System.out.println(myNumber);
    }

    @Test
    public void testConcantenitaion() {
        String s1 = "Who lets Dogs out !";
        String s2 = "Who Who Who!";

        String s3 = s1 + s2;

        System.out.printf(s3);

    }

    @Test
    public void testConcantenitaion02() {
        String messagePreffix = "Who lets Dogs out !";
        String messageSuffix = "Who Who Who!";
        int numberForMessage = 3;

        String s3 = messagePreffix + numberForMessage + messageSuffix;

        System.out.printf(s3);

    }

    @Test
    public void testClicks() {
        String messagePrefix = "I clicked ";
        int numberOfclicks = 5;

        String messageSuffix = " times and ";

        System.out.printf(messagePrefix + numberOfclicks + messageSuffix);
    }

    @Test
    public void testMethods() {
        String messagePrefix = "I tapped on the screen ";
        int numberOfclicks = 10;
        String messageSuffix = " times ";
        combineStringsAndNumber(messagePrefix, messageSuffix, numberOfclicks);


    }

    public void combineStringsAndNumber(String prefix, String suffix, int numberOfTimes) {
        System.out.println(prefix + numberOfTimes + suffix);
    }

    @Test
    public void testBoolean() {
        boolean b = true;
        boolean toBe = false;

        b = toBe || !toBe;

        if (b) {
            System.out.println(toBe);
        }

    }

    @Test
    public void testIfStatements() {
        boolean isElementvisible = false;

        if (isElementvisible) {
            System.out.printf("Click on the Element");

        } else {
            System.out.printf("Wait until it will be visible");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayOfintegers = {1, 2, 3, 4};


        for (int i = 0; i < arrayOfintegers.length; i++) {
            System.out.println(arrayOfintegers[i]);
        }
    }

    @Test
    public void testArrays02() {
        int[] arrayOfintegers = {124, 223, 345, 44534};
        printValueOfArray(arrayOfintegers);
    }


    public void printValueOfArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }


    }



}










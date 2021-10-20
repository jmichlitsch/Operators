package academy.learnprogramming;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result / 3;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        //result = result + 1
        result++;
        System.out.println(result);

        //result = result - 1
        result--;
        System.out.println(result);

        //result = result + 2
        result += 2;
        System.out.println(result);

        //result = result * 10
        result *= 10;
        System.out.println(result);

        //result = result / 3
        result /= 3;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // = is an assignment operator == is an equals to operator
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is not an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is supposed to happen.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double isX = 20.00d;
        double isY = 80.00d;
        double myValuesTotal = (isX + isY) * 100.00d;
        System.out.println(myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println(theRemainder);

        boolean isNoRemainer = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainer);
        if (!isNoRemainer) {
            System.out.println("Got some remainder");
        }
    }
}

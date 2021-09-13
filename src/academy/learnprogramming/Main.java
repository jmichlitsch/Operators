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
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

    }
}

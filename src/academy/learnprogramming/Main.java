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
    }
}

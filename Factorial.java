package Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
    }

    static int factorial(int num) {
        if ( num <= 1){
            return 1;
        }
        else {
            int fact = 1;
            while (num > 0){
                fact *= num;
                num -- ;
            }
            return fact;
        }

    }
}

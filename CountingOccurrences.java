package Practice;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter number:");
        int num = in.nextInt();
        System.out.println("enter:");
        int n = in.nextInt();

        int count = 0;
        while (num>0){
            int rem = num % 10 ;
            if (rem == n){
                count ++;
            }
            num = num / 10;
        }

        System.out.println("No. of occurrences: "+count);
    }
}

package Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//      Find nth fibonacci no. ( Without using recursion)
        System.out.println("Enter num:");
        int num = in.nextInt();
        int p=0;
        int n=1;
        int count =2;
        while (count<=num){
            int temp = n ;
            n += p;
            p = temp;
            count ++;
        }
        System.out.println(n);
    }
}

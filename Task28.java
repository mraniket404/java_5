// Write a function that calculates the factorial of a given number.

import java.util.*;

public class Task28 {
    public static void main(String[] args) {
        int numbers =number();
        factorial(numbers);
        System.out.println("factorial of "+ numbers + " is " + factorial(numbers));
        
    }   
    public static int number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        return num;
    }
    public static long factorial(int num){
        if (num<2) {
            return 1;
        }
        long fact = 1;
       int i = 2;
       while (i<=num) {
        fact*=i;
            i++;
       }
       return fact;
        
    }
}

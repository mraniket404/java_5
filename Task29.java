// Create a program that computes the sum of the digits of an integer.

import java.util.*;

public class Task29 {
    public static void main(String[] args) {
     int num = number();

    System.out.println(digits(num));
        
    }
    public static int number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sum of the digits of an integers");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        return num ;

    }

    public static int digits(int num){
        int sum = 0;
        while (num>0) {
            sum+= num%10;
            num/=10;
        }
        return sum;
    }
}

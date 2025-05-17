// Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.*;
public class Task27 {
    public static void main(String[] args) {
      int numbers =  number();
      sum(numbers); 
      System.out.print("Total sum of odd number is :" + sum(numbers));

    }
    public static int number (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to odd sum calsiiii");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        return num;
    }
    public static int sum(int num){
        int summ = 0;
        int i = 1;
        while (i<=num) {
            summ+=i;
            i+=2;
        }
        return summ;
    }

}

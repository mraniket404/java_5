// Develop a program that prints the multiplication table for a given number

import java.util.*;

public class Task26 {
   public static void main(String[] args) {
    
        int inputs = number();
        System.out.println(table(inputs));

   }
   public static int number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome Table printing ");
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        return number;

   }
   public static int  table(int number){
     
        int i=1;
        while (i<=10) {
          number*=i ;
          i++;
        }
        return number;
   }
}

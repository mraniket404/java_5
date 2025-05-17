// Create a program to find the Least Common Multiple (LCM) of two numbers
 import java.util.*;
public class Task30 {
    public static void main(String[] args) {
        int num = number();
        System.out.println("LCM is " +lcm(num,num));
        
    }

    public static int number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator");
        System.out.print("Enter the Frist number : ");
        int Frist = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int Second = sc.nextInt();
        int lcm = lcm(Frist,Second);
        return lcm;
    }

    public static int lcm(int Frist , int Second){
        int i = 1;
        while (true) {
            int fact = Frist*i;
            if (fact%Second==0) {
             return fact;   
            }
            i++;
        }
            
    }
}

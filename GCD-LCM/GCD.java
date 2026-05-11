// Greatest Common Divisor

import java.util.*;

class GCD{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = obj.nextInt();

        System.out.print("Enter second number: ");
        int num2 = obj.nextInt();

        int gcd = 1;

        for(int i = 1; i <= num1 && i <= num2; i++){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD is: " + gcd);
    }
}
// Least Common Multiple

import java.util.*;

class LCM{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = obj.nextInt();
        System.out.println("Enter second number: ");
        int num2 = obj.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        int lcm = max;

        while(true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM is: " + lcm);
    }
}

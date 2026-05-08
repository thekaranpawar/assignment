import java.util.*;

class SumOfDigit{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = obj.nextInt();

        int sum = 0;
        while(num != 0){
            int digit = num%10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of given number is " +sum);
    }
}
import java.util.*;

class Neon{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to check Neon or Not: ");
        int num = obj.nextInt();
        int square = num*num;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }
        if (sum == num) {
            System.out.println(num + " is Neon Number");
        } else {
            System.out.println(num + " is Not Neon Number");
        }
    }
}
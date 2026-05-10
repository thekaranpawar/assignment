import java.util.*;

class Spy{
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = obj.nextInt();
        
        int sum = 0;
        int product = 1;
        int temp = num;

        while(temp > 0){
            int digit = temp % 10;

            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }
        if(sum == product){
            System.out.println(num + " is Spy Number");
        } else{
            System.out.println(num + " is Not Spy Number");
        }
    }
}
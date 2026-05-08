import java.util.*;

class Palindrome{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = obj.nextInt();
        int org = num;
        int rev = 0;

        while(num != 0){
            int last = num%10;
            rev = rev*10 + last;
            num = num/10;
        }
        if(org==rev){
            System.out.println(org + " is a Palindrome number");
        } else{
            System.out.println(org + " is Not a Palindrome number");
        }
    }
}
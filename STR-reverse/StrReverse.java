
import java.util.*;

class StrReverse{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = obj.nextLine();

        String rev = "";

        for(int i = str.length() - 1; i >= 0; --i){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed string: " + rev);

        System.out.println("Checking "+ rev +" is Palindrome or Not: ");

        System.out.println();
        
        if(str.equalsIgnoreCase(rev)){
            System.out.println("Yes it is Palindrome String");
        } else{
            System.out.println("Not a Palindrome String");
        }
    }
}

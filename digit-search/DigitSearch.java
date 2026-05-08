
import java.util.*;
class DigitSearch{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = obj.nextInt();
        System.out.println("Enter digit to search in number: ");
        int digit = obj.nextInt();

        int count = 0;
        while(num != 0){
            int last = num%10;
            if(last == digit){
                ++count;
                break;
            }
            num = num/10;
        }
        if(count == 1){
            System.out.println("Digit Found");
        } else{
            System.out.println("Not Found");
        }

    }
}
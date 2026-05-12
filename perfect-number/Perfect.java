import java.util.*;

public class Perfect{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();

        int sum = 0;
        for(int i = 1; i < num; ++i){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println(num + " is Perfect Number");
        } else{
            System.out.println(num + " is Not Perfect Number");
        }
    }
}
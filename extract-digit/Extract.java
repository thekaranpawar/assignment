import java.util.*;

class Extract{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to extract: ");
        int num = obj.nextInt();
        
        while(num>0){
            int lastdigit = num%10;
            System.out.println(lastdigit);
            num = num/10;
        }
    }
}
import java.util.*;

class Fibonacci{
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = obj.nextInt();

        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(first);

            int next = first + second;
            first = second;
            second = next;
        }
    } 
}
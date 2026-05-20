import java.util.*;

class AllSubstring{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = obj.nextLine();

        int n = str.length();

        System.out.println("All Substrings are:");

        for(int i = 0; i < n; ++i){

            for(int j = i + 1; j <= n; ++j){

                System.out.println(str.substring(i, j));
            }
        }
    }
}
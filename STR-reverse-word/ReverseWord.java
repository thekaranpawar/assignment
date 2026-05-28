import java.util.*;

class ReverseWord{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string or sentence: ");
        String str = obj.nextLine();

        String[] words = str.split(" ");

        for(String word : words){
            String rev = "";

            for(int i = word.length() - 1; i >= 0; --i){
                rev += word.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}

import java.util.Scanner;
import java.util.Arrays;

class Anagram{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = obj.nextLine();
        System.out.print("Enter second string: ");
        String s2 = obj.nextLine();

        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagrams");
        } 
        else{
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)){
                System.out.println("Anagrams");
            } else{
                System.out.println("Not Anagrams");
            }
        }
    }
}
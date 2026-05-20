
import java.util.*;
class SmallAndLongWord{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = obj.nextLine();

        String[] words = sentence.split(" ");

        String smallest = words[0];
        String Longest = words[0];

        for(String word : words){

            if(word.length() < smallest.length()){
                smallest = word;
            }
            if(word.length() > Longest.length()){
                Longest = word;
            }
        }
        System.out.println("Smallest word: " + smallest);
        System.out.println("Longest word: " + Longest);
    }
}
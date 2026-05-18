
import java.util.*;
class Count{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a word that contain digit, word and special character: ");
        String str = obj.nextLine();

        int letters = 0, digits = 0, specials = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                ++letters;
            } else if(Character.isDigit(ch)){
                ++digits;
            } else{
                ++specials;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specials);
    }
}
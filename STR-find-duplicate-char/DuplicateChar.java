import java.util.*;
class DuplicateChar{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = obj.next();

        for (int i = 0; i < str.length(); ++i){
            int count = 1;

            for (int j = i + 1; j < str.length(); ++j){
                if (str.charAt(i) == str.charAt(j)) {
                    ++count;
                }
            }
            if (count > 1){
                System.out.println(str.charAt(i) + " : " + count);
            }
        }
    }
}
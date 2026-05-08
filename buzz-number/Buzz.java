//      check Buzz number

import java.util.*;
class Buzz{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to check Buzz or Not: ");
        int num = obj.nextInt();

        if(num%7 == 0 || num%10 == 7){
            System.out.println("This is Buzz number");
        } else{
            System.out.println("This is Not Buzz number");
        }
    }
}


//        print 1 to 100 Buzz number

// class Buzz{
//     public static void main(String args[]){

//         int i = 1;
//         while(i<=100){
//             if(i % 7 == 0 || i % 10 == 7){
//                 System.out.println(i);
//             }
//             ++i;
//         }
//     }
// }


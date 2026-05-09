import java.util.*;

class XylemPhloem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Xylem or Phloem: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int firstDigit = 0;
        int middleSum = 0;
        int temp = num / 10;

        while (temp > 0){

            if(temp < 10){
                firstDigit = temp;
            } else{
                middleSum = middleSum + (temp % 10);
            }
            temp = temp / 10;
        }
        int extremeSum = firstDigit + lastDigit;

        System.out.println("Extreme Sum = " + extremeSum);
        System.out.println("Middle Sum = " + middleSum);

        if (extremeSum == middleSum) {
            System.out.println(num + " is a Xylem Number");
        } else {
            System.out.println(num + " is a Phloem Number");
        }
    }
}
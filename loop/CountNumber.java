package loop;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your numer : ");        //  12345
        int number = kb.nextInt();
        int count=0, sum=0;
        System.out.println("Your numer is : "+number);  //  12345
        while(number > 0){
            count++;
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("The number of digits is : "+count);    //  5
        System.out.println("The sum of digits is : "+sum);          //15
    }
}

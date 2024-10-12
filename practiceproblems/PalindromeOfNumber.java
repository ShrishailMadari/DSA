package practiceproblems;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        for (int i=0; i<=3; i++){
            System.out.println("enter the number to find the Palindrome");
            long number = obj.nextLong();
            Boolean isPalindrome = palindrome(number);
            if (isPalindrome){
                System.out.println(number+" is Palindrome");
            }else {
                System.out.println(number+" is not Palindrome");
            }
            System.out.println();
        }


    }

    private static boolean palindrome(long number) {
        long originalNumber = number;
        long reversedNumber = 0;

        while (number>0){
            long digit = number%10;
            reversedNumber = reversedNumber*10 + digit;
            number = number/10;
        }

        return reversedNumber == originalNumber;
    }
}

package com.nc.practice;

import java.util.Scanner;

/**
 * @author Shad Ahmad
 *
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String input=scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)){
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while (left<right){
            char leftChar=Character.toLowerCase(str.charAt(left));
            char rightChar=Character.toLowerCase(str.charAt(right));
            if(leftChar !=rightChar){
                return false;

            }
            left++;
            right--;
        }
        return true;
    }
}

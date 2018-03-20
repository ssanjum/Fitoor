package com.example.sanjum.currencyexchange.helper;

/**
 * Created by sanjum on 3/20/2018.
 */

public class Boby {

    public boolean isPalindromeNumber(int num) {
        boolean isPalindrome = false;
        int r, sum = 0, temp;
        temp = num;
        while (num > 0) {

            r = num % 10;  //getting remainder
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            isPalindrome = true;
            System.out.println("palindrome number ");
        } else {
            System.out.println(" Not palindrome number ");
        }
        return isPalindrome;
    }
}

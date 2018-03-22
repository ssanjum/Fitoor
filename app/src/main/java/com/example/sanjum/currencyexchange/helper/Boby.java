package com.example.sanjum.currencyexchange.helper;

/**
 * Created by sanjum on 3/20/2018.
 */

public class Boby {

    public String isPalindromeNumber(int num) {
        int r, sum = 0, temp;
        temp = num;
        while (num > 0) {

            r = num % 10;  //getting remainder
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            return temp + "  is palindrom";
        } else {
            return temp + " is Not a  palindrom number";
        }

    }

    public int findFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int[] bubbleSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length - i - 2; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}

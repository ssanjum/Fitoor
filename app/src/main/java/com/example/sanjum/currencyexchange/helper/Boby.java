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

    public long findFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public String isArmStrong(int number) {
        int sum = 0, temp;
        temp = number;
        int lastdigit;
        while (number > 0) {
            lastdigit = number % 10; //getting remainder
            lastdigit = lastdigit * lastdigit * lastdigit;
            sum = sum + lastdigit;
            number = number / 10;
        }
        if (sum == temp) {
            return temp + " is " + " ArmStrong";
        } else {
            return temp + " is " + " not a ArmStrong number";
        }
    }

    public int[] bubbleSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public int[] selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min_index = i;
            for (int j = i + 1; j <= length - 1; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int small = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = small;
        }
        return arr;
    }
}

package com.sakcode.old;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 5, 9, 21, 35, 6, 4, 5, 74, 12, 54, 47};
        System.out.println("The maximun value is " + getMaximunNumber(numbers));
        System.out.println("Sum of arrays is " + getSum(numbers));
        System.out.println("Sum of even element is " + getEvenSum(numbers));
    }

    // Method - function
    static int getMaximunNumber(int[] arr) {
        int max = arr[0];
        // get max value from array
        for (int index = 1; index < arr.length; index++){
            if (arr[index] > max) {
                max = arr[index];
            }
        }
        return max;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        return sum;
    }

    static int getEvenSum(int[] arr) {
        int sum = 0;
        int index = 0;
        while (index < arr.length) {
            if (arr[index] % 2 == 0) {
                sum = sum + arr[index];
            }
            index++;
        }
        return sum;
    }
}

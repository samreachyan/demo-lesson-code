package com.sakcode.old;

public class Ex2 {
    public static void main(String[] args) {
        int[] number = {10, 3, 5, 3, 48, 2};
        System.out.println(number[1]);

        char[] words = new char[10];
        words[0] = 'S';
        words[1] = 'A';
        System.out.println(words[1]);

        char[] wordString = {'S', 'A', '2', 'n'};
//        System.out.println(wordString[6]);
        for (int i = 0; i < wordString.length; i++) {
            System.out.print(wordString[i]);
        }
        System.out.println("====");

        System.out.println();

        int [][] b = new int[5][10];
//        System.out.println(b.length);
//        System.out.println(b[0].length);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


    }
}

package com.binary;

import java.util.Scanner;

public class decimalToBinary {
    public static void toBinary(int n) {
//        array to store binary number
        int[] binary = new int[1000];
        int i = 0;
        while (n > 0) {
//            store the reminder
            binary[i] = n % 2;
            n = n / 2;
            i++;
        }
//        reverse the binary array
        for (int j = i - 1; j >= 0; j--)
            System.out.println(binary[j]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers to covert to binary : ");
        int n = sc.nextInt();
        System.out.println("binary :- ");
        toBinary(n);
    }
}

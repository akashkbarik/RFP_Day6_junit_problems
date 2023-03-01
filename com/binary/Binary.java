package com.binary;

import java.util.Scanner;

import static com.binary.decimalToBinary.toBinary;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();
        int[] binary = toBinary(n);
        System.out.println("binary is ");
        showArr(binary);
        swapNibbles(binary);
        System.out.println("after swapping value: ");
        showArr(binary);

        int swapDec = toDecimal(binary);
        System.out.println("decimal of swapped binary is " + swapDec);
        if (powerOf2(swapDec))
            System.out.println("its power of 2");
        else System.out.println("its not a power of 2");
    }


    static void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }

    static int[] swapNibbles(int[] arr) {
        int temp, j = arr.length - 4;
        for (int i = 0; i < 4; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
        return arr;
    }

    static int[] stringToIntArray(String bin) {
        int[] binary = new int[bin.length()];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = bin.charAt(i) - 48;
        }
        return binary;
    }

    static boolean powerOf2(int n) {
        int i = 0, temp = (int) Math.pow(2, i);
        while (temp < n) {
            if (temp == n) {
                return true;
            }
            i++;
        }
        return false;
    }

    static int toDecimal(int[] binary) {
        int decimal = 0, j = 0;
        for (int i = binary.length - 1; i >= 0; i--) {
            if (binary[i] == 1) {
                decimal = decimal + (int) Math.pow(2, j);
            }
            j++;
        }
        return decimal;
    }
}
package com.deepak;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}

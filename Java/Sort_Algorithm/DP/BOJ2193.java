package DP;

import java.util.Scanner;

public class BOJ2193 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        long[] a = new long[91];
        a[1] = 1;
        a[2] = 1;
        for(int j=2; j<91; j++){
            a[j] = a[j-2] + a[j-1];
        }
        System.out.print(a[i]);
    }
}

package DP;

import java.io.IOException;
import java.util.Scanner;

public class BOJ9095 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int[] a = new int[11];
        a[0] = 1; a[1] = 2; a[2] = 4;
        for(int i=3; i<11; i++){
            a[i] = a[i-3]+a[i-2]+a[i-1];
        }
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(a[s.nextInt()-1]);
        }
    }
}

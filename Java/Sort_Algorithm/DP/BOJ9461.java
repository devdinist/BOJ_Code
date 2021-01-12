package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] a = new long[101];
        a[1] = 1;
        a[2] = 1;
        a[3] = 1;
        a[4] = 2;
        a[5] = 2;
        for(int i=6; i<=100; i++){
            a[i] = a[i-1] + a[i-5];
        }
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(a[n]).append("\n");
        }

        System.out.print(sb.toString());
    }
}

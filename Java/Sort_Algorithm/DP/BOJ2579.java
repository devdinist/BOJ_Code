package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        int[] a = new int[301];
        int[] r = new int[301];

        for(int i=1; i<=c; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        r[1] = a[1];
        r[2] = a[1] + a[2];

        for(int i=3; i<=c; i++){
            r[i] = Math.max(a[i]+a[i-1]+r[i-3],a[i]+r[i-2]);
        }

        System.out.print(r[c]);
    }
}

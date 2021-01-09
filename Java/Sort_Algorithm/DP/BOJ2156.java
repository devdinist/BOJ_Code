package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] ia = new int[10001];
        int[] sa = new int[10001];
        for(int i=1; i<=size; i++){
            ia[i] = Integer.parseInt(br.readLine());
        }
        sa[1] = ia[1];
        sa[2] = ia[1] + ia[2];

        for(int i=3; i<=size; i++){
//            sa[i] = Math.max(sa[i-3] + ia[i-1] + ia[i],sa[i-2] + ia[i]);

            sa[i] = Math.max(sa[i-1],Math.max(sa[i-3] + ia[i-1] + ia[i],sa[i-2] + ia[i]));
            System.out.println(sa[i]);
        }

        System.out.print(sa[size]);
    }
}

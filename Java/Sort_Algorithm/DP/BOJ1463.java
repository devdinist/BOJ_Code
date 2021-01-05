package DP;

import java.util.Scanner;

public class BOJ1463 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[1000001];
        a[1] = 0;
        a[2] = 1;
        a[3] = 1;
        for(int i=4; i<=n; i++){
            if(i%2 != 0 && i%3 != 0){
                a[i] = a[i-1] + 1;
                continue;
            }
            if(i%2 == 0 && i%3 != 0){
                a[i] = Math.min(a[i-1],a[i/2])+1;
                continue;
            }
            if(i%2 != 0){
                a[i] = Math.min(a[i-1],a[i/3])+1;
                continue;
            }
            a[i] = Math.min(a[i-1],Math.min(a[i/2],a[i/3]))+1;
        }
        System.out.print(a[n]);
    }
}

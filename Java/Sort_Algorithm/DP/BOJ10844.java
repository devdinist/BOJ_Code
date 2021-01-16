package DP;

import java.io.*;

public class BOJ10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long mod = 1000000000L;
        int num = Integer.parseInt(br.readLine());
        long[] a09 = new long[101];    // N자리일때 1의자리가 0,9인 수
        long[] a18 = new long[101];    // N자리일때 1의자리가 1,8인 수
        long[] a27 = new long[101];    // N자리일때 1의자리가 2,7인 수
        long[] a36 = new long[101];    // N자리일때 1의자리가 3,6인 수
        long[] a45 = new long[101];    // N자리일때 1의자리가 4,5인 수

        a09[1] = 1;
        a18[1] = 2;
        a27[1] = 2;
        a36[1] = 2;
        a45[1] = 2;

        for(int i=2; i<=num; i++){
            a09[i] = a18[i-1] % mod;
            a18[i] = (a09[i-1] + a27[i-1]) % mod;
            a27[i] = (a18[i-1] + a36[i-1]) % mod;
            a36[i] = (a27[i-1] + a45[i-1]) % mod;
            a45[i] = (a36[i-1] + a45[i-1]) % mod;
        }

        bw.write((a09[num]+a18[num]+a27[num]+a36[num]+a45[num])%mod+"");
        bw.close();
        br.close();
    }


    /*  2차원 배열 사용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int mod = 1000000000;
        int num = Integer.parseInt(br.readLine());
        long[][] a = new long[101][5];

        a[1][0] = 1;
        a[1][1] = 2;
        a[1][2] = 2;
        a[1][3] = 2;
        a[1][4] = 2;

        for(int i=2; i<=num; i++){
            a[i][0] = a[i-1][1] % mod;
            a[i][1] = (a[i-1][0] + a[i-1][2]) % mod;
            a[i][2] = (a[i-1][1] + a[i-1][3]) % mod;
            a[i][3] = (a[i-1][2] + a[i-1][4]) % mod;
            a[i][4] = (a[i-1][3] + a[i-1][4]) % mod;
        }

        bw.write((a[num][0]+a[num][1]+a[num][2]+a[num][3]+a[num][4])%mod+"");
        bw.close();
        br.close();
    }
     */
}

package DP;

import java.io.*;

public class BOJ1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] za = new int[41];
        int[] oa = new int[41];

        za[0] = 1;
        za[1] = 0;
        oa[0] = 0;
        oa[1] = 1;

        for(int i = 2; i<za.length; i++){
            za[i] = za[i-1] + za[i-2];
            oa[i] = oa[i-1] + oa[i-2];
        }

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            int c = Integer.parseInt(br.readLine());
            sb.append(za[c]+" "+oa[c]+"\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

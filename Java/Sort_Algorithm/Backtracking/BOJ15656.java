package Backtracking;

import java.io.*;
import java.util.Arrays;

public class BOJ15656 {
    static int[] a;
    static int[] r;
    static int n,l;
    static StringBuilder sb = new StringBuilder();

    static void backtrack(int d){
        if(d < l){
            for(int i=0; i<a.length; i++){
                r[d] = a[i];
                backtrack(d+1);
            }
        }else{
            for(int i=0; i<r.length; i++){
                sb.append(r[i]+" ");
            }
            sb.append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = b.readLine().split(" ");
        n = Integer.parseInt(in[0]);
        l = Integer.parseInt(in[1]);
        in = b.readLine().split(" ");
        a = new int[n];
        r = new int[l];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(in[i]);
        }
        Arrays.sort(a);
        backtrack(0);
        bw.write(sb.toString());
        bw.close();
        b.close();
    }
}

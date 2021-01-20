package Backtracking;

import java.io.*;
import java.util.Arrays;

public class BOJ15657 {
    static int[] a,r;
    static boolean[] c = new boolean[10001];
    static int n,l;
    static StringBuilder sb = new StringBuilder();

    static void backtrack(int d){
        if(d < l){
            for(int i=1; i<a.length; i++){
                for(int j=i-1; j>=0; j--){
                    c[a[j]] = true;
                }
                if(!c[a[i]]){
                    r[d] = a[i];
                    backtrack(d+1);
                }
                for(int j=i-1; j>=0; j--){
                    c[a[j]] = false;
                }
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
        a = new int[n+1];
        r = new int[l];
        for(int i=0; i<n; i++){
            a[i+1] = Integer.parseInt(in[i]);
        }
        Arrays.sort(a);
        backtrack(0);
        bw.write(sb.toString());
        bw.close();
        b.close();
    }
}

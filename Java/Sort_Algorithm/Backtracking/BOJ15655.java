package Backtracking;

import java.io.*;
import java.util.Arrays;

public class BOJ15655 {
    static int[] res;
    static int[] ar;
    static boolean[] chk = new boolean[10001];
    static int num,len;
    static StringBuilder sb = new StringBuilder();
    static void backtrack(int idx){
        if(idx < len){
            for(int i=0; i<ar.length; i++){
                if(!chk[ar[i]]){
                    for(int j=i; j>=0; j--){
                        chk[ar[j]] = true;
                    }
                    res[idx] = ar[i];
                    backtrack(idx+1);
                    for(int j=i; j>=0; j--){
                        chk[ar[j]] = false;
                    }
                }
            }
        }else{
            for(int i=0; i<res.length; i++){
                sb.append(res[i]+" ");
            }
            sb.append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        num = Integer.parseInt(input[0]);
        len = Integer.parseInt(input[1]);
        ar = new int[num];
        res = new int[len];
        input = br.readLine().split(" ");
        for(int i=0; i<num; i++){
            ar[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(ar);
        backtrack(0);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

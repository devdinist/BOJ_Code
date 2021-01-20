package Backtracking;

import java.io.*;
import java.util.Arrays;

public class BOJ15654 {
    static int num,len;
    static int[] arr;
    static int[] res = new int[9];
    static boolean[] chk = new boolean[10001];
    static StringBuilder sb = new StringBuilder();

    static void backtrack(int idx){
        if(idx < len){
            for(int i=0; i<arr.length; i++){
                if(!chk[arr[i]]){
                    chk[arr[i]] = true;
                    res[idx] = arr[i];
                    backtrack(idx+1);
                    chk[arr[i]] = false;
                }
            }
        }else{
            for(int i=0; i<len; i++){
                sb.append(res[i]+" ");
            }
            sb.append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] init = br.readLine().split(" ");
        num = Integer.parseInt(init[0]);
        len = Integer.parseInt(init[1]);
        arr = new int[num];
        init = br.readLine().split(" ");
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(init[i]);
        }
        Arrays.sort(arr);
        backtrack(0);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

package Backtracking;

import java.io.*;

public class BOJ15651 {
    static int[] res = new int[8];
    static StringBuilder sb = new StringBuilder();
    static int num,len;

    static void backtrack(int idx){
        if(idx < len){
            for(int i=1; i<=num; i++){
                res[idx] = i;
                backtrack(idx+1);
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
        String[] input = br.readLine().split(" ");
        num = Integer.parseInt(input[0]);
        len = Integer.parseInt(input[1]);
        backtrack(0);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

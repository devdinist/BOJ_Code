package Backtracking;

import java.io.*;

public class BOJ15652 {
    static int res[] = new int[9];
    static boolean[] chk = new boolean[9];
    static int num,len;
    static StringBuilder sb = new StringBuilder();

    static void backtrack(int idx){
        if(idx < len){
            for(int i=1; i<=num; i++){
                for(int j=0; j<i; j++){
                    chk[j] = true;
                }
                if(!chk[i]){
                    res[idx] = i;
                    backtrack(idx+1);
                }
                for(int j=0; j<i; j++){
                    chk[j] = false;
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
        String[] input = br.readLine().split(" ");
        num = Integer.parseInt(input[0]);
        len = Integer.parseInt(input[1]);
        backtrack(0);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

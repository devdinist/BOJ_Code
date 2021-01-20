package Backtracking;

import java.io.*;

public class BOJ15649 {

    static boolean[] used_num = new boolean[9];
    static int[] res = new int[9];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void backtrack(int num, int len, int start) throws IOException{
        if(start == len){
            for(int i=0; i<len; i++){
                bw.write(Integer.toString(res[i])+" ");
                bw.flush();
            }
            bw.write("\n");
            bw.flush();
            return;
        }
        for(int i=1; i<=num; i++){
            if(!used_num[i]){
                used_num[i] = true;
                res[start] = i;
                backtrack(num,len,start+1);
                used_num[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int num = Integer.parseInt(in[0]);
        int len = Integer.parseInt(in[1]);
        backtrack(num,len,0);
        bw.close();
        br.close();
    }
}

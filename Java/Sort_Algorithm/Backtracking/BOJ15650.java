package Backtracking;

import java.io.*;

public class BOJ15650 {
    static int[] res;
    static boolean[] check;
    static int num,len;
    static StringBuilder sb;

    static void backtrack(int depth){
        if(depth < len){
            for(int i=1; i<=num; i++){
                if(!check[i]){
                    for(int j=i; j>0; j--){
                        check[j] = true;
                    }
                    check[i] = true;
                    res[depth] = i;
                    backtrack(depth+1);
                    check[i] = false;
                    for(int j=i; j>0; j--){
                        check[j] = false;
                    }
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
        res = new int[num+1];
        check = new boolean[num+1];
        sb = new StringBuilder();
        backtrack(0);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

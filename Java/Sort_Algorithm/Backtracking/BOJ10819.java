package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10819 {
    static int[] arr,tmp;
    static boolean[] v;
    static int size;
    static int max = Integer.MIN_VALUE;

    static void backtrack(int c){
        if(c == size){
            int res = 0;
            for(int i=0; i<size-1; i++){
                res += Math.abs(tmp[i]-tmp[i+1]);
            }
            max = Math.max(max,res);
            return;
        }
        for(int i=0; i<size; i++){
            if(!v[i]){
                v[i] = true;
                tmp[c] = arr[i];
                backtrack(c+1);
                v[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        arr = new int[size];
        tmp = new int[size];
        v = new boolean[size];
        String[] in = br.readLine().split(" ");
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(in[i]);
        }
        backtrack(0);
        System.out.print(max);
    }
}

package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14888 {
    static int[] arr;
    static int[] tmp;
    static int size;
    static int[] op = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    static int calc(int start,int idx){
        int v = 0;
        switch (idx){
            case 0:
                v = tmp[start-1] + arr[start];
                break;
            case 1:
                v = tmp[start-1] - arr[start];
                break;
            case 2:
                v = tmp[start-1] * arr[start];
                break;
            case 3:
                v = tmp[start-1] / arr[start];
                break;
        }
        return v;
    }

    static void back(int d){
        if(d == size){
            int v = tmp[size-1];
            max = Math.max(max,v);
            min = Math.min(min,v);
            return;
        }
        for(int i=0; i<4; i++){
            if(op[i] > 0){
                op[i]--;
                tmp[d] = calc(d,i);
                back(d+1);
                op[i]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        arr = new int[size];
        tmp = new int[size];
        String[] in = br.readLine().split(" ");
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(in[i]);
        }

        in = br.readLine().split(" ");
        for(int i=0; i<4; i++){
            op[i] = Integer.parseInt(in[i]);
        }
        tmp[0] = arr[0];
        back(1);
        System.out.println(max);
        System.out.print(min);
    }
}

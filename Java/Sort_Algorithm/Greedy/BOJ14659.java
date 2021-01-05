package Greedy;

import java.io.*;

public class BOJ14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int res = 0;
        int[] num = new int[size];

        String[] input = br.readLine().split(" ");
        for(int i=0; i<size; i++){
            num[i] = Integer.parseInt(input[i]);
        }

        for(int i=0; i<size; i++){
            int count = 0;
            for(int j=i+1; j<size; j++){
                if(num[i] >= num[j]) count++;
                else break;
            }
            res = Math.max(res,count);
        }

        System.out.print(res);
    }
}

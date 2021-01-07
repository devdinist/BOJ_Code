package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(b.readLine());
        int[] input = new int[((size*(size+1)) / 2) + 1];
        int[] dp = new int[((size*(size+1)) / 2) + 1];
        int count = 2;
        int max = 0;
        input[1] = Integer.parseInt(b.readLine());
        dp[1] = input[1];

        for(int i=2; i<=size; i++){
            boolean is_first = true;
            StringTokenizer st = new StringTokenizer(b.readLine()," ");
            while(st.hasMoreTokens()){
                input[count] = Integer.parseInt(st.nextToken());
                if(is_first){
                    dp[count] = input[count] + dp[count-(i-1)];
                    is_first = false;
                }else if(!st.hasMoreTokens()){
                    dp[count] = input[count] + dp[count-i];
                }else{
                    dp[count] = input[count] + Math.max(dp[count-i],dp[count-(i-1)]);
                }
                max = Math.max(max,dp[count]);
                count++;
            }
        }
        System.out.print(max);
    }
}

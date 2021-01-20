package DP;

import java.io.*;

public class BOJ9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        int[][] arr = new int[second.length()+1][first.length()+1];
        int m = 0;
        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr[0].length; j++){
                if(second.charAt(i-1)==first.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1]+1;
                    if(arr[i][j] > m) m = arr[i][j];
                }else{
                    arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
        System.out.print(m);
    }
}


package javacode.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chairman_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnum = Integer.parseInt(br.readLine());
        int ccount = 0;
        int[] result = new int[cnum];
        while(ccount < cnum){
            int r = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            int[][] arr = new int[r+1][c+1];
            for (int i = 0; i < c+1; i++) {
                arr[0][i] = i;
            }
            for (int i = 0; i < r+1; i++) {
                arr[i][0] = 0;
                arr[i][1] = 1;
            }
            for (int i = 1; i < r+1; i++) {
                for (int j = 1; j < c+1; j++) {
                    arr[i][j] = arr[i][j-1] + arr[i-1][j];
                }
            }
            result[ccount++] = arr[r][c];
        }
        br.close();
        for (int i : result) {
            System.out.println(i);
        }
    }
}

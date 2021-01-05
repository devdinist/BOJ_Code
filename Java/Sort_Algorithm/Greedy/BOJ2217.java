package trash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int case_num = Integer.parseInt(br.readLine());
        int max = 0;
        int[] num = new int[case_num];
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(br.readLine());
            max = Math.max(max,num[i]);
        }
        Arrays.sort(num);
        for(int i=0; i<num.length; i++){
            max = Math.max(max,num[i]*(num.length-i));
        }
        System.out.print(max);
    }
}

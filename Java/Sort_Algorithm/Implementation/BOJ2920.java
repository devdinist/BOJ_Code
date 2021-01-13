package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2920 {
    public static void main(String[] args) throws IOException {
        final int SIZE = 8;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] num = new int[SIZE];
        for(int i=0; i<input.length; i++){
            num[i] = Integer.parseInt(input[i]);
        }
        String res = num[0] == 1 ? "ascending" : "descending";
        if(num[0] == 1 || num[0] == 8){
            int base = num[0] == 1 ? +1 : -1;
            for(int i=0; i<num.length-1; i++){
                if(num[i]+base != num[i+1]){
                    res = "mixed";
                    break;
                }
            }
        }else{
            res = "mixed";
        }
        System.out.println(res);
    }
}

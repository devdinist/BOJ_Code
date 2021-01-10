package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine() + "!";
        StringBuilder sb = new StringBuilder();
        boolean m = false;
        int s = 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '!'){
                if(m){
                    s -= Integer.parseInt(sb.toString());
                }else{
                    s += Integer.parseInt(sb.toString());
                }
                if(input.charAt(i) == '-') m = true;
                sb.delete(0,sb.length());
            }else{
                sb.append(input.charAt(i));
            }
        }
        System.out.print(s);
    }
}

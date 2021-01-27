package Bruteforce;

import java.io.*;

public class BOJ13410 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int max = Integer.MIN_VALUE;
        StringBuilder tt = new StringBuilder();
        for(int i=1; i<=b; i++){
            int t = a * i;
            while(t > 0){
                tt.append(t%10);
                t /= 10;
            }
            int v = Integer.parseInt(tt.toString());
            max = Math.max(max,v);
            tt.delete(0,tt.length());
        }
        bw.write(max+"");
        bw.close();
        br.close();
    }
}
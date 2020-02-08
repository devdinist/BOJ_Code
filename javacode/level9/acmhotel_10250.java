package javacode.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acmhotel_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] hotel = null;
        int c_ase = Integer.parseInt(br.readLine());
        int current = 0;
        
        while(current < c_ase){
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int currentperson = 1;
            hotel = new int[H+1][W+1];
            
            z:for (int i = 1; i < W+1; i++) {
                int hcount = 100;
                for (int j = H; j > 0; j--) {
                    hotel[j][i] = hcount+i;
                    if (currentperson++ == N) {
                        System.out.println(hotel[j][i]);
                        break z;
                    }else{
                        hcount += 100;
                    }
                }
            }
            current++;
        }
    }
}

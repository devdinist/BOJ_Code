package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2239 {
    static final int S = 9;
    static boolean[][] r = new boolean[S][S+1];
    static boolean[][] c = new boolean[S][S+1];
    static boolean[][] s = new boolean[S][S+1];
    static int[][] g = new int[S][S];

    static void printer(){
        for(int[] v1 : g){
            for(int v2 : v1){
                System.out.print(v2);
            }
            System.out.println();
        }
        System.exit(0);
    }

    static void go(int co){
        if(co == S*S){
            printer();
        }
        int rr = co / S;
        int cc = co % S;
        if(g[rr][cc] == 0){
            for(int i=1; i<=S; i++){
                int t = ((rr/3)+(cc/3))+2*(rr/3);
                if(!r[rr][i] && !c[cc][i] && !s[t][i]){
                    r[rr][i] = true;
                    c[cc][i] = true;
                    s[t][i] = true;
                    g[rr][cc] = i;
                    go(co+1);
                    g[rr][cc] = 0;
                    s[t][i] = false;
                    c[cc][i] = false;
                    r[rr][i] = false;
                }
            }
        }else{
            go(co+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<S; i++){
            String[] in = br.readLine().split("");
            for(int j=0; j<S; j++){
                int v = Integer.parseInt(in[j]);
                r[i][v] = true;
                c[j][v] = true;
                s[((i/3)+(j/3))+2*(i/3)][v] = true;
                g[i][j] = v;
            }
        }
        go(0);
    }
}

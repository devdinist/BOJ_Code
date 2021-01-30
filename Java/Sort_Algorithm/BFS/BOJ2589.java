package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class P2589{
    int r;
    int c;
    int v;
    P2589(int r, int c,int v){
        this.r = r;
        this.c = c;
        this.v = v;
    }
}

public class BOJ2589 {
    static int row,col;
    static int[][] g;
    static boolean[][] v;
    static int[] move_r = {-1,1,0,0};
    static int[] move_c = {0,0,-1,1};
    static int res = Integer.MIN_VALUE;
    static Queue<P2589> q = new LinkedList<>();

    static void remover(){
        for (int i = 0; i < row; i++) {
            Arrays.fill(v[i],false);
        }
    }

    static void bfs(int r, int c){
        int max = 0;
        q.add(new P2589(r,c,0));
        v[r][c] = true;
        while(!q.isEmpty()){
            P2589 p = q.poll();
            int rr = p.r;
            int cc = p.c;
            int vv = p.v;
            max = Math.max(max,vv);
            for (int i = 0; i < move_r.length; i++) {
                int nr = rr + move_r[i];
                int nc = cc + move_c[i];
                if(nr >= 0 && nc >= 0 && nr < row && nc < col){
                    if(!v[nr][nc] && g[nr][nc] == 1){
                        v[nr][nc] = true;
                        q.add(new P2589(nr,nc,vv+1));
                    }
                }
            }
        }
        res = Math.max(res,max);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        row = Integer.parseInt(in[0]);
        col = Integer.parseInt(in[1]);
        g = new int[row][col];
        v = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            in = br.readLine().split("");
            for (int j = 0; j < col; j++) {
                String v = in[j];
                if(v.equals("L")) g[i][j] = 1;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(g[i][j] == 1){
                    bfs(i,j);
                    remover();
                }
            }
        }

        System.out.print(res);
    }
}

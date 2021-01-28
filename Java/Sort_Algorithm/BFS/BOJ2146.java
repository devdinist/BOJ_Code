package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class P2146{
    int r;
    int c;
    int l;
    int flag;
    P2146(int r, int c, int l, int flag){
        this.r = r;
        this.c = c;
        this.l = l;
        this.flag = flag;
    }
}

public class BOJ2146 {
    static int size;
    static int co = -1;
    static int res = Integer.MAX_VALUE;
    static int[] move_r = {-1,1,0,0};
    static int[] move_c = {0,0,-1,1};
    static int[][] g,cg;
    static boolean[][] v,cv;
    static Queue<P2146> q = new LinkedList<>();
    static ArrayList<HashSet<P2146>> al = new ArrayList<>();

    static void cp(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                cg[i][j] = g[i][j];
                cv[i][j] = false;
            }
        }
    }

    static void bfs(){
        cp();
        while(!q.isEmpty()){
            P2146 p = q.poll();
            int r = p.r;
            int c = p.c;
            int l = p.l;
            int flag = p.flag;
            cg[r][c] = l;
            for(int i=0; i< move_r.length; i++){
                int nr = r + move_r[i];
                int nc = c + move_c[i];
                if(nr >= 0 && nc >= 0 && nr < size && nc < size){
                    if(!cv[nr][nc] && cg[nr][nc] == 0){
                        cv[nr][nc] = true;
                        cg[nr][nc] = p.l+1;
                        q.add(new P2146(nr,nc,l+1,flag));
                    }
                    if(!cv[nr][nc] && cg[nr][nc] != flag && cg[nr][nc] < 0){
                        res = Math.min(res,l);
                    }
                }
            }
        }
    }

    static void dfs(int r, int c){
        for(int i=0; i< move_r.length; i++){
            int rr = r + move_r[i];
            int cc = c + move_c[i];
            if(rr >=0 && cc >= 0 && rr < size && cc < size){
                if(!v[rr][cc] && g[rr][cc] == 0){
                    v[rr][cc] = true;
                    al.get(Math.abs(co)-1).add(new P2146(rr,cc,1,co));
                }
                if(!v[rr][cc] && g[rr][cc] == 1){
                    g[rr][cc] = co;
                    v[rr][cc] = true;
                    dfs(rr,cc);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        g = new int[size][size];
        cg = new int[size][size];
        v = new boolean[size][size];
        cv = new boolean[size][size];
        for(int i=0; i<size; i++){
            String[] in = br.readLine().split(" ");
            for(int j=0; j<size; j++){
                g[i][j] = Integer.parseInt(in[j]);
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(!v[i][j] && g[i][j] == 1){
                    v[i][j] = true;
                    g[i][j] = co;
                    al.add(new HashSet<>());
                    dfs(i,j);
                    co--;
                }
            }
        }

        for(int i=0; i<al.size(); i++){
            q.addAll(al.get(i));
            bfs();
        }

        System.out.print(res);
    }
}


/*
    다른사람들의 풀이방식을 참고하여 새롭게 만들어본 코드입니다.
    각 섬 영역에 숫자를 붙일때는 재귀를 활용한 dfs를 사용하였고
    각 섬에서 거리를 계산할때는 큐를 활용한 bfs를 사용하였습니다.



package trash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

class P2146N{
    int r;
    int c;
    P2146N(int r, int c){
        this.r = r;
        this.c = c;
    }

}

public class BOJ2146_NEW {
    static int[] move_r = {-1,1,0,0};
    static int[] move_c = {0,0,-1,1};
    static int[][] g,lg;
    static boolean[][] v;
    static int size,res;
    static int co = 1;
    static Queue<P2146N> q = new ArrayDeque<>();

    static void bfs(){
        while(!q.isEmpty()){
            P2146N p = q.poll();
            int r = p.r;
            int c = p.c;
            for(int i=0; i< move_r.length; i++){
                int rr = r + move_r[i];
                int cc = c + move_c[i];
                if(rr >= 0 && cc >= 0 && rr < size && cc < size){
                    if(g[rr][cc] != 0 && g[r][c] != g[rr][cc]){
                        int l = lg[rr][cc] + lg[r][c];
                        res = Math.min(res,l);
                    }
                    if(g[rr][cc] == 0){
                        g[rr][cc] = g[r][c];
                        lg[rr][cc] = lg[r][c]+1;
                        q.add(new P2146N(rr,cc));
                    }
                }
            }
        }
    }

    static void dfs(int r, int c){
        for(int i=0; i< move_r.length; i++){
            int rr = r + move_r[i];
            int cc = c + move_c[i];
            if(rr >=0 && cc >=0 && rr < size && cc < size){
                if(!v[rr][cc] && g[rr][cc] == 1){
                    v[rr][cc] = true;
                    g[rr][cc] = co;
                    dfs(rr,cc);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        res = Integer.MAX_VALUE;
        g = new int[size][size];
        lg = new int[size][size];
        v = new boolean[size][size];

        for(int i=0; i<size; i++){
            String[] in = br.readLine().split(" ");
            for(int j=0; j<size; j++){
                g[i][j] = Integer.parseInt(in[j]);
                if(g[i][j] == 1) q.add(new P2146N(i,j));
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(!v[i][j] && g[i][j] == 1){
                    v[i][j] = true;
                    g[i][j] = co;
                    dfs(i,j);
                    co++;
                }
            }
        }
        bfs();
        System.out.print(res);
    }
}




 */

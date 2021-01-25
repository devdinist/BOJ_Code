package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ12100{
    static int[][] g,cg;
    static int[] tmp = new int[5];
    static int res = Integer.MIN_VALUE;

    static void cp(){
        for(int i=0; i<g.length; i++){
            for(int j=0; j<g.length; j++){
                cg[i][j] = g[i][j];
            }
        }
    }

    static void go_left(int row){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<cg.length; i++){
            if(cg[row][i] != 0) q.add(cg[row][i]);
            cg[row][i] = 0;
        }
        int idx = 0;
        while(!q.isEmpty()){
            int n = q.poll().intValue();
            if(cg[row][idx] == 0) cg[row][idx] = n;
            else if(cg[row][idx] == n){
                cg[row][idx] *= 2;
                idx++;
            }else{
                idx++;
                cg[row][idx] = n;
            }
        }
    }

    static void go_right(int row){
        Queue<Integer> q = new LinkedList<>();
        for(int i=cg.length-1; i>=0; i--){
            if(cg[row][i] != 0) q.add(cg[row][i]);
            cg[row][i] = 0;
        }
        int idx = cg.length-1;
        while(!q.isEmpty()){
            int n = q.poll().intValue();
            if(cg[row][idx] == 0) cg[row][idx] = n;
            else if(cg[row][idx] == n){
                cg[row][idx] *= 2;
                idx--;
            }
            else {
                idx--;
                cg[row][idx] = n;
            }
        }
    }

    static void go_up(int col){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<cg.length; i++){
            if(cg[i][col] != 0) q.add(cg[i][col]);
            cg[i][col] = 0;
        }
        int idx = 0;
        while(!q.isEmpty()){
            int n = q.poll().intValue();
            if(cg[idx][col] == 0) cg[idx][col] = n;
            else if(cg[idx][col] == n){
                cg[idx][col] *= 2;
                idx++;
            }else{
                idx++;
                cg[idx][col] = n;
            }
        }
    }

    static void go_down(int col){
        Queue<Integer> q = new LinkedList<>();
        for(int i=cg.length-1; i>=0; i--){
            if(cg[i][col] != 0) q.add(cg[i][col]);
            cg[i][col] = 0;
        }
        int idx = cg.length-1;
        while(!q.isEmpty()){
            int n = q.poll().intValue();
            if(cg[idx][col] == 0) cg[idx][col] = n;
            else if(cg[idx][col] == n){
                cg[idx][col] *= 2;
                idx--;
            }else{
                idx--;
                cg[idx][col] = n;
            }
        }
    }

    static void right(){
        for(int i=0; i<g.length; i++){
            go_right(i);
        }
    }

    static void left(){
        for(int i=0; i<g.length; i++){
            go_left(i);
        }
    }

    static void up(){
        for(int i=0; i<g.length; i++){
            go_up(i);
        }
    }

    static void down(){
        for(int i=0; i<g.length; i++){
            go_down(i);
        }
    }

    static void controller(int num){
        switch (num){
            case 0: up(); break;
            case 1 : down(); break;
            case 2 : left(); break;
            case 3 : right(); break;
        }
    }

    static void finder(){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<cg.length; i++){
            for(int j=0; j<cg.length; j++){
                max = Math.max(max,cg[i][j]);
            }
        }
        res = Math.max(res,max);
    }


    static void backtrack(int c,int s){
        if(c == 5){
            cp();
            for(int i=0; i<tmp.length; i++){
                controller(tmp[i]);
            }
            finder();
            return;
        }
        for(int i=0; i< 4; i++){
            tmp[c] = i;
            backtrack(c+1,i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        g = new int[size][size];
        cg = new int[size][size];
        for (int i=0; i<size; i++){
            String[] in = br.readLine().split(" ");
            for(int j=0; j<size; j++){
                g[i][j] = Integer.parseInt(in[j]);
            }
        }
        backtrack(0,0);
        System.out.print(res);
    }
}

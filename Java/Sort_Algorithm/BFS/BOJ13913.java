package BFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class P13913{
    int p;
    int c;
    P13913 pp;
    P13913(int p, int c){
        this.p = p;
        this.c = c;
    }

    public void setPp(P13913 pp) {
        this.pp = pp;
    }
}

public class BOJ13913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] m = {-1,1};
        Queue<P13913> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        boolean[] v = new boolean[100001];
        String[] input = br.readLine().split(" ");
        int s = Integer.parseInt(input[0]);
        int f = Integer.parseInt(input[1]);
        int t,r = 0;
        P13913 tp;
        StringBuilder res = new StringBuilder();
        if(s > f){
            r = s-f;
            for(int i=s; i>=f; i--){
                res.append(i+" ");
            }
        }else{
            tp = new P13913(s,0);
            tp.setPp(new P13913(s,0));
            q.add(tp);
            while(!q.isEmpty()){
                P13913 p = q.poll();
                if(v[p.p]) continue;
                v[p.p] = true;
                if(p.p == f){
                    r = p.c;
                    while(p.pp != null){
                        st.add(p.p);
                        p = p.pp;
                    }
                    while(!st.isEmpty()){
                        res.append(st.pop()+" ");
                    }
                    break;
                }
                for(int i=0; i<=m.length; i++){
                    t = i == 2 ? p.p * 2 : p.p + m[i];
                    if(t >=0 && t < 100001 && !v[t]){
                        tp = new P13913(t,p.c+1);
                        tp.setPp(p);
                        q.add(tp);
                    }
                }
            }
        }

        bw.write(r+"\n"+res.toString());
        bw.close();
        br.close();
    }
}
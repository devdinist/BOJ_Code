package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class P15686{
    int r;
    int c;
    P15686(int r, int c){
        this.r = r;
        this.c = c;
    }

}

public class BOJ15686 {
    static int STORE;
    static P15686[] tmp;
    static ArrayList<P15686> house = new ArrayList<>();
    static ArrayList<P15686> chicken = new ArrayList<>();
    static int res = Integer.MAX_VALUE;

    static void calc(){
        int sum = 0;
        for(int i=0; i<house.size(); i++){
            P15686 h = house.get(i);
            int min = Integer.MAX_VALUE;
            for(int j=0; j<tmp.length; j++){
                P15686 c = tmp[j];
                int v = Math.abs(h.r-c.r)+Math.abs(h.c-c.c);
                min = Math.min(min,v);
            }
            sum += min;
        }
        res = Math.min(res,sum);
    }

    static void select(int c,int s){
        if(c == STORE){
            calc();
            return;
        }
        for(int i=s; i<chicken.size(); i++){
            P15686 p = chicken.get(i);
            tmp[c] = p;
            select(c+1,i+1);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int size = Integer.parseInt(in[0]);
        STORE = Integer.parseInt(in[1]);
        tmp = new P15686[STORE];

        for(int i=1; i<=size; i++){
            in = br.readLine().split(" ");
            for(int j=0; j<in.length; j++){
                int v = Integer.parseInt(in[j]);
                if(v== 1) house.add(new P15686(i,j+1));
                else if(v == 2) chicken.add(new P15686(i,j+1));
            }
        }
        select(0,0);
        System.out.print(res);
    }
}

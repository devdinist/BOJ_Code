package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Time{
    int start;
    int end;

    public Time(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class BOJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(b.readLine());
        int g = 0;
        int co = 0;
        Time[] a = new Time[size];
        for(int i=0; i<size; i++){
            String[] input = b.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);
            a[i] = new Time(r,c);
        }
        Arrays.sort(a, (o1, o2) -> {
            if(o1.end < o2.end){
                return -1;
            }
            if(o1.end == o2.end){
                return Integer.compare(o1.start, o2.start);
            }
            return 1;
        });
        Time t;
        for(int i=0; i<size; i++){
            t = a[i];
            if(t.start >= g){
                g = t.end;
                co++;
            }
        }
        System.out.println(co);
    }
}

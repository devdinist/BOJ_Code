package javacode.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class People{
    int x;
    int y;
    int rank;
    
    People(int x, int y, int rank){
        this.x = x;
        this.y = y;
        this.rank = rank;
    }
}

public class dungchi_7568 {
    static People[] p;
    
    public static void resultrank(){
        for (int i = 0; i < p.length-1; i++) {
            for (int j = i+1; j < p.length; j++) {
                if(p[i].x > p[j].x && p[i].y > p[j].y){
                    p[j].rank += 1;
                }
                else if(p[i].x < p[j].x && p[i].y < p[j].y){
                    p[i].rank +=1;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int people = Integer.parseInt(br.readLine());
        p = new People[people];
        int count = 0;
        while(count < people){
            String info = br.readLine();
            String[] s = info.split(" ");
            p[count++] = new People(Integer.parseInt(s[0]), Integer.parseInt(s[1]),1);
        }
        resultrank();
        
        for (People people1 : p) {
            System.out.print(people1.rank+" ");
        }
    }
}

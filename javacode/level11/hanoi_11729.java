package javacode.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hanoi_11729 {

    static StringBuilder s = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        System.out.println((int)(Math.pow(2,size)-1));
        top(size,1,2,3);
        System.out.println(s);
    }
    
    static void top(int size, int first, int second, int third){
        if(size == 0) System.out.println("dd");
        if (size == 1) {
            s.append(first+" "+third+"\n");
        }else{
            top(size-1,first,third,second);
            s.append(first+" "+third+"\n");
            top(size-1,second,first,third);
        }
    }
}

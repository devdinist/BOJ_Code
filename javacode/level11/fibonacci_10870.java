package javacode.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci_10870 {
    static int[] a = new int[21];
    static int gnumber;
    
    static void pac(int cnumber){
        a[cnumber] = a[cnumber-1] + a[cnumber-2];
        if(!(cnumber == gnumber)){
            pac(cnumber+1);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        gnumber = Integer.parseInt(br.readLine());
        a[0] = 0; a[1] = 1;
        if(gnumber > 1)pac(2);
        System.out.println(a[gnumber]);
    }

}

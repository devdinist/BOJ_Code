
package javacode.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class aplusb_10950 {
    public static void main(String[] args) {
        int[] a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            int size = Integer.parseInt(br.readLine());
            a = new int[size];
            while(--size >= 0){
                st = new StringTokenizer(br.readLine());
                a[size] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            }
            for (int i = a.length-1; i >=0; i--) {
                System.out.println(a[i]);
            }
            
        } catch (IOException e) {
        }
    }
}

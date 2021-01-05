package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int m = 1000 - Integer.parseInt(b.readLine());
        int[] a = {500,100,50,10,5,1};
        int s = 0, c= 0;

        for(int i=0; i<a.length; i++){
            if(m < a[i]) s = i;
            else break;
        }

        for(int i=s; i<a.length; i++){
            if(m == a[i]){
                c++;
                break;
            }else if(m / a[i] != 0){
                c += (m / a[i]);
                m %= a[i];
            }
        }

        System.out.print(c);
    }
}

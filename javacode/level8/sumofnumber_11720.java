
package javacode.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class sumofnumber_11720{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] v = new int[size];
        String ss = br.readLine();
        BigInteger sum = BigInteger.valueOf(0);
        while(size > 0){
            v[size-1] = Integer.parseInt(Character.toString(ss.charAt(size-1)));
            sum = sum.add(BigInteger.valueOf(v[size-1]));
            size--;
        }
        System.out.println(sum);
    }
}

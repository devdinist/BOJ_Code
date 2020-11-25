package javacode.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hap_8393 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int max = Integer.parseInt(br.readLine());
            System.out.println((max * (max+1)) / 2);
        } catch (IOException e) {
        }
    }
}

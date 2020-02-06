package javacode.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class printgrade_9498 {
    public static void main(String[] args) {
        int[] vc = {10,9,8,7,6,5,4,3,2,1,0};
        String[] grade = {"A","A","B","C","D","F","F","F","F","F","F"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int value = Integer.parseInt(br.readLine()) / 10;
            for (int i = 0; i < vc.length; i++) {
                System.out.print(vc[i] == value ? grade[i] : "");
            }
        } catch (IOException err) {
        }
    }
}


package javacode.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class remainder_3052 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            ArrayList<Integer> l = new ArrayList<>();
            int count = 0;
            while(count++ < 10){
                l.add(Integer.parseInt(br.readLine()) % 42);
            }
            Set<Integer> s = new HashSet<>(l);
            bw.write(s.size()+"\n");
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
        
    }
}

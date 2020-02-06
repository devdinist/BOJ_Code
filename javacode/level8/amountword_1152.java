
package javacode.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class amountword_1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        int count = 0;
        while(st.hasMoreElements()){
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}

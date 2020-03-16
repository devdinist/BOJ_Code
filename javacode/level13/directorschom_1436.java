
package javacode.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class directorschom_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int count = 1;
        int start = 666;
        while(true){
            String sv = Integer.toString(start++);
            if(sv.contains("666")){
                if(count == number){
                    System.out.println(sv);
                    break;
                }
                count++;
            }
        }
    }
}

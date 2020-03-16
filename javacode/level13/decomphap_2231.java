
package javacode.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decomphap_2231 {
    
    public static void main(String[] args) throws IOException {     // 너무비효율
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        int start = 1;
        while(true){
            if(start > number){
                System.out.println(0);
                break;
            }
            int result = 0,div = 10, jarisu =1;
            while(true){
                if(start / div == 0) break;
                else {
                    div*=10; jarisu += 1;
                }
            }      
            while(true){
                if(jarisu == 0) break;
                result += ((start / (int)(Math.pow(10, jarisu-1))) % 10) * (int)(Math.pow(10, jarisu-1));
                result += ((start / (int)(Math.pow(10, jarisu-1))) % 10);
                jarisu--;
            }
            if(result == number){
                System.out.println(start);
                break;
            }
            start++;
        }
    }
}

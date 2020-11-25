
package javacode.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class decomphap_2231_improved {
    static int calcsum(int num){
        int sum = num;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        int result = 0;
        for(int i=1; i<=number; i++){
            int cv = calcsum(i);
            if(cv == number){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

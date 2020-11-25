package javacode.level11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial_10872 {
    static int res = 1;
    
    static void pac(int number){
        if(number == 1){
            System.out.println(res);
        }else{
            res *= number;
            pac(number-1);
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        if(number == 0){                    // 0 Factorial => 1
            System.out.println(1);
        }else{
            pac(number);
        }
    }

}

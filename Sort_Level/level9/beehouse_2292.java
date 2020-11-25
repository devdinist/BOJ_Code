
package javacode.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//0 6*0 1
//1 6*1 7
//7 6*2 19
//19 6*3 37
//37 6*4 61
//61 6*5 91
//91 6*7 133  ...............

public class beehouse_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int start = 1;
        int count = 0;
        int sum;
        while(true){
            if (num == 1) {
                break;
            }
            sum = (start)+(6*count);
            if (sum >= num) {
                break;
            }else{
                count++;
            }
            start = sum;
        }
        System.out.println(count+1);
    }
}

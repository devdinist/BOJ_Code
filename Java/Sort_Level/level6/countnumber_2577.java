
package javacode.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class countnumber_2577 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int inputcount = 0;
            int mul_result = 1;
            int[] input = new int[3]; int[] freq = new int[10];
            while(inputcount < 3){
                input[inputcount] = Integer.parseInt(br.readLine());
                mul_result *= input[inputcount++];
            }
            System.out.println(mul_result);
            int size = (int)(Math.log10(mul_result))+1;
            while(true){
                if (size > 0) {
                    int gijun = (mul_result / (int)Math.pow(10, size-1)) % 10;
                    freq[gijun] +=1;
                    size--;
                }else{
                    break;
                }
            }
            for (int i : freq) {
                bw.write(i+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}

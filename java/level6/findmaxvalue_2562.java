
package java.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class findmaxvalue_2562 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int count = 0,max=0,maxcount=0;
            int[] arr = new int[9];
            while(count < 9){
                arr[count] = Integer.parseInt(br.readLine());
                if (arr[count] >= max) {
                    max = arr[count];
                    maxcount = count;
                }
                count++;
            }
            bw.write(max+"\n");
            bw.write((maxcount+1)+"\n");
            bw.flush();
        } catch (IOException e) {
        }
    }
}

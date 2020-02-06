
package java.level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pluscycle_1110 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int start = Integer.parseInt(br.readLine());
            int gijun = start;
            int count = 0;
            int temp = 0;
            while(true){
                int n1 = (start / 10 != 0) ? (start/10) : 0;
                int n2 = start % 10;
                temp = n1 + n2;
                temp = (temp / 10 != 0) ? temp % 10 : temp;
                start = (n2*10)+temp;
                count++;
                if (start == gijun) {
                    break;
                }
            }
            bw.write(count+"\n");
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException | NumberFormatException e) {
        }
    }
}

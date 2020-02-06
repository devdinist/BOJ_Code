
package java.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class printstart_2438 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int s = Integer.parseInt(br.readLine());
            for (int i = 0; i < s; i++) {
                for (int j = 0; j < i+1; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}
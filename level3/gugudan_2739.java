
package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class gugudan_2739 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int d = Integer.parseInt(br.readLine());
            for (int i = 1; i < 10; i++) {
                bw.write(d+" * "+i+" = "+(d*i)+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException err) {
        }
        
    }
}

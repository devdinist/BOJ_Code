
package java.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class aplusb7_11021 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        try {
            int c = Integer.parseInt(br.readLine());
            for (int i = 1; i <= c ; i++) {
                st = new StringTokenizer(br.readLine());
                int sumv = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
                bw.write("Case #"+i+": "+sumv+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}

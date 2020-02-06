
package java.level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class aplusb4_10951 {
    public static void main(String[] args) {
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            StringTokenizer st;
            String s;
            while((s = br.readLine()) != null){
                st = new StringTokenizer(s);
                int v1 = Integer.parseInt(st.nextToken());
                int v2 = Integer.parseInt(st.nextToken());
                int sum = v1 + v2;
                bw.write(sum+"\n");
            }
            bw.flush();
        } catch (IOException e) {
        }
    }
}

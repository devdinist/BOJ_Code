
package java.level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class aplusb5_10952 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        try {
            while(true){
                st = new StringTokenizer(br.readLine());
                int v1 = Integer.parseInt(st.nextToken());
                int v2 = Integer.parseInt(st.nextToken());
                int sum = v1 + v2;
                if (sum != 0) {
                    bw.write(sum+"\n");
                }else{
                    break;
                }
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}

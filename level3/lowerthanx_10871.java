package level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class lowerthanx_10871 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        try {
             st = new StringTokenizer(br.readLine());
             int size = Integer.parseInt(st.nextToken());
             int limit = Integer.parseInt(st.nextToken());
             st = new StringTokenizer(br.readLine());
             int[] numarr = new int[size];
             for (int i = 0; i < size; i++) {
                 int v;
                 if ((v = Integer.parseInt(st.nextToken())) < limit) {
                     bw.write(v+" ");
                 }
             }
             bw.write("\n");
             bw.flush();
             bw.close();
             br.close();
        } catch (IOException e) {
        } catch (NumberFormatException e){
        }
    }
}

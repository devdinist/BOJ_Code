
package java.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class fastaplusb_15552 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static void print(int a, int b) throws IOException{
        bw.write((a+b)+"\n");
    }
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int c = Integer.parseInt(br.readLine());
            StringTokenizer st;
            for (int i = 0; i < c; i++) {
               st = new StringTokenizer(br.readLine());
               int a = Integer.parseInt(st.nextToken());
               int b = Integer.parseInt(st.nextToken());
               print(a,b);
            }
            bw.flush();
        } catch (IOException e) {
        }
        
    }
}

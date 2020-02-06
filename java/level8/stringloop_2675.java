
package java.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stringloop_2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int freq = Integer.parseInt(br.readLine());
        while(freq > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int iv = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < iv; j++) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println("");
            freq--;
        }
    }
}

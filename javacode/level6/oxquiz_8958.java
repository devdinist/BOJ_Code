
package javacode.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class oxquiz_8958 {
    public static void main(String[] args) {
        String[] sarr;
        int[] sv;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int size = Integer.parseInt(br.readLine());
            sarr = new String[size];
            sv = new int[size];
            int count = 0;
            while(size-- > 0){
                sarr[count++] = br.readLine();
            }
            int sum = 0;
            for (int i = 0; i<sarr.length; i++) {
                int matchcount = 0;
                for (int j = 0; j < sarr[i].length(); j++) {
                    if (sarr[i].charAt(j) == 'O') {
                        sum += ++matchcount;
                    }else{
                        matchcount = 0;
                    }
                }
                sv[i] = sum;
                sum = 0;
            }
            for (int i : sv) {
                bw.write(i+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}

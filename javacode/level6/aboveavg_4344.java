
package javacode.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class aboveavg_4344 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        double[] num = new double[1002];
        Arrays.fill(num, -1);
        try {
            int size = Integer.parseInt(br.readLine());
            while(size-- > 0){
                int count = 0,overcount=0;
                int sum = 0;
                st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    num[count++] = Double.parseDouble(st.nextToken());
                }
                int max = 0;
                for (int i = 1; i < num.length; i++) {
                    if (num[i] == -1) {
                        max = i;
                        break;
                    }
                }
                for (int i = 1; i < max; i++) {
                    sum += num[i];
                }
                double avg = sum / num[0];
                for (int i = 1; i<max; i++) {
                    if (num[i] > avg) {
                        overcount++;
                    }
                }
                double resultp = overcount / num[0] * 100;
                String f = "%.3f%%\n";
                bw.write(String.format(f, resultp));
                Arrays.fill(num, -1);
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}

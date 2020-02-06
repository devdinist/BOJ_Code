package javacode.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class average_1546 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int size = Integer.parseInt(br.readLine());
            double[] v = new double[size];
            String[] vv = br.readLine().split(" ");
            for (int i = 0; i<vv.length; i++) {
                v[i] = Double.parseDouble(vv[i]);
            }
            Arrays.sort(v);
            double max = v[v.length-1];
            double sum = 0;
            for (int i = 0; i < v.length; i++) {
                v[i] = v[i] / max * 100;
                sum += v[i];
            }
            String r = String.format("%.2f", sum/v.length);
            bw.write(r+"\n");
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}

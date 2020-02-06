package java.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class maxmin_108181_2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr;
        try {
            int size = Integer.parseInt(br.readLine());
            arr = br.readLine().split(" ");
            int max = Integer.parseInt(arr[0]);
            int min = Integer.parseInt(arr[0]);
            for (String arr1 : arr) {
                int v = Integer.parseInt(arr1);
                if (max <= v) {
                    max = v;
                }else if(min >= v){
                    min = v;
                }
            }
            bw.write(min + " "+max+"\n");
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}

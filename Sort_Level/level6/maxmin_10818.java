package javacode.level6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class maxmin_10818 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr;
        try {
            int size = Integer.parseInt(br.readLine());
            arr = new int[size];
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens() && size >=0){
                arr[--size] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            bw.write(arr[0]+" "+arr[arr.length -1]+"\n");
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
        }
    }
}

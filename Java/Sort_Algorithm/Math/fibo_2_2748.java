package Math;

import java.io.*;
import java.util.Arrays;

public class fibo_2_2748 {
    static long[] num_info;

    public static long f(int num){
        if(num_info[num] == -1){
            num_info[num] = f(num-1) + f(num-2);
        }
        return num_info[num];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        num_info = new long[count+1];
        Arrays.fill(num_info,-1);
        num_info[0] = 0;
        num_info[1] = 1;

        bw.write(f(count)+"\n");
        bw.close();
        br.close();
    }
}

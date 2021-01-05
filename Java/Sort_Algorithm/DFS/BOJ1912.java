package DFS;

import java.io.*;

public class BOJ1912 {

    static int[] input_index = new int[100001];
    static int[] res = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        for(int i=0; i<size; i++){
            input_index[i] = Integer.parseInt(input[i]);
        }

        int max = res[0] = input_index[0];

        for(int i=1; i<size; i++){
            res[i] = Math.max(res[i-1]+input_index[i],input_index[i]);
            max = Math.max(max,res[i]);
        }

        bw.write(max+"");
        bw.close();
        br.close();
    }
}

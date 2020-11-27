package Math;

import java.io.*;

public class escape_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        int a,b,min = 0;

        a = Math.min(w - x, x);
        b = Math.min(h - y, y);

        min = Math.min(a,b);

        bw.write(min+"");
        bw.close();
        br.close();
    }
}

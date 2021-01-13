package Implementation;

import java.io.*;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        final int BASE = 65;
        final int ARR_SIZE = 26;
        int[] t = new int[ARR_SIZE];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toUpperCase();
        for(int i=0; i<input.length(); i++){
            t[(int)input.charAt(i) - BASE]++;
        }

        int m = 0;
        char res = '?';
        for(int i=0; i<t.length; i++){
            if(m < t[i]){
                m = t[i];
                res = (char)(i+BASE);
            }else if(m == t[i]) res = '?';
        }
        bw.write(res);
        bw.close();
        br.close();
    }
}

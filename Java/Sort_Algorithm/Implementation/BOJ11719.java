package Implementation;

import java.io.*;

public class BOJ11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String i = "";
        StringBuilder sb = new StringBuilder();
        while((i = br.readLine()) != null){
            sb.append(i).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

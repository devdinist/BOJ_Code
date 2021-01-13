package Implementation;

import java.io.*;

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cs = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int h=0,w=0,n=0;
        for(int i=0; i<cs; i++){
            String[] input = br.readLine().split(" ");
            h = Integer.parseInt(input[0]);
            w = Integer.parseInt(input[1]);
            n = Integer.parseInt(input[2]);
            if(n % h == 0){
                sb.append(h);
                if(n/h<10) sb.append("0");
                sb.append(n/h);
            }else{
                sb.append(n%h);
                if((n/h)+1 < 10) sb.append("0");
                sb.append((n/h)+1);
            }
            if(i != cs-1) sb.append("\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

package Implementation;

import java.io.*;

public class BOJ2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(br.readLine());

        for(int i=0; i<2*line-1; i++){
            if(i < line){
                for(int j=0; j<line-1-i; j++){
                    bw.write(" ");
                    bw.flush();
                }
                for(int j=0; j<2*i+1; j++){
                    bw.write("*");
                    bw.flush();
                }
            }else{
                for(int j=0; j<i-line+1; j++){
                    bw.write(" ");
                    bw.flush();
                }
                for(int j=0; j<2*((2*line)-i-1)-1; j++){
                    bw.write("*");
                    bw.flush();
                }
            }
            if(i != 2*line-2){
                bw.write("\n");
                bw.flush();
            }
        }
        bw.close();
        br.close();
    }
}

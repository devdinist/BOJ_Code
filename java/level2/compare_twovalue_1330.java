package java.level2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class compare_twovalue_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter bw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)),true);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if (a > b) {
            bw.println(">");
        }else if(a < b){
            bw.println("<");
        }else if(a == b){
            bw.println("==");
        }
        bw.close();
        br.close();
    }
}

package Stack;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class PS_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int time = Integer.parseInt(br.readLine());
        String[] res = new String[time+1];
        for(int i=0; i<time; i++){
            String[] keyword = br.readLine().split("");
            Stack<String> s = new Stack<>();

            s.push(keyword[0]);
            if(keyword[0].equals(")")){
                res[i] = "NO";
                continue;
            }
            for(int j=1; j<keyword.length; j++){
                if(s.size() == 0){
                    s.push(keyword[j]);
                    continue;
                }
                if(s.peek().equals(keyword[j])){
                    s.push(keyword[j]);
                }else if (s.peek().equals("(")){
                    s.pop();
                }
            }
            if(s.size() == 0) res[i] = "YES";
            else res[i] = "NO";
        }

        for (int i=0; i<time; i++) {
            bw.write(res[i]+"\n");
        }
        bw.close();
        br.close();

    }
}

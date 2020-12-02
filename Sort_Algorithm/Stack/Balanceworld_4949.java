package Stack;

import java.io.*;
import java.util.Stack;

public class Balanceworld_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        while(!sb.append(br.readLine()).toString().equals(".")){
            Stack<Character> s = new Stack<>();
            boolean status = true;
            for(int j = 0; j<sb.length(); j++){
                char ch = sb.charAt(j);
                if(ch == '.') break;
                if(ch == '(' || ch == '[') s.push(ch);
                else if(ch == ')'){
                    if(!s.isEmpty() && s.peek() == '('){
                        s.pop();
                    }else{
                        status = false;
                        break;
                    }
                }else if(ch == ']'){
                    if(!s.isEmpty() && s.peek() == '['){
                        s.pop();
                    }else{
                        status = false;
                        break;
                    }
                }else{
                    continue;
                }
            }
            bw.write(status && s.isEmpty() ? "yes\n" : "no\n");
            sb.delete(0,sb.length());
        }
        bw.close();
        br.close();
    }
}

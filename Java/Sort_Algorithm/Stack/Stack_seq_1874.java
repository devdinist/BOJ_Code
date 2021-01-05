package Stack;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_seq_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        Queue<Integer> input = new LinkedList<>();
        boolean stat = true;

        int size = Integer.parseInt(br.readLine());
        for(int i=0; i<size; i++){
            input.add(Integer.parseInt(br.readLine()));
        }

        for(int i=1; i<=size; i++){
            if(!s.isEmpty()){
                if(i == input.peek().intValue()){
                    sb.append("+\n");
                    input.poll();
                    sb.append("-\n");
                }else if(s.peek().intValue() == input.peek().intValue()){
                    s.pop();
                    input.poll();
                    sb.append("-\n");
                    i--;
                }else {
                    s.add(i);
                    sb.append("+\n");
                }
            }else{
                s.add(i);
                sb.append("+\n");
                if(s.peek().intValue() == input.peek().intValue()){
                    s.pop();
                    input.poll();
                    sb.append("-\n");
                }
            }
        }

        while(!input.isEmpty()){
            if(input.poll().intValue() != s.pop().intValue()){
                stat = false;
                break;
            }else{
                sb.append("-\n");
            }
        }

        if(!stat){
            sb.delete(0,sb.length());
            sb.append("NO");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

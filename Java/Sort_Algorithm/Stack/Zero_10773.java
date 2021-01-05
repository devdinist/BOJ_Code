package Stack;

import java.io.*;
import java.util.Stack;

public class Zero_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int time = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<time; i++){
            int number = Integer.parseInt(br.readLine());
            if(number != 0) s.push(number);
            else s.pop();
        }
        for(Integer i : s){
            sum += i.intValue();
        }
        bw.write(sum+"");
        bw.close();
        br.close();
    }
}

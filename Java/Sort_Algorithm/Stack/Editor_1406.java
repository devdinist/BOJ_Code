package Stack;

import java.io.*;
import java.util.Stack;

public class Editor_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int count = Integer.parseInt(br.readLine());
        Stack<Character> tmp = new Stack<>();
        Stack<Character> word = new Stack<>();
        for(int i=0; i<input.length(); i++){
            word.push(input.charAt(i));
        }

        for(int i=0; i<count; i++){
            char[] b = br.readLine().toCharArray();
            switch (b[0]){
                case 'P':
                    word.push(b[2]);
                    break;
                case 'L':
                    if(word.isEmpty()) continue;
                    else tmp.push(word.pop());
                    break;
                case 'D':
                    if(tmp.isEmpty()) continue;
                    else word.push(tmp.pop());
                    break;
                case 'B':
                    if(word.isEmpty()) continue;
                    else word.pop();
                    break;
            }
        }
        while(!tmp.isEmpty()){
            word.push(tmp.pop());
        }

        for(Character c : word){
            bw.write(c);
        }
        bw.close();
        br.close();
    }
}

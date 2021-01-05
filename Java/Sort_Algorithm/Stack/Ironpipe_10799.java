package Stack;

import java.io.*;
import java.util.Stack;

public class Ironpipe_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toCharArray();
        int iron_count = 0;
        int total = 0;
        Stack<Character> s = new Stack<>();
        for(int i=0; i<input.length; i++){
            if(input[i] == '('){
                s.push(input[i]);
                iron_count++;
            }else{
                s.pop();
                iron_count--;
                if(i > 0 && input[i-1] == ')'){
                    total +=1;
                }else{
                    total += iron_count;
                }
            }
        }
        bw.write(total+"");
        bw.close();
        br.close();
    }
}


//package Stack;
//
//import java.io.*;
//import java.util.Stack;
//
//public class Ironpipe_10799 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        char[] input = br.readLine().toCharArray();
//        int iron_count = 0;
//        int total = 0;
//        Stack<Character> s = new Stack<>();
//        for(int i=0; i<input.length; i++){
//            if(input[i] == '('){
//                s.push(input[i]);
//                iron_count++;
//            }else{
//                if(i > 0 && input[i-1] == ')'){
//                    s.pop();
//                    total +=1;
//                    iron_count--;
//                    continue;
//                }
//                s.pop();
//                iron_count--;
//                total += iron_count;
//            }
//
//        }
//        bw.write(total+"");
//        bw.close();
//        br.close();
//    }
//}

import java.io.*;
import java.util.Stack;

public class PS_9012_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int time = Integer.parseInt(br.readLine());
        for(int i=0; i<time; i++){
            char[] keyword = br.readLine().toCharArray();
            Stack<Character> s = new Stack<>();
            boolean is_suc = true;
            for(int j=0; j<keyword.length; j++){
                if(keyword[j] == '('){
                    s.push(keyword[j]);
                }else{
                    if(s.isEmpty()){
                        is_suc = false;
                        break;
                    }
                    else s.pop();
                }
            }
            bw.write(s.isEmpty() && is_suc ? "YES\n" : "NO\n");
        }
        bw.close();
        br.close();
    }
}

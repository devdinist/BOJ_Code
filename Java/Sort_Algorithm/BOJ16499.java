import java.io.*;
import java.util.*;

public class BOJ16499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<>();
        int size = Integer.parseInt(br.readLine());
        int c = 0;
        for(int i=0; i<size; i++){
            String a = br.readLine();
            char[] tmp = a.toCharArray();
            Arrays.sort(tmp);
            a = new String(tmp);
            if(!al.contains(a)){
                al.add(a);
                c++;
            }
        }
        System.out.print(c);
    }
}

package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1357 {
    static StringBuilder sb;

    static int reverse(int num){
        sb = new StringBuilder();
        sb.append(num);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = reverse(Integer.parseInt(input[0]));
        int b = reverse(Integer.parseInt(input[1]));
        System.out.print(reverse(a+b));
    }
}

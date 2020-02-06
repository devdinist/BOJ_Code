
package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class finalllnumber_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(st.nextToken());
        int n1 = Integer.parseInt(sb.reverse().toString());
        sb = new StringBuilder(st.nextToken());
        int n2 = Integer.parseInt(sb.reverse().toString());
        System.out.println(n1 > n2 ? n1 : n2);
    }
}

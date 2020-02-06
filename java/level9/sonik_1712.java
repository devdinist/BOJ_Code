
package java.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sonik_1712 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fixcost = Integer.parseInt(st.nextToken());
        int onecost = Integer.parseInt(st.nextToken());
        int value = Integer.parseInt(st.nextToken());
        int bungi = onecost >= value ? -1 : fixcost / (value - onecost) +1;
        System.out.println(bungi);
    }
}

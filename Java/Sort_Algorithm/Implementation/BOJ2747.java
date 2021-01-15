package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] a = new int[46];
        a[0] = 0;
        a[1] = 1;
        for(int i=2; i<=num; i++){
            a[i] = a[i-1] + a[i-2];
        }
        System.out.print(a[num]);
    }
}

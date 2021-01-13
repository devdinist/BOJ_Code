package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        int[] a = new int[10];
        int base = 0;
        for(int i=0; i<sb.length(); i++){
            base = sb.charAt(0)-48;
            if(sb.charAt(i)-48 == base){
                a[sb.charAt(i)-48]++;
                sb.delete(i,1);
                i--;
            }
        }

        int max = (a[6]+a[9]) % 2 == 0 ? (a[6]+a[9]) / 2 : (a[6]+a[9]) / 2 +1;
        a[6] = a[9] = 0;
        for(int b : a){
            max = Math.max(max,b);
        }
        System.out.print(max);
    }
}

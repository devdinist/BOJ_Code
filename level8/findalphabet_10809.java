
package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class findalphabet_10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int[] freq = new int[26];
        Arrays.fill(freq, -1);
        for (int i = 0; i < a.length(); i++) {
            for (int j = 'a'; j<='z'; j++) {
                if (a.charAt(i) == j && freq[j-97] == -1) {
                    freq[j-97] = i;
                }
            }
        }
        for (int i : freq) {
            System.out.print(i+" ");
        }
    }
}

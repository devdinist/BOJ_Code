package level2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class findtwograde_10817 {
    public static void main(String[] args) {
        int[] num = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(num);
//            for (int i = 0; i < num.length-1; i++) {
//                for (int j = i+1; j < num.length; j++) {
//                    int temp;
//                    if (num[i] > num[j]) {
//                        temp = num[i];
//                        num[i] = num[j];
//                        num[j] = temp;
//                    }
//                }
//            }
            System.out.println(num[1]);
        } catch (IOException e) {
        }
    }
}

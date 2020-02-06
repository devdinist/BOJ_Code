package java.level2;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;
//import java.util.StringTokenizer;

public class alarm_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        int sm = m > 45 ? m-45 : m-45+60;
        int sh = m > 45 ? h : (h-1 > 0 ? h-1 : 23);
        System.out.printf("%d %d",sh,sm);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int h = Integer.parseInt(st.nextToken());
//            int m = Integer.parseInt(st.nextToken());
//            int sm = m > 45 ? m-45 : m-45+60;
//            int sh = m > 45 ? h : (h-1 > 0 ? h-1 : 23);
//            System.out.printf("%d %d",sh,sm);
//        } catch (IOException err) {
//        }
    }
}
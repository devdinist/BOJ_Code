
package javacode.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class snailwannaclimb_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
//        int day = 0;
//        while(true){
//            if (day*(A-B)+A < V) {
//                day++;
//            }else{
//                break;
//            }
//        }
        System.out.println((V-A) % (A-B) == 0 ? ((V-A) / (A-B)) +1 : (V-A) / (A-B) +2  );
        
        // (DAY)일수 * (A-B) + A = V
        // (DAY)일수 = (V-A) / (A-B)
        // +A에 의한 하루차이에다가 목표높이-하루높이 != 0이면
        // 하루를 더 계산해야 하므로 +2를 한다.
        
        
//        System.out.println(day+1);
    }
}

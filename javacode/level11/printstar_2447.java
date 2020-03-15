
package javacode.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class printstar_2447 {
    static char[][] a;
    static final int DIV = 3;
    
    static void calc(int scale, int x, int y){      // 각 구역을 3*3 베열로 쪼개었을때로 연산
        if(scale == 1){
            a[x][y]='*';
        }else{
            int send = scale / DIV;
            for (int i = 0; i < DIV; i++) {
                for (int j = 0; j < DIV; j++) {
                    if (!(i == 1 && j == 1)) calc(send,x+(send*i),y+(send*j));  // 3*3좌표 배열에서 빈 공간인 (1,1)의 공간은 연산에서 제외한다.
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        a = new char[number][number];
        
        for (int i = 0; i < number; i++) {
            Arrays.fill(a[i],' ');          // 일단 모든 배열의 초기값을 공백으로 초기화
        }
        
        calc(number,0,0);       // 재귀호출 시작 모든 점찍기의 시작 좌표는 (0,0)부터
        
        for (int i = 0; i < number; i++) {      // 재귀호출 모두 끝나고 배열의 값을 StringBuilder에 붙인다.
            for (int j = 0; j < number; j++) {
                sb.append(a[i][j]);
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}

package javacode.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findfraction_1193{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int faze = 1;   // 몇번째 대각선인지 체크하기 위함
        
        while(faze < num){  // num번째 분수가 있는 대각선을 찾기위한 while문
            if((faze*(faze+1)) / 2 < num) { faze++; }   // 1+2+3+4+5+... ex) 5번째 대각선까지는 1~5까지의 합 15보다 큰 수는 없다.
            else break;                                 // faze번째 대각선 안에 num번째 차례가 있다면 while문 탈출
        }
        
        int gijun = (faze*(faze+1)) / 2;    // num이 있는 대각선 faze에서 최대값을 저장한다. 값을 찾기 위한 기준이된다.
        int a = faze % 2 == 0 ? faze : 1;   // a / b 형태의 출력형태에서 a의 값을 정한다.
        int b = faze % 2 == 0 ? 1 : faze;   // a / b 형태의 출력형태에서 b의 값을 정한다.
        
        //  faze가 짝수(2로나눈 나머지가 0)이면 ↗로 올라갈수록 값이 감소하고 홀수면 올라갈수록 값이 증가하므로
        //  a와 b의 초기값을 faze의 홀수 짝수에 따라 다르게 한다.
        
        while(true){    // num번째 분수값을 찾기위한 과정
            if (faze % 2 == 0) {
                if (gijun != num) { a--; b++; } // 짝수, 값이 감소하므로 그에 맞게 좌표도 바꾼다.
                else break;                     // num과 gijun이 일치할때 while 탈출
            }else{
                if(gijun != num) { a++; b--; }  // 홀수, 값이 증가하므로 그에 맞게 좌표도 바꾼다.
                else break;                     // num과 gijun이 일치할때 while 탈출
            }
            gijun--;    // gijun을 1씩 감소시킨다.  
        }
        System.out.println(a+"/"+b);    //결과 출력
    }
}

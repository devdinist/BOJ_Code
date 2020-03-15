package javacode.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class blackjack_2798 {
    static int[] card;   // 카드 배열
    static int sum;     // max와 같거나 가장 인접한 최대값
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String v = br.readLine();
        String[] va = v.split(" ");                 // 초기 카드 장수, 최대값 담는 배열
        card = new int[Integer.parseInt(va[0])];        // 초기 카드 장 수의 크기로 배열 사이즈 정하기
        int max = Integer.parseInt(va[1]);              //  최대값 저장
        
        v = br.readLine();                          // 각 카드의 값 입력
        va = v.split(" ");                          // 각 카드의 값 string배열로 담기
        
        for (int i = 0; i < va.length; i++) {
            card[i] = Integer.parseInt(va[i]);      // string타입의 숫자값 배열을 int타입의 배열 card배열로 옮기기
        }
        
        for (int i = 0; i < card.length-2; i++) {           //첫번째 숫자 정하기
            for (int j = i+1; j < card.length-1; j++) {         //두번째 숫자 정하기
                int subsum = card[i]+card[j];
                for (int k = j+1; k < card.length; k++) {           //세번째 숫자 정하기
                    if (subsum+card[k] > sum && subsum+card[k] <= max) {        // 3개의 숫자 합이 기존의 최대값인 sum보다 크면서 max와 같거나 작으면 sum에 할당         
                        sum = subsum+card[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

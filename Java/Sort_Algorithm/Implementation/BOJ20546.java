package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ20546 {
    static int SMONEY,JMONEY,SJUSIK,JJUSIK;

    static int j(int[] day){
        for(int i=1; i<day.length; i++){
            if(JMONEY > 0 && JMONEY/day[i] > 0){
                JJUSIK += (JMONEY/day[i]);
                JMONEY -= day[i] * (JMONEY/day[i]);
            }
        }
//        System.out.println(JJUSIK*day[14]);
        return (JJUSIK*day[14])+JMONEY;
    }

    static int s(int[] day){
        int upcount = 0;
        int downcount = 0;
        for(int i=2; i<day.length; i++){
            if(day[i-1] < day[i]){
                upcount++;
                downcount = 0;
            }
            else if(day[i-1] > day[i]){
                downcount++;
                upcount = 0;
            }
            else{
                upcount = 0;
                downcount = 0;
            }
            if(upcount >= 3){
                if(SJUSIK > 0){
                    SMONEY += (SJUSIK*day[i]);
                    SJUSIK = 0;
                }

            }else if(downcount >= 3){
                if(SMONEY > 0 && SMONEY/day[i] > 0){
                    SJUSIK += (SMONEY/day[i]);
                    SMONEY -= day[i] * (SMONEY/day[i]);
                }
            }
        }
//        System.out.println(SMONEY + (SJUSIK * day[14]));
        return SMONEY + (SJUSIK * day[14]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        SMONEY = JMONEY = money;
        String[] input = br.readLine().split(" ");
        int[] day = new int[15];
        for(int i=0; i< input.length; i++){
            day[i+1] = Integer.parseInt(input[i]);
        }
        int j = j(day);
        int s = s(day);
        System.out.println(j > s ? "BNP" : j == s ? "SAMESAME" : "TIMING");

    }
}

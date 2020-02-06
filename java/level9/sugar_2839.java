package java.level9;

import java.util.Scanner;

// 끝자리 0이면 5*((N/5)-0)+3*0
// 끝자리 1이면 5*((N/5)-1)+3*2
// 끝자리 2이면 5*((N/5)-2)+3*4
// 끝자리 3이면 5*((N/5)-0)+3*1
// 끝자리 4이면 5*((N/5)-1)+3*3
// 끝자리 5이면 5*((N/5)-0)+3*0
// 끝자리 6이면 5*((N/5)-1)+3*2
// 끝자리 7이면 5*((N/5)-2)+3*4
// 끝자리 8이면 5*((N/5)-0)+3*1
// 끝자리 9이면 5*((N/5)-1)+3*3



public class sugar_2839 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //각끝자리별로 다른 숫자부분은 배열에 삽입
        int[][] va = {{0,0},{1,2},{2,4},{0,1},{1,3},{0,0},{1,2},{2,4},{0,1},{1,3}};
        int num = s.nextInt();
        int na = num%10;
        if ((num/5)-va[na][0] < 0) {
            System.out.println(-1);
        }else{
//            System.out.println("5 : "+((num/5)-va[na][0]));
//            System.out.println("3 : "+va[na][1]);
            System.out.println(((num/5)-va[na][0])+va[na][1]);
        }
    }
}

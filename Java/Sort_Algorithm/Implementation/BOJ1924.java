package Implementation;

import java.io.*;

public class BOJ1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 모든 요일 다 구해놓고 찾기 더 아래쪽에 작성된 코드가 더 효율적일 것이다.

//        String[] input = br.readLine().split(" ");
//        String[] da = {"0","MON","TUE","WED","THU","FRI","SAT","SUN"};
//        int[][] dayc = new int[13][32];
//        int[] ld = {0,31,28,31,30,31,30,31,31,30,31,30,31};
//        int month = Integer.parseInt(input[0]);
//        int day = Integer.parseInt(input[1]);
//
//        int start=1;
//        for(int i=1; i<=12; i++){
//            for(int j=1; j<=ld[i]; j++){
//                dayc[i][j] = start;
//                if(start == 7) start = 1;
//                else start++;
//            }
//        }
//        bw.write(da[dayc[month][day]]);
//        bw.close();
//        br.close();


        // 더 효율적인 방법 이게 더 좋을것이다.

        String[] input = br.readLine().split(" ");
        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);

        String[] da = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] ld = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i=0; i<month-1; i++){
            day += ld[i];
        }

        bw.write(da[day % 7]);
        bw.close();
        br.close();
    }
}

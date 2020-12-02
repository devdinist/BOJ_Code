import java.io.*;
import java.util.Arrays;

public class SeogangMuscleMan_20300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int casee = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        long[] long_num = new long[casee];
        for(int i=0; i<casee; i++){
            long_num[i] = Long.parseLong(num[i]);
        }
        Arrays.sort(long_num);
        boolean is_odd = casee % 2 != 0;
        long res = 0;
        if(is_odd){
            for(int i=0; i<casee/2; i++){
                res = Math.max(res,long_num[i] + long_num[(long_num.length-2)-i]);
            }
            res = Math.max(res,long_num[long_num.length-1]);
        }else{
            for(int i=0; i<casee/2; i++){
                res = Math.max(res,long_num[i] + long_num[(long_num.length-1)-i]);
            }
        }
        bw.write(res+"");
        bw.close();
        br.close();

    }
}

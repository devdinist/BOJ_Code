package Greedy;

import java.io.*;

public class BOJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] init_input = br.readLine().split(" ");
        int case_num = Integer.parseInt(init_input[0]);
        int goal = Integer.parseInt(init_input[1]);
        int start_idx = case_num-1;
        int sum = 0,count = 0;
        boolean is_set = false;

        int[] money = new int[case_num];
        for(int i=0; i<case_num; i++){
            money[i] = Integer.parseInt(br.readLine());
            if(!is_set && money[i] >= goal){
                start_idx = i;
                is_set = true;
            }
        }

        for(int i=start_idx; i>=0; i--){
            if(sum + money[i] == goal){
                count++;
                break;
            }
            if(goal / money[i] != 0){
                sum += money[i] * (goal / money[i]);
                count += (goal / money[i]);
                goal %= money[i];
            }
        }
        System.out.print(count);
    }
}

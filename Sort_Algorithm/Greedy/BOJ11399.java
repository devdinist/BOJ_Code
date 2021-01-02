package Greedy;

import java.io.*;
import java.util.Arrays;

public class BOJ11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int people = Integer.parseInt(br.readLine());
        int sum = 0;

        int[] people_time = new int[people];
        int[] people_res = new int[people];

        String[] input = br.readLine().split(" ");
        for(int i=0; i<people; i++){
            people_time[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(people_time);
        people_res[0] = people_time[0];
        sum += people_res[0];

        for(int i=1; i<people_time.length; i++){
            people_res[i] = people_res[i-1] + people_time[i];
            sum += people_res[i];
        }

        System.out.print(sum);
    }
}

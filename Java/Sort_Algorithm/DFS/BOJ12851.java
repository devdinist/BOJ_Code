package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Point12851{
    int point;
    int count;
    public Point12851(int point, int count){
        this.point = point;
        this.count = count;
    }
}

public class BOJ12851{

    static Queue<Point12851> q = new LinkedList<>();
    static boolean[] v = new boolean[100001];
    static int[] arr = {-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int start_num = Integer.parseInt(input[0]);
        int find_num = Integer.parseInt(input[1]);
        int find = 0 ,res = 0;

        q.add(new Point12851(start_num,0));
        while(!q.isEmpty()){
            Point12851 pp = q.poll();
            v[pp.point] = true;
            if(res != 0 && res < pp.count) continue;

            if(res != 0 && pp.point == find_num && res == pp.count){
                find++;
            }

            if(pp.point == find_num && res == 0){
                find++;
                res = pp.count;
            }

            for(int i=0; i<arr.length+1; i++){
                int idx = i < 2 ? pp.point + arr[i] : pp.point * 2;
                if(idx >= 0 && idx < 100001 && !v[idx]){
                    q.add(new Point12851(idx,pp.count + 1));
                }
            }
        }

        System.out.println(res);
        System.out.println(find);
    }
}
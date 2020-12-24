package DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Point{
    int x;
    int y;
    int count = 0;
    boolean visited = false;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}


public class MIRO2178 {

    static int[] move_x = {0,0,-1,1};    //상 하 좌 우
    static int[] move_y = {-1,1,0,0};   //상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] xy = br.readLine().split(" ");
        int x = Integer.parseInt(xy[0]);
        int y = Integer.parseInt(xy[1]);
        int result = 0;

        Point[][] ground = new Point[x+1][y+1];
        Queue<Point> q = new LinkedList<>();

        for(int i=1; i<=x; i++){
            String[] input = br.readLine().split("");
            for(int j = 1; j<=y; j++){
                if(Integer.parseInt(input[j-1]) == 0){
                    ground[i][j] = null;
                }else{
                    ground[i][j] = new Point(i,j);
                }
            }
        }
        q.add(ground[1][1]);
        ground[1][1].count = 1;


        while(!q.isEmpty()){
            Point p = q.poll();
            if(p.x == x && p.y == y){
                result = p.count;
                break;
            }
            for(int i=0; i< move_x.length; i++){
                if(p.visited) break;
                int xx = p.x + move_x[i];
                int yy = p.y + move_y[i];
                if(xx < 1 || yy < 1 || xx > x || yy > y){
                    continue;
                }else{
                    if(ground[xx][yy] == null){
                        continue;
                    }else{
                        if(!ground[xx][yy].visited){
                            q.add(ground[xx][yy]);
                            ground[xx][yy].count = p.count + 1;
                        }
                    }
                }
            }
            p.visited = true;
        }
        bw.write(result+"");
        bw.close();
        br.close();
    }
}
